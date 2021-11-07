package com.bsf.deboss.api.dto.searchproduct;

import com.bsf.deboss.api.dto.util.ProductPriceDto;
import com.bsf.deboss.api.dto.util.ProductStatusEnum;

import java.net.URL;
import java.util.LinkedHashMap;

public class ProductDto {
    private Long id;
    private String slug;
    private ProductStatusEnum status;
    private Boolean hasVideo;
    private ProductPriceDto price;
    private LinkedHashMap<String, URL> preview;

    public ProductDto() {}
    public ProductDto(Long id, String slug, ProductStatusEnum status, Boolean hasVideo, ProductPriceDto price, LinkedHashMap<String, URL> preview) {
        this.id = id;
        this.slug = slug;
        this.status = status;
        this.hasVideo = hasVideo;
        this.price = price;
        this.preview = preview;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public ProductStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ProductStatusEnum status) {
        this.status = status;
    }

    public Boolean getHasVideo() {
        return hasVideo;
    }

    public void setHasVideo(Boolean hasVideo) {
        this.hasVideo = hasVideo;
    }

    public ProductPriceDto getPrice() {
        return price;
    }

    public void setPrice(ProductPriceDto price) {
        this.price = price;
    }

    public LinkedHashMap<String, URL> getPreview() {
        return preview;
    }

    public void setPreview(LinkedHashMap<String, URL> preview) {
        this.preview = preview;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id=" + id +
                ", slug='" + slug + '\'' +
                ", status=" + status +
                ", hasVideo=" + hasVideo +
                ", price=" + price +
                ", preview=" + preview +
                '}';
    }
}
