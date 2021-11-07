package com.bsf.deboss.api.dto.user;

import com.bsf.deboss.api.dto.util.PictureDto;

import java.time.LocalDateTime;
import java.util.List;

public class UserSellerDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String initials;
    private String username;
    private boolean verified;
    private Long reviewsRating;
    private Long reviewsTotal;
    private Long itemsSold;
    private LocalDateTime lastSeen;
    private List<PictureDto> pictureDto;

    public UserSellerDto() {}
    public UserSellerDto(Long id, String firstName, String lastName, String initials, String username, boolean verified, Long reviewsRating, Long reviewsTotal, Long itemsSold, LocalDateTime lastSeen, List<PictureDto> pictureDto) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.initials = initials;
        this.username = username;
        this.verified = verified;
        this.reviewsRating = reviewsRating;
        this.reviewsTotal = reviewsTotal;
        this.itemsSold = itemsSold;
        this.lastSeen = lastSeen;
        this.pictureDto = pictureDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean getVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public Long getReviewsRating() {
        return reviewsRating;
    }

    public void setReviewsRating(Long reviewsRating) {
        this.reviewsRating = reviewsRating;
    }

    public Long getReviewsTotal() {
        return reviewsTotal;
    }

    public void setReviewsTotal(Long reviewsTotal) {
        this.reviewsTotal = reviewsTotal;
    }

    public Long getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(Long itemsSold) {
        this.itemsSold = itemsSold;
    }

    public LocalDateTime getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(LocalDateTime lastSeen) {
        this.lastSeen = lastSeen;
    }

    public List<PictureDto> getPicture() {
        return pictureDto;
    }

    public void setPicture(List<PictureDto> pictureDto) {
        this.pictureDto = pictureDto;
    }

    @Override
    public String toString() {
        return "UserSeller{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", initials='" + initials + '\'' +
                ", username='" + username + '\'' +
                ", verified=" + verified +
                ", reviewsRating=" + reviewsRating +
                ", reviewsTotal=" + reviewsTotal +
                ", itemsSold=" + itemsSold +
                ", lastSeen=" + lastSeen +
                ", pictureDto=" + pictureDto +
                '}';
    }
}
