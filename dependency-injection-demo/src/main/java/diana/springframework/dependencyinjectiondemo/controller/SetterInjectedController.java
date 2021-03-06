package diana.springframework.dependencyinjectiondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import diana.springframework.dependencyinjectiondemo.services.GreetingService;
import lombok.Setter;

@Controller
public class SetterInjectedController {
	@Setter
	@Autowired
	@Qualifier("setterGreetingService")
	private GreetingService greetingService;

	public void sayHello() {
		System.out.println("This is Setter Injected Controller!");
		greetingService.sayGreeting();
	}
}
