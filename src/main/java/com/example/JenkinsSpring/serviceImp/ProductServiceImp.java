package com.example.JenkinsSpring.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.JenkinsSpring.dto.RequestProduct;
import com.example.JenkinsSpring.dto.ResponseProduct;
import com.example.JenkinsSpring.model.Product;
import com.example.JenkinsSpring.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {
	List<Product> productList = new ArrayList<Product>();
	Product productA = new Product("A01", "刮鬍刀");

	Product productB = new Product("A02", "牙刷");

	Product productC = new Product("A03", "牙膏");

	public ResponseProduct findProductById(RequestProduct requestProduct) {
		productList.add(productA);
		productList.add(productB);
		productList.add(productC);
		ResponseProduct responseProduct = new ResponseProduct();
		responseProduct.setName(null);
		responseProduct.setMessage("找不到資料");
		
		for (Product ele : productList) {
			if (ele.getId().equals(requestProduct.getID())) {
				responseProduct.setName(ele.getName());
				responseProduct.setMessage("成功取得資料");
				break;
			}
		}
		return responseProduct;
	}

}
