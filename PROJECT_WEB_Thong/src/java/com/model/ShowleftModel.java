/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.context.DBContext;
import com.entity.FrameLeftImage;
import com.entity.ShowFrameLeft;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quach
 */
public class ShowleftModel {

    public List<ShowFrameLeft> select() throws Exception {
        Connection conn = new DBContext().getConnection();
        List<ShowFrameLeft> s = new ArrayList<>();
        String query = "select top 10 *from ProductTBL order by views desc ";
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            int id = rs.getInt("productid");
            String name = rs.getString("productName");
            String image = rs.getString("image");

            Double price = rs.getDouble("price");
            int quantity = rs.getInt("quantity");
            s.add(new ShowFrameLeft(id, name, image, price, quantity));
        }

        conn.close();
        rs.close();
        return s;

    }

    public List<ShowFrameLeft> selectwhere(String cre) throws Exception {
        Connection conn = new DBContext().getConnection();
        List<ShowFrameLeft> s = new ArrayList<>();
        String query = "select productID, productName,image,price, quantity from ProductTBL " + cre;
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            int id = rs.getInt("productID");
            String name = rs.getString("productName");
            String image = rs.getString("image");

            Double price = rs.getDouble("price");
            int quantity = rs.getInt("quantity");
            s.add(new ShowFrameLeft(id, name, image, price, quantity));
        }

        conn.close();
        rs.close();
        return s;

    }

    public List<FrameLeftImage> selectLinkImage(String cre) throws Exception {
        Connection conn = new DBContext().getConnection();
        List<FrameLeftImage> Image = new ArrayList<>();
        
        String query = "select * from imageList where productID="+cre;
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while(rs.next()){
            int id =rs.getInt("productID");
            String link = rs.getString("image");
            Image.add(new FrameLeftImage(id, link));
            
            
        }
        conn.close();
        rs.close();
        return Image;
    }
}
