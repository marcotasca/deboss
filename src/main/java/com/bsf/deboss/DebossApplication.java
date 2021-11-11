package com.bsf.deboss;

import com.bsf.deboss.api.service.depopweb.DepopWebApiService;
import com.bsf.deboss.api.dto.login.LoginDto;
import com.bsf.deboss.api.dto.searchproduct.SearchProductRequestParameterDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DebossApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DebossApplication.class, args);
    }

    @Autowired
    DepopWebApiService depopWebApiService;

    Logger log = LoggerFactory.getLogger(DebossApplication.class);

    public void banana() {
        System.out.println("banana");
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Init Deboss");

        String username = System.getenv("auth.username");
        String password = System.getenv("auth.password");
        LoginDto login = new LoginDto(username, password);

        SearchProductRequestParameterDto searchProduct = new SearchProductRequestParameterDto();
        searchProduct.setWhat("Jordan 1 Mocha");
        depopWebApiService.searchProducts(searchProduct);

//        depopWebApiService
//                .getUserFollowing(240023L)
//                .log()
//                .subscribe();


//        depopWebApiService
//                .init()
//                .login(login)
//                .onErrorReturn(new TokenDto())
//                .filter(tokenDto -> tokenDto.getToken() != null)
//                .subscribe(tokenDto -> {
//
//                    log.info("[AUTH::Login] -> Token generated -> {} ", tokenDto.getToken());
//
//                    depopWebApiService.searchProducts().subscribe(searchProductDto -> {
//                        if(!searchProductDto.getProducts().isEmpty()) {
//                            ProductDto productDto = searchProductDto.getProducts().get(0);
//                            System.out.println(productDto);
//                            depopWebApiService.getProductByName(tokenDto.getToken(), productDto.getSlug()).subscribe(userProductViewDto -> {
//                                System.out.println(userProductViewDto);
//                                depopWebApiService.getMyRelationshipWithUser(tokenDto.getToken(), userProductViewDto.getSeller().getId()).subscribe(followRelationship -> {
//                                    System.out.println(followRelationship);
//
//                                    System.out.println("Follow");
//                                    depopWebApiService.followUser(tokenDto.getToken(), userProductViewDto.getSeller().getId()).subscribe();
//
//
//                                });
//                            });
//                        }
//                    });
//                });
    }

}
