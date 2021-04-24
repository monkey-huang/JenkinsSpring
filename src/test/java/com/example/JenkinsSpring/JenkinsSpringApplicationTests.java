package com.example.JenkinsSpring;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.JenkinsSpring.dto.RequestProduct;
import com.example.JenkinsSpring.dto.ResponseProduct;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(SpringExtension.class)
class JenkinsSpringApplicationTests {
	
    @Autowired
    private TestRestTemplate restTemplate;
    
    ResponseProduct ResponseProductTestA01 = new ResponseProduct("刮鬍刀", "成功取得資料");
    
    ResponseProduct ResponseProductTestA03 = new ResponseProduct("牙膏", "成功取得資料");
    
    ResponseProduct ResponseProductTestNotFind = new ResponseProduct(null, "找不到資料");

    @Test
	public void testProductFindById() {
		String url = "/product";
		//when
		
		assertEquals(restTemplate.postForEntity(url, new RequestProduct("A01"),ResponseProduct.class)
				.getBody().equals(ResponseProductTestA01), true);
		
		assertEquals(restTemplate.postForEntity(url, new RequestProduct("A03"),ResponseProduct.class)
				.getBody().equals(ResponseProductTestA03), true);
		
		assertEquals(restTemplate.postForEntity(url, new RequestProduct("A09"),ResponseProduct.class)
				.getBody().equals(ResponseProductTestNotFind), true);
	}

}
