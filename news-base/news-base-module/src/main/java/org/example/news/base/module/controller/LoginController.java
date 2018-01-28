package org.example.news.base.module.controller;

import org.example.news.base.common.restful.Rest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    public Rest login() {

        return Rest.success("登录成功!");
    }

    @RequestMapping(value = "/logout")
    @ResponseBody
    public Rest logout() {
        return Rest.success("注销成功！");
    }
}

