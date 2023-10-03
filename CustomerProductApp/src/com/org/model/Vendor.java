package com.org.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProdVendor")

public class Vendor {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int vendorId;
	@Column(name="Vendor_Name")
	private String VenName;
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 
	
	public Vendor(String venName) {
		super();
		VenName = venName;
	}
	

	public String getVenName() {
		return VenName;
	}

	public void setVenName(String venName) {
		VenName = venName;
	}

	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}



	@Override
	public int hashCode() {
		return Objects.hash(VenName, vendorId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		return Objects.equals(VenName, other.VenName) && vendorId == other.vendorId;
	}



	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", VenName=" + VenName + "]";
	}
}
	 
	 
