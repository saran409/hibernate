package com.org.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.org.model.Product;

public class DatabaseOperations {
public static Session hibernateSession ;
	
	public DatabaseOperations() {
		hibernateSession = MyHibernateConfiguration.hibernateSession;
	}
	
	
	public Product getProductById(int productCode)
	{
		Product savedProd = (Product) hibernateSession.get(Product.class, productCode);
		return savedProd;
	}	
	public void saveProducts(Product e)
	{
		if(e != null)
		{
			Transaction t = hibernateSession.beginTransaction();
			hibernateSession.save(e);
			t.commit();
		}
	}
}


