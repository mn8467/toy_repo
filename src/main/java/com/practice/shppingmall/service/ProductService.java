package com.practice.shppingmall.service;

import com.practice.shppingmall.model.Product;
import com.practice.shppingmall.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> abcd(){
        return productRepository.findAll();
    }

}
