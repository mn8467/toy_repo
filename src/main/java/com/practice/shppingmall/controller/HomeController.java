package com.practice.shppingmall.controller;

import com.practice.shppingmall.service.HomeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class HomeController {

    @Autowired
    private HomeService homeService;

    @RequestMapping(value = "/")
    public String home() {

        return "pages/home";
    }
}
