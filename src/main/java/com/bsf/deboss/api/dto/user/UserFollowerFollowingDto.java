package com.bsf.deboss.api.dto.user;

import java.util.List;

public class UserFollowerFollowingDto {
    private UserFollowerFollowingMetaDto meta;
    private List<UserFollowerFollowingPeopleDto> objects;

    public UserFollowerFollowingDto() {
    }

    public UserFollowerFollowingDto(UserFollowerFollowingMetaDto meta, List<UserFollowerFollowingPeopleDto> objects) {
        this.meta = meta;
        this.objects = objects;
    }

    public UserFollowerFollowingMetaDto getMeta() {
        return meta;
    }

    public void setMeta(UserFollowerFollowingMetaDto meta) {
        this.meta = meta;
    }

    public List<UserFollowerFollowingPeopleDto> getObjects() {
        return objects;
    }

    public void setObjects(List<UserFollowerFollowingPeopleDto> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "UserFollowerFollowingDto{" +
                "meta=" + meta +
                ", objects=" + objects +
                '}';
    }
}
