package com.sci.onlineshop.dao.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sci.onlineshop.dao.ProductDao;
import com.sci.onlineshop.model.Product;

import java.util.List;


@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Transactional
	@Override
	public void addProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		session.flush();
		
	}
    
    @Override
	public void editProduct(Product product) {
    	Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(product);
        session.flush();
		
	}

	@Override
	public Product getProductById(long id) {
		 Session session = sessionFactory.getCurrentSession();
		 Product product = session.get(Product.class, id);
		 session.flush();
		 
       	 return product;
	}

	@Override
	public List<Product> getAllProducts() {
		  Session session = sessionFactory.getCurrentSession();
		  Query<Product> query = session.createQuery("from Product");
		  List<Product> products = query.list();
		  session.flush();

		  return products;
	}

	@Override
	public void deleteProduct(long id) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(getProductById(id));
		session.flush();
		
	}

	

	



}
