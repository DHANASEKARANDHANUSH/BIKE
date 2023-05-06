package com.example.demo.Model;

import java.util.List;

//import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id ;
	private String custname ;
	private String custnum ;
	private String custbike ;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Bikedetails> model ;
	public List<Bikedetails> getModel() {
		return model;
	}
	public void setModel(List<Bikedetails> model) {
		this.model = model;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustnum() {
		return custnum;
	}
	public void setCustnum(String custnum) {
		this.custnum = custnum;
	}
	public String getCustbike() {
		return custbike;
	}
	public void setCustbike(String custbike) {
		this.custbike = custbike;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", custname=" + custname + ", custnum=" + custnum + ", custbike=" + custbike + "]";
	}
	
	

}
