package com.deepak.spring.springorm.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.deepak.spring.springorm.dao.ProductDao;
import com.deepak.spring.springorm.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Product product) {
		// TODO Auto-generated method stub
		Integer result = (Integer) hibernateTemplate.save(product);
		return result;
	}

}
