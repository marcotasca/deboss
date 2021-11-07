package com.bsf.deboss.api.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.net.URL;
import java.util.LinkedHashMap;

public class UserFollowerFollowingPeopleDto {

    private Long id;

    private String username;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    private boolean verified;

    private String bio;

    private String initials;

    private LinkedHashMap<String, URL> picture;

    private String website;

    @JsonProperty("is_following")
    private boolean isFollowing;

    public UserFollowerFollowingPeopleDto() {
    }

    public UserFollowerFollowingPeopleDto(Long id, String username, String firstName, String lastName, boolean verified, String bio, String initials, LinkedHashMap<String, URL> picture, String website, boolean isFollowing) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.verified = verified;
        this.bio = bio;
        this.initials = initials;
        this.picture = picture;
        this.website = website;
        this.isFollowing = isFollowing;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public LinkedHashMap<String, URL> getPicture() {
        return picture;
    }

    public void setPicture(LinkedHashMap<String, URL> picture) {
        this.picture = picture;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isFollowing() {
        return isFollowing;
    }

    public void setFollowing(boolean following) {
        this.isFollowing = following;
    }

    @Override
    public String toString() {
        return "UserFollowerFollowingPeopleDto{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", verified=" + verified +
                ", bio='" + bio + '\'' +
                ", initials='" + initials + '\'' +
                ", picture=" + picture +
                ", website='" + website + '\'' +
                ", is_following=" + isFollowing +
                '}';
    }
}

