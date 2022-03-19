package com.example.c1d3;

public class Items {
    private String itemName;
    private int itemimage ;
    private double itemPrice ;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemimage() {
        return itemimage;
    }

    public void setItemimage(int itemimage) {
        this.itemimage = itemimage;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Items(String itemName, int itemimage, double itemPrice) {
        this.itemName = itemName;
        this.itemimage = itemimage;
        this.itemPrice = itemPrice;
    }
}
