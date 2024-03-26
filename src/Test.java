

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import model.Question;

public class Test {

	public static void main(String[] args) {
		 ClassPathResource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	          
	        Question s=(Question)factory.getBean("e");  
	        s.displayInfo();  
	}

}
