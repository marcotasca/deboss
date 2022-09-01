package com.bsf.deboss.bot.config;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DebossBotConfiguration {

    @JsonProperty("product_keywords")
    private List<String> productKeywords;

    public List<String> getProductKeywords() {
        return productKeywords;
    }

    public void setProductKeywords(List<String> productKeywords) {
        this.productKeywords = productKeywords;
    }
}
