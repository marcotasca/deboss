package com.bsf.deboss.api.dto.product;

import java.util.List;

public class UserProductViewVideoDto {
    private List<UserProductViewVideoSourceDto> sources;
    private List<UserProductViewVideoThumbnailDto> thumbnails;

    public UserProductViewVideoDto() {}

    public UserProductViewVideoDto(List<UserProductViewVideoSourceDto> sources, List<UserProductViewVideoThumbnailDto> thumbnails) {
        this.sources = sources;
        this.thumbnails = thumbnails;
    }

    public List<UserProductViewVideoSourceDto> getSources() {
        return sources;
    }

    public void setSources(List<UserProductViewVideoSourceDto> sources) {
        this.sources = sources;
    }

    public List<UserProductViewVideoThumbnailDto> getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(List<UserProductViewVideoThumbnailDto> thumbnails) {
        this.thumbnails = thumbnails;
    }

    @Override
    public String toString() {
        return "UserProductViewVideoDto{" +
                "sources=" + sources +
                ", thumbnails=" + thumbnails +
                '}';
    }
}
