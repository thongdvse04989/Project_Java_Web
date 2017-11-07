/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

/**
 *
 * @author quach
 */
public class ShowFrameLeft {

    private int producid;
    private String productName;
    private String image;
    private double price;
    private int quantity;

    public ShowFrameLeft() {
    }

    public ShowFrameLeft(int producid, String productName, String image, double price, int quantity) {
        this.producid = producid;
        this.productName = productName;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProducid() {
        return producid;
    }

    public void setProducid(int producid) {
        this.producid = producid;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

}
