package org.learn.spring.service;

import java.util.List;

import org.learn.spring.model.Customer;

public interface CustomerService {

	List<Customer> findAll();

}