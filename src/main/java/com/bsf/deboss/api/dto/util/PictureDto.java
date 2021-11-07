package com.bsf.deboss.api.dto.util;

import java.net.URL;

public class PictureDto {
    private Long id;
    private Integer width;
    private Integer height;
    private URL url;

    public PictureDto() {}
    public PictureDto(Long id, Integer width, Integer height, URL url) {
        this.id = id;
        this.width = width;
        this.height = height;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", width=" + width +
                ", height=" + height +
                ", url=" + url +
                '}';
    }
}
