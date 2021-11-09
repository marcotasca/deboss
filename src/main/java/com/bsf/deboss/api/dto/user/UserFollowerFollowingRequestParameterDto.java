package com.bsf.deboss.api.dto.user;

public class UserFollowerFollowingRequestParameterDto {

    public enum Placeholder {
        LIMIT("limit"),
        LAST_OFFSET_ID("last_offset_id");

        private String placeholder;
        Placeholder(String placeholder) {
            this.placeholder = placeholder;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }
    }

    private String limit;
    private String lastOffsetId;

    public UserFollowerFollowingRequestParameterDto() {
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getLastOffsetId() {
        return lastOffsetId;
    }

    public void setLastOffsetId(String lastOffsetId) {
        this.lastOffsetId = lastOffsetId;
    }
}
