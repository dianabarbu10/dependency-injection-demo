package diana.springframework.dependencyinjectiondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import diana.springframework.dependencyinjectiondemo.services.GreetingServiceImpl;

@Controller
public class PropertyInjectedController {
	@Autowired
	private GreetingServiceImpl greetingService;

	public void sayHello() {
		System.out.println("This is Property Injected Controller!");
		greetingService.sayGreeting();
	}

}