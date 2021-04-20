package com.bitacademy.aoptest;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public ProductVo findProduct(String keyword) {
		if (keyword == null) {
			throw new RuntimeException("검색어가 비어 있습니다");
		}
		
		System.out.println("finding [" + keyword + "]");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return new ProductVo(keyword);
	}
}
