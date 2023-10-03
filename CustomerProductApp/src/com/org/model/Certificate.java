package com.org.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable

public class Certificate {
	@Column(name="CertificationName", nullable=false)
	private String name;
	private String status;
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String name, String status) {
		super();
		this.name = name;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, status);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Certificate other = (Certificate) obj;
		return Objects.equals(name, other.name) && Objects.equals(status, other.status);
	}
	@Override
	public String toString() {
		return "Certificate [name=" + name + ", status=" + status + "]";
	}
	

}
