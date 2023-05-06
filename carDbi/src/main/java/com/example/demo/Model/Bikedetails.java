package com.example.demo.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bikedetails {
	@Id
	private int id ;
	private String bikename ;
	private String color ;
	private String brand ;
	
	public void setId(int id) {
		this.id = id;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Bikedetails [id=" + id + ", bikename=" + bikename + ", color=" + color + ", brand=" + brand + "]";
	}
	
	
	
	

}
