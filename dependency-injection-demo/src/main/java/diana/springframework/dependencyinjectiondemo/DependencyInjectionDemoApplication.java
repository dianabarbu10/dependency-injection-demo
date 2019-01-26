package diana.springframework.dependencyinjectiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import diana.springframework.dependencyinjectiondemo.controller.ConstructorInjectedController;
import diana.springframework.dependencyinjectiondemo.controller.MyController;
import diana.springframework.dependencyinjectiondemo.controller.PropertyInjectedController;
import diana.springframework.dependencyinjectiondemo.controller.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication
				.run(DependencyInjectionDemoApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		myController.hello();

		ctx.getBean(ConstructorInjectedController.class).sayHello();
		ctx.getBean(PropertyInjectedController.class).sayHello();
		ctx.getBean(SetterInjectedController.class).sayHello();
	}

}
