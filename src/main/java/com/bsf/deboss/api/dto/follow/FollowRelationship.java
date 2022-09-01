package com.bsf.deboss.api.dto.follow;

public class FollowRelationship {
    private boolean isFollowedBy;
    private boolean isFollowing;

    public FollowRelationship() {
    }

    public FollowRelationship(boolean isFollowedBy, boolean isFollowing) {
        setFollowedBy(isFollowedBy);
        setFollowing(isFollowing);
    }

    public boolean isFollowedBy() {
        return isFollowedBy;
    }

    public void setFollowedBy(boolean followedBy) {
        isFollowedBy = followedBy;
    }

    public boolean isFollowing() {
        return isFollowing;
    }

    public void setFollowing(boolean following) {
        isFollowing = following;
    }

    @Override
    public String toString() {
        return "FollowRelationship{" +
                "isFollowedBy=" + isFollowedBy() +
                ", isFollowing=" + isFollowing() +
                '}';
    }
}
