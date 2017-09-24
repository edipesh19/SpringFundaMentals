import java.util.List;

import org.learn.spring.model.Customer;
import org.learn.spring.service.CustomerService;
import org.learn.spring.service.CustomerServiceImpl;

public class Application {
	
	public static void main(String[] args){
		CustomerService cs = new CustomerServiceImpl();
		
		List<Customer> cl = cs.findAll();
		
		System.out.println(cl.get(0));
	}

}
