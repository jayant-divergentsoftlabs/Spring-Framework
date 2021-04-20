package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * Autowiring collaborators

 * @author Jayant
 *
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new FileSystemXmlApplicationContext("E:\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\spring-Example\\src\\main\\java\\Autowire\\Autowire.xml");
		Parent parent=context.getBean("parent",Parent.class);
		parent.display();
	}
}
