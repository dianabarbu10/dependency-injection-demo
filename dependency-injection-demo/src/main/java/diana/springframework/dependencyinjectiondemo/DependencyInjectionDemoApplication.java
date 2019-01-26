package diana.springframework.dependencyinjectiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import diana.springframework.dependencyinjectiondemo.examplebeans.FakeDataSource;
import diana.springframework.dependencyinjectiondemo.examplebeans.FakeDataSourceOther;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication
				.run(DependencyInjectionDemoApplication.class, args);
		// MyController myController = (MyController)
		// ctx.getBean("myController");
		// myController.hello();
		//
		// ctx.getBean(ConstructorInjectedController.class).sayHello();
		// ctx.getBean(PropertyInjectedController.class).sayHello();
		// ctx.getBean(SetterInjectedController.class).sayHello();

		FakeDataSource fakeDataSource = (FakeDataSource) ctx
				.getBean("fakeDataSource");
		System.out.println(fakeDataSource.toString());

		FakeDataSourceOther fakeDataSource_other = (FakeDataSourceOther) ctx
				.getBean("fakeDataSourceOther");
		System.out.println(fakeDataSource_other.toString());
	}

}
