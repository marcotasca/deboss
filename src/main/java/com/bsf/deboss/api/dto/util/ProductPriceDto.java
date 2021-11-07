package com.bsf.deboss.api.dto.util;

public class ProductPriceDto {
    private String priceAmount;
    private String currencyName;
    private String nationalShippingCost;
    private String internationShippingCost;
    private String discountedPriceAmount;
    private String discountPercentage;

    public ProductPriceDto() {}

    public ProductPriceDto(String priceAmount, String currencyName, String nationalShippingCost, String internationShippingCost, String discountedPriceAmount, String discountPercentage) {
        this.priceAmount = priceAmount;
        this.currencyName = currencyName;
        this.nationalShippingCost = nationalShippingCost;
        this.internationShippingCost = internationShippingCost;
        this.discountedPriceAmount = discountedPriceAmount;
        this.discountPercentage = discountPercentage;
    }

    public String getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(String priceAmount) {
        this.priceAmount = priceAmount;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getNationalShippingCost() {
        return nationalShippingCost;
    }

    public void setNationalShippingCost(String nationalShippingCost) {
        this.nationalShippingCost = nationalShippingCost;
    }

    public String getInternationShippingCost() {
        return internationShippingCost;
    }

    public void setInternationShippingCost(String internationShippingCost) {
        this.internationShippingCost = internationShippingCost;
    }

    public String getDiscountedPriceAmount() {
        return discountedPriceAmount;
    }

    public void setDiscountedPriceAmount(String discountedPriceAmount) {
        this.discountedPriceAmount = discountedPriceAmount;
    }

    public String getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @Override
    public String toString() {
        return "ProductPriceDto{" +
                "priceAmount='" + priceAmount + '\'' +
                ", currencyName='" + currencyName + '\'' +
                ", nationalShippingCost='" + nationalShippingCost + '\'' +
                ", internationShippingCost='" + internationShippingCost + '\'' +
                ", discountedPriceAmount='" + discountedPriceAmount + '\'' +
                ", discountPercentage='" + discountPercentage + '\'' +
                '}';
    }
}
