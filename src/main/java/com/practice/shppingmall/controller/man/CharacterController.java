package com.practice.shppingmall.controller.man;

import com.practice.shppingmall.model.Product;
import com.practice.shppingmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class CharacterController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public String getCharacterData(Model model){

        List<Product> productList = productService.abcd();
        model.addAttribute("products",productList);

        return "pages/man/character";
    }
}
