import java.text.ParseException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.service.TestBean;

public class Main {

	public static void main(String[] args)throws ParseException {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dispatcher.xml");
		
		TestBean t = (TestBean)ctx.getBean("testBean");
		
		t.m1();
		System.out.println("===========");
		
		t.m2();
		System.out.println("===========");
		
		t.m3();
		System.out.println("===========");

	}

}
