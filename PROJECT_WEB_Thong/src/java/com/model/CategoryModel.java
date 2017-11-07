package com.model;

import com.context.DBContext;
import com.entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DoThong
 */
public class CategoryModel {

    public List<Category> getCategories() throws Exception {
        List<Category> list = new ArrayList<>();
        String query = "select * from CategoryProductTBL";
        Connection conn = new DBContext().getConnection();
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            int id = rs.getInt("categoryID");
            String name = rs.getString("categoryName");
            list.add(new Category(id, name));
        }
        rs.close();
        ps.close();
        conn.close();
        return list;
    }
}
