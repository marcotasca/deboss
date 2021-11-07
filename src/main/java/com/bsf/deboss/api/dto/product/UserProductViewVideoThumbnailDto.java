package com.bsf.deboss.api.dto.product;

import java.net.URL;

public class UserProductViewVideoThumbnailDto {
    private URL url;
    private Integer height;
    private Integer width;

    public UserProductViewVideoThumbnailDto() {}
    public UserProductViewVideoThumbnailDto(URL url, Integer height, Integer width) {
        this.url = url;
        this.height = height;
        this.width = width;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "UserProductViewVideoThumbnail{" +
                "url=" + url +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
