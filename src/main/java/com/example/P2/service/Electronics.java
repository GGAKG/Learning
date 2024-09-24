package com.example.P2.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Electronics {
    List<String> product = new ArrayList<>();

    {
        product.add("akdan");
        product.add("aks");
        product.add("eks");
        product.add("RDS");
        product.add("LSD");
    }
    public List<String> getproduct(){
        return product;
    }
}
