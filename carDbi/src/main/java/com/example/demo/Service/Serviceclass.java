package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Bikerepository;

import com.example.demo.Repository.Customerrepository;

import com.example.demo.Model.Customer;

@Service

public class Serviceclass {
	
	@Autowired
	 public Bikerepository br;
	@Autowired 
	public Customerrepository cr;
	 public List<Customer> getall()
	   {
		   return cr.findAll();
	   }
	   public Customer saveinfo(Customer mc)
	   {
		   return cr.save(mc);
	   }
	   public void delete(int id)
	   {
		   cr.deleteById(id);
	   }
	   public Customer Update(Customer mc)
	   {
		   return cr.saveAndFlush(mc);
	   }
	public List<Customer> getBikes(String custname) {
	
		 return cr.getBikesByName(custname);	}
    public String deleteQuery(int id)
    {
    	cr.deleteById(id);
    	return "deleted";
    }


}
