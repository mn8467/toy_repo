package com.practice.shppingmall.controller.man;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/man")
public class FootwearController {
    @RequestMapping("/footwear")
    public String canvasShoes(Model model){
        model.addAttribute("closeBrand", true);
        return "pages/product/defaultProduct";
    }
}
