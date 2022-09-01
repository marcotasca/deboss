package com.bsf.deboss.bot.service.deboss;

import com.bsf.deboss.DebossApplication;
import com.bsf.deboss.api.dto.follow.FollowRelationship;
import com.bsf.deboss.api.dto.login.LoginDto;
import com.bsf.deboss.api.dto.product.UserProductViewDto;
import com.bsf.deboss.api.dto.searchproduct.SearchProductRequestParameterDto;
import com.bsf.deboss.api.service.depopweb.DepopWebApiService;
import com.bsf.deboss.bot.config.DebossConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class DebossBotServiceImpl implements DebossBotService {

    Logger log = LoggerFactory.getLogger(DebossApplication.class);

    @Autowired
    DepopWebApiService depopWebApiService;

    public void sleepBeforeNextOperation(int min, int max) {
        try {
            Thread.sleep(((int) (Math.random()*(max - min))) + min);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getTokenAccess(String username, String password) {
        return depopWebApiService.login(new LoginDto(username, password)).getToken();
    }

    @Override
    public void followContactsByProductKeywords(String token, List<String> keywords) {
        log.info("[TASK] Deboss::followContactsByProductKeywords -> INIT");
        log.info("Token -> {}", token);
        keywords.forEach(keyword -> {
            SearchProductRequestParameterDto search = new SearchProductRequestParameterDto();
            search.setWhat(keyword);
            depopWebApiService.searchProducts(search).getProducts().forEach(productDto -> {
                UserProductViewDto userProductViewDto = depopWebApiService.getProductByName(token, productDto.getSlug());
                depopWebApiService.followUser(token, userProductViewDto.getSeller().getId());
                log.info(
                        "[TASK] Deboss::followContactsByProductKeywords -> Followed [{}] (ID: {}) at {}",
                        userProductViewDto.getSeller().getUsername(),
                        userProductViewDto.getSeller().getId(),
                        LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
                );
                FollowRelationship followRelationship = depopWebApiService.getMyRelationshipWithUser(token, userProductViewDto.getSeller().getId());
                log.info(
                        "{}",
                        followRelationship.toString()
                );
                sleepBeforeNextOperation((int) (Math.random()*(35000 - 20000)) + 20000, (int) (Math.random()*(55000 - 35000)) + 35000);
            });
        });
    }
}
