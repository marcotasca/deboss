package com.bsf.deboss.api.dto.searchproduct;

import java.util.List;

public class SearchProductDto {
    private MetaDto metaDto;
    private List<ProductDto> products;

    public SearchProductDto() {}
    public SearchProductDto(MetaDto metaDto, List<ProductDto> products) {
        this.metaDto = metaDto;
        this.products = products;
    }

    public MetaDto getMetaDto() {
        return metaDto;
    }

    public void setMetaDto(MetaDto metaDto) {
        this.metaDto = metaDto;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "SearchProductDto{" +
                "metaDto=" + metaDto +
                ", products=" + products +
                '}';
    }
}
