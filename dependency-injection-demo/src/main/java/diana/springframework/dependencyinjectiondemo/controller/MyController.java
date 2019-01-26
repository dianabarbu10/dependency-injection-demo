package diana.springframework.dependencyinjectiondemo.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	public void hello() {
		System.out.println("Hello! Yes, this is Patrick!");
	}
}
