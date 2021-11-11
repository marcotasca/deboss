package com.bsf.deboss.api.service.depopweb;

import com.bsf.deboss.api.dto.follow.FollowRelationship;
import com.bsf.deboss.api.dto.login.LoginDto;
import com.bsf.deboss.api.dto.login.TokenDto;
import com.bsf.deboss.api.dto.product.UserProductViewDto;
import com.bsf.deboss.api.dto.searchproduct.SearchProductDto;
import com.bsf.deboss.api.dto.searchproduct.SearchProductRequestParameterDto;
import com.bsf.deboss.api.dto.user.UserFollowerFollowingDto;
import com.bsf.deboss.api.dto.user.UserFollowerFollowingRequestParameterDto;
import reactor.core.publisher.Mono;

public interface DepopWebApiService {
    TokenDto login(LoginDto loginDto);
    SearchProductDto searchProducts(SearchProductRequestParameterDto search);
    SearchProductDto searchProducts();
    UserProductViewDto getProductByName(String bearerToken, String productName);
    FollowRelationship getMyRelationshipWithUser(String bearerToken, Long contactId);
    Void followUser(String bearerToken, Long userId);
    Void unfollowUser(String bearerToken, Long userId);
    Void likeProduct(String bearerToken, Long productId);
    Void unlikeProduct(String bearerToken, Long productId);
    UserFollowerFollowingDto getUserFollower(Long userId, UserFollowerFollowingRequestParameterDto search);
    UserFollowerFollowingDto getUserFollower(Long userId);
    UserFollowerFollowingDto getUserFollowing(Long userId, UserFollowerFollowingRequestParameterDto search);
    UserFollowerFollowingDto getUserFollowing(Long userId);
}
