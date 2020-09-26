package com.jojos.joKart.controller;

import com.jojos.joKart.model.CategoryRequest;
import com.jojos.joKart.service.CatagoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping(name = "/category")
public class CategoryController {

    @PostMapping(name = "/create")
    public ResponseEntity<String> create(@RequestBody CategoryRequest categoryRequest){

        System.out.println(" request : " + categoryRequest);
        CatagoryService catagoryService = new CatagoryService();
        catagoryService.create(categoryRequest);

    return ResponseEntity.ok("category Added successfully");
    }
}