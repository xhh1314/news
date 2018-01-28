package org.example.news.base.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class CommonController {
    @RequestMapping("/admin/index")
    public String index(){
        return "admin/index";
    }

    @RequestMapping("/error/403")
    public String get403(){
        return "common/403";
    }


}
