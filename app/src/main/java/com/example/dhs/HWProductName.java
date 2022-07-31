package com.example.dhs;

public class HWProductName {

    private String ProductName;
    private String ProductDescription;
    private int ProductImage;

    public HWProductName(String ProductName, String ProductDescription, int ProductImage) {
        this.ProductName = ProductName;
        this.ProductDescription = ProductDescription;
        this.ProductImage = ProductImage;

    }

    public String getFlowerName() {
        return ProductName;
    }

    public String getFlowerDescription() {
        return ProductDescription;
    }

    public int getFlowerImage() {
        return ProductImage;
    }
}
