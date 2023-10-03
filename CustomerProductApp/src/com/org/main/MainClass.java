package com.org.main;

import java.time.LocalDate;

import com.org.dao.DatabaseOperations;
import com.org.model.Certificate;
import com.org.model.Product;
import com.org.model.Vendor;
import com.org.util.DateConvertor;

public class MainClass {
DatabaseOperations dbOps;
	
	public MainClass() {
		dbOps = new DatabaseOperations();
	}
	
	public static void main(String[] args) {
		MainClass app = new MainClass();
		app.createProduct();
		//app.getProduct();
	}
	
	public void getProduct()
	{
		int searchId = 1;
		displayProduct(dbOps.getProductById(searchId));
	}
	
	public void displayProduct(Product e)
	{
		System.out.println(e);
	}
	
	public  void createProduct()
	{
		String strDom = "12-2-2021";
		String strDoe = "28-11-2024";
		
		LocalDate dom = DateConvertor.getDateFromString(strDom);
		LocalDate doe = DateConvertor.getDateFromString(strDoe);
		
		Product e = new Product( "Sanya",6000,
				 dom, doe, "Surgery");
		Certificate ctr= new Certificate("iso ffdsst","active");
		e.setCtr(ctr);
		//Vendor v=new Vendor("abdulla");
		//e.setVendor(v);
	 
		 
		
		 
		
		dbOps.saveProducts(e);
		//dbOps.saveProducts(e1);
		//dbOps.saveProducts(e2);
		
	}
}


