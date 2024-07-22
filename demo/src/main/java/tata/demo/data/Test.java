package tata.demo.data;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		BeanFactory b1=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1= (Employee) b1.getBean("employee");
		System.out.println(e1);

	}
}
