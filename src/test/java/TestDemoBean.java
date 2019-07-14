


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDemoBean {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("Bean Factory Initialized");
		DemoBean demoBean = ctx.getBean("demoBean", DemoBean.class);
		((AnnotationConfigApplicationContext)ctx).close();
		
	}

}
