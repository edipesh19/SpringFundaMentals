package org.learn.spring.service;

import java.util.List;

import org.learn.spring.model.Customer;
import org.learn.spring.repository.CustomerRepository;
import org.learn.spring.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository cr = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see org.learn.spring.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return cr.findAll();
	}
	
	

}
