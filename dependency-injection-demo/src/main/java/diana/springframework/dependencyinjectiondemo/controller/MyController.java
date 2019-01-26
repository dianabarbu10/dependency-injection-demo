package diana.springframework.dependencyinjectiondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import diana.springframework.dependencyinjectiondemo.services.GreetingService;

@Controller
public class MyController {
	@Autowired
	private GreetingService greetingService;

	public void hello() {
		greetingService.sayGreeting();
	}
}
