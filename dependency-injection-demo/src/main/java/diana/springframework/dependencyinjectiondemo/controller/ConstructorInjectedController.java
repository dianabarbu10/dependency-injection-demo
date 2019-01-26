package diana.springframework.dependencyinjectiondemo.controller;

import org.springframework.stereotype.Controller;

import diana.springframework.dependencyinjectiondemo.services.GreetingService;
import lombok.AllArgsConstructor;
@AllArgsConstructor
@Controller
public class ConstructorInjectedController {
	private GreetingService greetingService;

	public void sayHello() {
		System.out.println("This is Constructor Injected Controller!");
		greetingService.sayGreeting();
	}
}
