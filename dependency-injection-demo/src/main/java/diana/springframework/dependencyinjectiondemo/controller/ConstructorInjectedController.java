package diana.springframework.dependencyinjectiondemo.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import diana.springframework.dependencyinjectiondemo.services.GreetingService;
@Controller
public class ConstructorInjectedController {
	private GreetingService greetingService;

	public ConstructorInjectedController(
			@Qualifier("constructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public void sayHello() {
		System.out.println("This is Constructor Injected Controller!");
		greetingService.sayGreeting();
	}
}
