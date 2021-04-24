package com.example.JenkinsSpring.service;

import com.example.JenkinsSpring.dto.RequestProduct;
import com.example.JenkinsSpring.dto.ResponseProduct;

public interface ProductService {

	public ResponseProduct findProductById(RequestProduct requestProduct);
}
