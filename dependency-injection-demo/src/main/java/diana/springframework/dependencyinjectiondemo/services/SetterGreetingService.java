package diana.springframework.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("This is Setter Greeting Service");
	}

}
