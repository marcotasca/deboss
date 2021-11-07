package com.bsf.deboss.api.dto.product;

public class UserProductViewVideoDto {
    private UserProductViewVideoSourceDto sources;
    private UserProductViewVideoThumbnailDto thumbnails;

    public UserProductViewVideoDto() {}

    public UserProductViewVideoDto(UserProductViewVideoSourceDto sources, UserProductViewVideoThumbnailDto thumbnails) {
        this.sources = sources;
        this.thumbnails = thumbnails;
    }

    public UserProductViewVideoSourceDto getSources() {
        return sources;
    }

    public void setSources(UserProductViewVideoSourceDto sources) {
        this.sources = sources;
    }

    public UserProductViewVideoThumbnailDto getThumbnails() {
        return thumbnails;
    }

    public void setThumbnails(UserProductViewVideoThumbnailDto thumbnails) {
        this.thumbnails = thumbnails;
    }

    @Override
    public String toString() {
        return "UserProductViewVideo{" +
                "sources=" + sources +
                ", thumbnails=" + thumbnails +
                '}';
    }
}
