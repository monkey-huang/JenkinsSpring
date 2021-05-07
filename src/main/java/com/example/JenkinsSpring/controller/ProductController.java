package com.example.JenkinsSpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.JenkinsSpring.dto.RequestProduct;
import com.example.JenkinsSpring.dto.ResponseProduct;
import com.example.JenkinsSpring.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
    @ApiOperation(value = "查詢產品名稱testF")
	@RequestMapping(value= "/product", method = RequestMethod.POST)
	public ResponseProduct findProduct(@RequestBody RequestProduct requestProduct) {
		System.out.println("test");
		return productService.findProductById(requestProduct);
	}
}
