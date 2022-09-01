package com.bsf.deboss.api.dto.util;

public enum ProductStatusEnum {
    ONSALE("ONSALE"),
    PURCHASED("PURCHASED"),
    MARKED_AS_SOLD("MARKED_AS_SOLD"),
    DELETED_ONSALE("DELETED_ONSALE"),
    DELETED_PURCHASED("DELETED_PURCHASED"),
    DELETED_MARKED_AS_SOLD("DELETED_MARKED_AS_SOLD");

    private final String productStatus;
    ProductStatusEnum(String productStatus) {
        this.productStatus = productStatus;
    }
    public String getStatus() {
        return this.productStatus;
    }
}
