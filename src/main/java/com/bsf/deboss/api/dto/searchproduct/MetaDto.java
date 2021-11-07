package com.bsf.deboss.api.dto.searchproduct;

public class MetaDto {
    private Integer resultCount;
    private String cursor;
    private Boolean hasMore;
    private Long totalCount;

    public MetaDto() {}
    public MetaDto(Integer resultCount, String cursor, Boolean hasMore, Long totalCount) {
        this.resultCount = resultCount;
        this.cursor = cursor;
        this.hasMore = hasMore;
        this.totalCount = totalCount;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Boolean getHasMore() {
        return hasMore;
    }

    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "MetaDto{" +
                "resultCount=" + resultCount +
                ", cursor='" + cursor + '\'' +
                ", hasMore=" + hasMore +
                ", totalCount=" + totalCount +
                '}';
    }
}
