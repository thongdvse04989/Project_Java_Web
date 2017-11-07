/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DoThong
 */
public class Cart {
    List<CartItem> cart;

    public Cart() {
        cart = new ArrayList<>();
    }

    public Cart(List<CartItem> cart) {
        this.cart = cart;
    }
    public void setQuantityCartItembyID(String id,int quantity) {
        for (CartItem cartItem : cart) {
            if (cartItem.getProduct().getId() == Integer.parseInt(id)) {
                cartItem.setQuantity(quantity);
                return;
            }
        }
    }

    public List<CartItem> getCart() {
        return cart;
    }

    public void setCart(List<CartItem> cart) {
        this.cart = cart;
    }
    // add a cartitem to list
    public void addCartItem(CartItem ci) {
        for (CartItem x : cart) {
            if (x.getProduct().getId() == ci.getProduct().getId()) {
                return;
            }
        }
        cart.add(ci);
    }

}
