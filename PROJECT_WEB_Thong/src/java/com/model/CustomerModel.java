/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.context.DBContext;
import com.entity.Customer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DoThong
 */
public class CustomerModel {

    public boolean verifyAccount(String username, String password) throws Exception {
        Connection conn = new DBContext().getConnection();
        String query = "select accountName,password from CustomerTBL";
        ResultSet rs = conn.prepareStatement(query).executeQuery();
        while (rs.next()) {
            String acc = rs.getString("accountName");
            String pw = rs.getString("password");
            if (acc.equals(username)) {
                if (pw.equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }
    public void addCustomer(String account, String password, String name, String email, String phone)  throws Exception{
        Connection conn = new DBContext().getConnection();
        String query = "insert into CustomerTBL values('"
                + account +"','"
                + password +"','"
                + name +"','"
                + email +"',"
                + phone +")";
        Statement stt = conn.createStatement();
        stt.executeUpdate(query);
        stt.close();
        conn.close();
    }
    public boolean verifySignUpAccount(String account) throws Exception{
        Connection conn = new DBContext().getConnection();
        String query = "select accountName from CustomerTBL";
        ResultSet rs = conn.createStatement().executeQuery(query);
        while (rs.next()) {
            String acc = rs.getString("accountName");
            if (account.equals(acc)) {
                return false;
            }
        }
        return true;
    }
}
