package diana.springframework.dependencyinjectiondemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import diana.springframework.dependencyinjectiondemo.services.GreetingServiceImpl;
//This is an EVIL way to inject. No no no!
@Controller
public class PropertyInjectedController {
	@Autowired
	private GreetingServiceImpl greetingServiceImpl;

	public void sayHello() {
		System.out.println("This is Property Injected Controller!");
		greetingServiceImpl.sayGreeting();
	}

}
