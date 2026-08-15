package com.deepak.spring.springorm.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deepak.spring.springorm.dao.ProductDao;
import com.deepak.spring.springorm.entity.Product;

public class Test {
	public static void main(String []args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/deepak/spring/springorm/test/Config4.xml");
		ProductDao productDao = (ProductDao)ctx.getBean("productDao");
		Product product = new Product();
		product.setId(12);
		product.setName("iphone");
		product.setDesc("waste of money");
		product.setPrice(123.22);
		productDao.create(product );
	}
}
