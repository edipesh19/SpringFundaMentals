package org.learn.spring.repository;

import java.util.List;

import org.learn.spring.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}