package com.bsf.deboss.api.config;

import org.springframework.stereotype.Component;

@Component
public class EndpointConfig {
    private final String BASE = "https://webapi.depop.com/api/";
    private final V1 versionOne = new V1();
    private final V2 versionTwo = new V2();

    public final class V1 {
        public V1() {
        }

        public String getLogin() {
            return BASE + "/v1/auth/login";
        }

        public String getGetMyRelationshipWithUser(Long userId) {
            return BASE + "/v1/follows/relationship/" + userId;
        }

        public String followUser(Long userId) {
            return BASE + "/v1/follows/"  + userId;
        }

        public String unfollowUser(Long userId) {
            return BASE + "/v1/follows/" + userId;
        }

        public String likeProduct(Long productId) {
            return BASE + "/v1/likes/" + productId;
        }

        public String unlikeProduct(Long productId) {
            return BASE + "/v1/likes/" + productId;
        }

        public String getUserFollowing(Long userId) {
            return BASE + "/v1/user/" + userId + "/following/";
        }

        public String getUserFollower(Long userId) {
            return BASE + "/v1/user/" + userId + "/following/";
        }
    }

    public final class V2 {
        public String getSearchProducts() {
            return BASE + "/v2/search/products";
        }

        public String getGetProductByName(String productName) {
            String getProductByName = BASE + "/v2/product/userProductView/";
            return getProductByName + productName;
        }
    }

    public EndpointConfig() {
    }

    public String getBASE() {
        return BASE;
    }

    public V1 getVersionOne() {
        return versionOne;
    }

    public V2 getVersionTwo() {
        return versionTwo;
    }
}
