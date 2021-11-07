package com.bsf.deboss.api.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserFollowerFollowingMetaDto {

    @JsonProperty("last_offset_id")
    private String lastOffsetId;

    private boolean end;

    private Integer limit;

    public UserFollowerFollowingMetaDto() {
    }

    public UserFollowerFollowingMetaDto(String lastOffsetId, boolean end, Integer limit) {
        this.lastOffsetId = lastOffsetId;
        this.end = end;
        this.limit = limit;
    }

    public String getLastOffsetId() {
        return lastOffsetId;
    }

    public void setLastOffsetId(String lastOffsetId) {
        this.lastOffsetId = lastOffsetId;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "UserFollowerFollowingMetaDto{" +
                "lastOffsetId='" + lastOffsetId + '\'' +
                ", end=" + end +
                ", limit=" + limit +
                '}';
    }
}
