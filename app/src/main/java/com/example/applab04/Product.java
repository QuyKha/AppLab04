package com.example.applab04;

public class Product {
    private String name;
    private int id;
    private String shopName;

    public Product( String name, int id, String shopName) {
        this.name = name;
        this.id = id;
        this.shopName = shopName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


}
