package tata.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{ 
		BeanFactory b1=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee p1=(Employee) b1.getBean("emp");
		System.out.println(p1);

	}
}
