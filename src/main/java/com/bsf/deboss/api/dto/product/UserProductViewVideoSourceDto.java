package com.bsf.deboss.api.dto.product;

import java.net.URL;

public class UserProductViewVideoSourceDto {
    private URL url;
    private String format;

    public UserProductViewVideoSourceDto() {}
    public UserProductViewVideoSourceDto(URL url, String format) {
        this.url = url;
        this.format = format;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "UserProductViewVideoSource{" +
                "url=" + url +
                ", format='" + format + '\'' +
                '}';
    }
}
