package com.common;

import com.entity.Category;
import com.model.CategoryModel;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Quan
 */
public enum Common {

    INSTANCE;

    public void setHearderData(HttpServletRequest request) throws Exception {
        List<Category> categories = new CategoryModel().getCategories();
        HttpSession session = request.getSession();
        session.setAttribute("categoryList", categories);
    }
}
