import java.util.List;

import org.learn.spring.model.Customer;
import org.learn.spring.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService cs = appContext.getBean("customerService", CustomerService.class);

/*		System.out.println(cs);

		CustomerService cs1 = appContext.getBean("customerService", CustomerService.class);

		System.out.println(cs1);*/

		List<Customer> cl = cs.findAll();

		System.out.println(cl.get(0));
	}
}
