package com.example.P2.controller;

import com.example.P2.service.Electronics;
import com.example.P2.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class Product {
    @Autowired
    Electronics svc;
    @Autowired
    Service svs;
    @PostMapping("/dev")
    public List<String> getprod(){
//        List <String> l= svc.getproduct();
//        for(String p : l)
//            System.out.println(p);
        return svc.getproduct();
    }
    @PostMapping("/dev/{productname}")
    public String print(@PathVariable String productname){
        List<String> product=svc.getproduct();
        for(String i : product) {
            if(i.equals(productname))
             return i;
        }
        return "Not";
    }
    @PostMapping("/put/{user}")
    public void out(@PathVariable String user){
        svs.user(user,user+user+user);
    }
    @GetMapping("/get")
    public List<Map.Entry<String , String>> get(){
        return svs.getUsers();
    }
}
