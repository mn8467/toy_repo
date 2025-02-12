package com.practice.shppingmall.controller;

import com.practice.shppingmall.service.HomeService;
import com.practice.shppingmall.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {

    @Autowired
    private HomeService homeService;

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/")
    public String home(Model model) {

//        model.addAttribute("title", "Controller Title");
        productService.abcd();
        return "pages/home";
    }
}
