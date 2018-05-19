package com.nengli8.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpSession;

/**
 * Created by 11369 on 2018/5/19.
 */
@Controller
public class BaseController {
    @Autowired
    public HttpSession httpSession;

    public String getCurrentUser() {
        if (isLogin()) {
            return (String) httpSession.getAttribute("current_user");
        }
        return null;
    }

    public boolean isLogin() {
        return httpSession.getAttribute("current_user") != null;
    }
}
