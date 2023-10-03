package com.org.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

 
@Entity   
@Table(name = "CGProduct")
 

public class Product {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int productCode;
	@Column(name="CustomerName",nullable = false)
	private String name;
	@Column(nullable = false)
	private int cost;
	private LocalDate dom;
	private LocalDate doe;
	@Column(name="ProductCategory")
	private String category;
	
	@Embedded
	private Certificate ctr;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Vendor_ID")
	private Vendor vendor;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String name, int cost, LocalDate dom, LocalDate doe, String category) {
		super();
		this.name = name;
		this.cost = cost;
		this.dom = dom;
		this.doe = doe;
		this.category = category;
	}
	public Product(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	
	
	public Vendor getVendor() {
		return vendor;
	}
	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	public Certificate getCtr() {
		return ctr;
	}
	public void setCtr(Certificate ctr) {
		this.ctr = ctr;
	}
	public int getProductCode() {
		return productCode;
	}
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public LocalDate getDom() {
		return dom;
	}
	public void setDom(LocalDate dom) {
		this.dom = dom;
	}
	public LocalDate getDoe() {
		return doe;
	}
	public void setDoe(LocalDate doe) {
		this.doe = doe;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	 
	 
	@Override
	public int hashCode() {
		return Objects.hash(category, cost, ctr, doe, dom, name, productCode, vendor);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && cost == other.cost && Objects.equals(ctr, other.ctr)
				&& Objects.equals(doe, other.doe) && Objects.equals(dom, other.dom) && Objects.equals(name, other.name)
				&& productCode == other.productCode && Objects.equals(vendor, other.vendor);
	}
	@Override
	public String toString() {
		return "Product [productCode=" + productCode + ", name=" + name + ", cost=" + cost + ", dom=" + dom + ", doe="
				+ doe + ", category=" + category + ", ctr=" + ctr + ", vendor=" + vendor + "]";
	}
	 
	 
	
	
	
	
	

}
