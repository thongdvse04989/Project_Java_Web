/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.context.DBContext;
import com.entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Quan
 */
public class ProductModel {

    public List<Product> getProducts(String category) throws Exception {
        List<Product> products = new ArrayList<>();
        String query = "select * from ProductTBL where categoryID = ?";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, category);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("productID");
            String name = rs.getString("productName");
            String image = rs.getString("image");
            double price = rs.getDouble("price");
            float discount = rs.getFloat("discount");
            int view = rs.getInt("views");
            int producerId = rs.getInt("producerID");
            Date created = new Date(rs.getDate("created").getTime());
            products.add(new Product(id, name, image, price, discount, view, producerId, created));
        }
        rs.close();
        ps.close();
        conn.close();
        return products;
    }
    public Product getProductByID(String productID) throws Exception {
        Product product = new Product();
        String query = "select * from ProductTBL where productID = ?";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, productID);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("productID");
            String name = rs.getString("productName");
            String image = rs.getString("image");
            double price = rs.getDouble("price");
            float discount = rs.getFloat("discount");
            int view = rs.getInt("views");
            int producerId = rs.getInt("producerID");
            Date created = new Date(rs.getDate("created").getTime());
            product = new Product(id, name, image, price, discount, view, producerId, created);
        }
        rs.close();
        ps.close();
        conn.close();
        return product;
    }
    public List<Product> searchProduct(String categoryID, double priceRange, boolean mostViews, boolean Newest)  throws  Exception{
        List<Product> products = new ArrayList<>();
        String query = "select * from ProductTBL where categoryID = ";
        query += categoryID + " and ";
        switch ((int) priceRange) {
            case 0:
                query += "price >= 0 and price <= (select max(price) from ProductTBL) ";
                break;
            case 1:
                query += "price <= 249000";
                break;
            case 2:
                query += "price >= 250000 and price <= 499000";
                break;
            case 3:
                query += "price >= 500000 and price <= 749000";
                break;
            case 4:
                query += "price >= 750000 and price <= 999000";
                break;
            case 5:
                query += "price >= 1000000 and price <= 1249000";
                break;
            case 6:
                query += "price >= 1250000 and price <= 1499000";
                break;
            case 7:
                query += "price >= 1500000 and price <= 1749000";
                break;
            case 8:
                query += "price >= 1750000 and price <= 1999000";
                break;
            default:
                query += "price >= 2000000";
                break;
        }
        if (mostViews && !Newest) {
            query += " order by views desc";
        } else if (Newest && !mostViews) {
            query += "order by created desc";
        } else if (Newest && mostViews) {
            query += "order by views desc, created desc";
        }
        ResultSet rs = new DBContext().getConnection().prepareStatement(query).executeQuery();
        while (rs.next()) {
            int id = rs.getInt("productID");
            String name = rs.getString("productName");
            String img = rs.getString("image");
            int cateID = rs.getInt("categoryID");
            double price = rs.getDouble("price");
            int quantity = rs.getInt("quantity");
            float discount = rs.getFloat("discount");
            int views = rs.getInt("views");
            int producerID = rs.getInt("producerID");
            Date date = rs.getDate("created");
            products.add(new Product(id, name, img, price, discount, views, producerID, date));
        }
        return products;
    }
}
