package org.example.news.base.module.controller;

import org.example.news.base.common.restful.Rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping
public class LoginController {

    private static  final Logger log= LoggerFactory.getLogger(LoginController.class);

    @Value("${cas.casServerLogoutUrl}")
    private String logoutUrl;

    @RequestMapping(value = "/login")
    @ResponseBody
    public Rest login() {

        return Rest.success("登录成功!");
    }

    @RequestMapping(value = "/logout")
    public void logout(HttpServletResponse response, HttpSession session) {

        //摧毁session
        session.invalidate();
        log.info("session is logout!");
        try {
            //转发到cas-server logout页面
            response.sendRedirect(logoutUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

