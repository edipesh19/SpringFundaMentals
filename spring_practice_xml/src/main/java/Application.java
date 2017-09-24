import java.util.List;

import org.learn.spring.model.Customer;
import org.learn.spring.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args){
		//CustomerService cs = new CustomerServiceImpl();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CustomerService cs = appContext.getBean("customerService", CustomerService.class);
		List<Customer> cl = cs.findAll();
		
		System.out.println(cl.get(0));
	}

}
