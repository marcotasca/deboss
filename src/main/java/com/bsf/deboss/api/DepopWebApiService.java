package com.bsf.deboss.api;

import com.bsf.deboss.api.dto.follow.FollowRelationship;
import com.bsf.deboss.api.dto.login.LoginDto;
import com.bsf.deboss.api.dto.login.TokenDto;
import com.bsf.deboss.api.dto.product.UserProductViewDto;
import com.bsf.deboss.api.dto.searchproduct.SearchProductDto;
import com.bsf.deboss.api.dto.user.UserFollowerFollowingDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DepopWebApiService {
    Mono<TokenDto> login(LoginDto loginDto);
    Flux<SearchProductDto> searchProducts();
    Mono<UserProductViewDto> getProductByName(String bearerToken, String productName);
    Mono<FollowRelationship> getMyRelationshipWithUser(String bearerToken, Long contactId);
    Mono<Void> followUser(String bearerToken, Long userId);
    Mono<Void> unfollowUser(String bearerToken, Long userId);
    Mono<Void> likeProduct(String bearerToken, Long productId);
    Mono<Void> unlikeProduct(String bearerToken, Long productId);
    Mono<UserFollowerFollowingDto> getUserFollower(Long userId);
    Mono<UserFollowerFollowingDto> getUserFollowing(Long userId);
}
