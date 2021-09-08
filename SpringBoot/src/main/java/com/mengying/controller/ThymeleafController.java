package com.mengying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ThymeleafController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("name","张三");
        return "index";
    }
}
