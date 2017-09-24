package org.learn.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.learn.spring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	private List<Customer> list = new ArrayList<>();
	
	private String dbUsername;
	
	
	/* (non-Javadoc)
	 * @see org.learn.spring.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		System.out.println(dbUsername);
		Customer c = new Customer();
		
		c.setFirstName("Dipesh");c.setLastName("Dutta");
		
		list.add(c);
		
		return list;
	}


	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}
	

}
