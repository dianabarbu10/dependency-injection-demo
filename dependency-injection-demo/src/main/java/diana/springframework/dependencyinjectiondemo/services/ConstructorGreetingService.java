package diana.springframework.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("This is Constructor Greeting Service");
	}

}
