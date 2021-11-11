package com.bsf.deboss.api.service.depopweb;

import com.bsf.deboss.api.config.EndpointConfig;
import com.bsf.deboss.api.dto.follow.FollowRelationship;
import com.bsf.deboss.api.dto.login.LoginDto;
import com.bsf.deboss.api.dto.login.TokenDto;
import com.bsf.deboss.api.dto.product.UserProductViewDto;
import com.bsf.deboss.api.dto.searchproduct.SearchProductDto;
import com.bsf.deboss.api.dto.searchproduct.SearchProductRequestParameterDto;
import com.bsf.deboss.api.dto.user.UserFollowerFollowingDto;
import com.bsf.deboss.api.dto.user.UserFollowerFollowingRequestParameterDto;
import com.bsf.deboss.api.service.queryparameter.QueryParameterApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class DepopWebApiServiceImpl implements DepopWebApiService {

    private final WebClient webClient;

    private final EndpointConfig endpointConfig;

    @Autowired
    QueryParameterApiService queryParameterApiService;

    @Autowired
    public DepopWebApiServiceImpl(WebClient.Builder builder) {
        this.endpointConfig = new EndpointConfig();
        this.webClient = builder
                .baseUrl(endpointConfig.getBASE())
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Override
    public Mono<TokenDto> login(LoginDto loginDto) {
        return webClient
                .post()
                .uri(endpointConfig.getVersionOne().getLogin())
                .body(Mono.just(loginDto), LoginDto.class)
                .retrieve()
                .bodyToMono(TokenDto.class);
    }

    @Override
    public Mono<SearchProductDto> searchProducts(SearchProductRequestParameterDto search) {
        return webClient
                .get()
                .uri(
                        endpointConfig.getVersionTwo().getSearchProducts(),
                        uriBuilder -> queryParameterApiService.createSearchQueryParametersForProducts(uriBuilder, search).build()
                )
                .retrieve()
                .bodyToMono(SearchProductDto.class);
    }

    @Override
    public Mono<SearchProductDto> searchProducts() {
        return searchProducts(null);
    }

    @Override
    public Mono<UserProductViewDto> getProductByName(String bearerToken, String productName) {
        return webClient
                .get()
                .uri(endpointConfig.getVersionTwo().getGetProductByName(productName))
                .header("Authorization", "Bearer " + bearerToken)
                .retrieve()
                .bodyToMono(UserProductViewDto.class);
    }

    @Override
    public Mono<FollowRelationship> getMyRelationshipWithUser(String bearerToken, Long contactId) {
        return webClient
                .get()
                .uri(endpointConfig.getVersionOne().getGetMyRelationshipWithUser(contactId))
                .header("Authorization", "Bearer " + bearerToken)
                .retrieve()
                .bodyToMono(FollowRelationship.class);
    }

    @Override
    public Mono<Void> followUser(String bearerToken, Long userId) {
         return webClient
                .put()
                .uri(endpointConfig.getVersionOne().followUser(userId))
                .header("Authorization", "Bearer " + bearerToken)
                .retrieve()
                .bodyToMono(Void.class);
    }

    @Override
    public Mono<Void> unfollowUser(String bearerToken, Long userId) {
        return webClient
                .delete()
                .uri(endpointConfig.getVersionOne().unfollowUser(userId))
                .header("Authorization", "Bearer " + bearerToken)
                .retrieve()
                .bodyToMono(Void.class);
    }

    @Override
    public Mono<Void> likeProduct(String bearerToken, Long productId) {
        return webClient
                .put()
                .uri(endpointConfig.getVersionOne().likeProduct(productId))
                .header("Authorization", "Bearer " + bearerToken)
                .retrieve()
                .bodyToMono(Void.class);
    }

    @Override
    public Mono<Void> unlikeProduct(String bearerToken, Long productId) {
        return webClient
                .delete()
                .uri(endpointConfig.getVersionOne().unlikeProduct(productId))
                .header("Authorization", "Bearer " + bearerToken)
                .retrieve()
                .bodyToMono(Void.class);
    }

    @Override
    public Mono<UserFollowerFollowingDto> getUserFollower(Long userId, UserFollowerFollowingRequestParameterDto search) {
        return webClient
                .get()
                .uri(
                        endpointConfig.getVersionOne().getUserFollower(userId),
                        uriBuilder -> queryParameterApiService.createSearchQueryParametersForUserFollowerFollowing(uriBuilder, search).build()
                )
                .retrieve()
                .bodyToMono(UserFollowerFollowingDto.class);
    }

    @Override
    public Mono<UserFollowerFollowingDto> getUserFollower(Long userId) {
        return getUserFollower(userId, null);
    }

    @Override
    public Mono<UserFollowerFollowingDto> getUserFollowing(Long userId, UserFollowerFollowingRequestParameterDto search) {
        return webClient
                .get()
                .uri(
                        endpointConfig.getVersionOne().getUserFollowing(userId),
                        uriBuilder -> queryParameterApiService.createSearchQueryParametersForUserFollowerFollowing(uriBuilder, search).build()
                )
                .retrieve()
                .bodyToMono(UserFollowerFollowingDto.class);
    }

    @Override
    public Mono<UserFollowerFollowingDto> getUserFollowing(Long userId) {
        return getUserFollowing(userId);
    }

}
