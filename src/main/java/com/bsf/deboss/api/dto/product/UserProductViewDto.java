package com.bsf.deboss.api.dto.product;

import com.bsf.deboss.api.dto.user.UserSellerDto;
import com.bsf.deboss.api.dto.util.PictureDto;
import com.bsf.deboss.api.dto.util.ProductPriceDto;
import com.bsf.deboss.api.dto.util.ProductStatusEnum;

import java.time.LocalDateTime;
import java.util.List;

public class UserProductViewDto {
    private Long id;
    private String address;
    private String countryCode;
    private Integer brandId;
    private Integer categoryId;
    private ProductPriceDto price;
    private LocalDateTime dateUpdated;
    private String description;
    private List<List<PictureDto>> pictures;
    private ProductStatusEnum status;
    private List<UserProductViewVideoDto> videos;
    private Integer variantSetId;
    private Long likeCount;
    private UserSellerDto seller;
    private List<UserProductViewSizesDto> sizes;
    private UserProductViewConditionDto condition;
    private List<UserProductViewColourDto> colour;
    private List<UserProductViewSourceDto> source;
    private List<UserProductViewStyleDto> style;
    private List<UserProductViewAgeDto> age;
    private String brand;
    private String group;
    private Object attributes;
    private String productType;
    private String gender;
    private boolean isLiked;
    private boolean isSaved;

    public UserProductViewDto() {
    }

    public UserProductViewDto(Long id, String address, String countryCode, Integer brandId, Integer categoryId, ProductPriceDto price, LocalDateTime dateUpdated, String description, List<List<PictureDto>> pictures, ProductStatusEnum status, List<UserProductViewVideoDto> videos, Integer variantSetId, Long likeCount, UserSellerDto seller, List<UserProductViewSizesDto> sizes, UserProductViewConditionDto condition, List<UserProductViewColourDto> colour, List<UserProductViewSourceDto> source, List<UserProductViewStyleDto> style, List<UserProductViewAgeDto> age, String brand, String group, Object attributes, String productType, String gender, boolean isLiked, boolean isSaved) {
        this.id = id;
        this.address = address;
        this.countryCode = countryCode;
        this.brandId = brandId;
        this.categoryId = categoryId;
        this.price = price;
        this.dateUpdated = dateUpdated;
        this.description = description;
        this.pictures = pictures;
        this.status = status;
        this.videos = videos;
        this.variantSetId = variantSetId;
        this.likeCount = likeCount;
        this.seller = seller;
        this.sizes = sizes;
        this.condition = condition;
        this.colour = colour;
        this.source = source;
        this.style = style;
        this.age = age;
        this.brand = brand;
        this.group = group;
        this.attributes = attributes;
        this.productType = productType;
        this.gender = gender;
        this.isLiked = isLiked;
        this.isSaved = isSaved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public ProductPriceDto getPrice() {
        return price;
    }

    public void setPrice(ProductPriceDto price) {
        this.price = price;
    }

    public LocalDateTime getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(LocalDateTime dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<List<PictureDto>> getPictures() {
        return pictures;
    }

    public void setPictures(List<List<PictureDto>> pictures) {
        this.pictures = pictures;
    }

    public ProductStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ProductStatusEnum status) {
        this.status = status;
    }

    public List<UserProductViewVideoDto> getVideos() {
        return videos;
    }

    public void setVideos(List<UserProductViewVideoDto> videos) {
        this.videos = videos;
    }

    public Integer getVariantSetId() {
        return variantSetId;
    }

    public void setVariantSetId(Integer variantSetId) {
        this.variantSetId = variantSetId;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public UserSellerDto getSeller() {
        return seller;
    }

    public void setSeller(UserSellerDto seller) {
        this.seller = seller;
    }

    public List<UserProductViewSizesDto> getSizes() {
        return sizes;
    }

    public void setSizes(List<UserProductViewSizesDto> sizes) {
        this.sizes = sizes;
    }

    public UserProductViewConditionDto getCondition() {
        return condition;
    }

    public void setCondition(UserProductViewConditionDto condition) {
        this.condition = condition;
    }

    public List<UserProductViewColourDto> getColour() {
        return colour;
    }

    public void setColour(List<UserProductViewColourDto> colour) {
        this.colour = colour;
    }

    public List<UserProductViewSourceDto> getSource() {
        return source;
    }

    public void setSource(List<UserProductViewSourceDto> source) {
        this.source = source;
    }

    public List<UserProductViewStyleDto> getStyle() {
        return style;
    }

    public void setStyle(List<UserProductViewStyleDto> style) {
        this.style = style;
    }

    public List<UserProductViewAgeDto> getAge() {
        return age;
    }

    public void setAge(List<UserProductViewAgeDto> age) {
        this.age = age;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean getLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public boolean getSaved() {
        return isSaved;
    }

    public void setSaved(boolean saved) {
        isSaved = saved;
    }

    @Override
    public String toString() {
        return "UserProductViewDto{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", brandId=" + brandId +
                ", categoryId=" + categoryId +
                ", price=" + price +
                ", dateUpdated=" + dateUpdated +
                ", description='" + description + '\'' +
                ", pictures=" + pictures +
                ", status=" + status +
                ", videos=" + videos +
                ", variantSetId=" + variantSetId +
                ", likeCount=" + likeCount +
                ", seller=" + seller +
                ", sizes=" + sizes +
                ", condition=" + condition +
                ", colour=" + colour +
                ", source=" + source +
                ", style=" + style +
                ", age=" + age +
                ", brand='" + brand + '\'' +
                ", group='" + group + '\'' +
                ", attributes=" + attributes +
                ", productType='" + productType + '\'' +
                ", gender='" + gender + '\'' +
                ", isLiked=" + isLiked +
                ", isSaved=" + isSaved +
                '}';
    }
}
