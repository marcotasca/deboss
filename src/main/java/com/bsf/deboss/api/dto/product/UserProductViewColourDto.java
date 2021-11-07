package com.bsf.deboss.api.dto.product;

public class UserProductViewColourDto {
    private String id;
    private String name;

    public UserProductViewColourDto() {}

    public UserProductViewColourDto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserProductViewColour{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
