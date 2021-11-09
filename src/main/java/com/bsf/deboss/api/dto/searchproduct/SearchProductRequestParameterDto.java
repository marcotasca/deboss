package com.bsf.deboss.api.dto.searchproduct;

public class SearchProductRequestParameterDto {

    public enum Placeholder {
        WHAT("what"),
        ITEMS_PER_PAGE("items_per_page"),
        COUNTRY("country"),
        CURRENCY("currency");

        private String placeholder;
        Placeholder(String placeholder) {
            this.placeholder = placeholder;
        }
        public String getPlaceholder() {
            return this.placeholder;
        }
    }

    private String what;
    private Integer itemsPerPage;
    private String country;
    private String currency;

    public SearchProductRequestParameterDto() {
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
