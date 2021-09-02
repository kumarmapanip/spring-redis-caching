package com.rvy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rvy.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}

