package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Bikedetails;


public interface Bikerepository extends JpaRepository<Bikedetails,Integer>{

}
