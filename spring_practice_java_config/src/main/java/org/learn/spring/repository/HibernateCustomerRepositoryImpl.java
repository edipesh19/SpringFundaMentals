package org.learn.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.learn.spring.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	private List<Customer> list = new ArrayList<>();
	
	@Value("${dbUsername}")
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
