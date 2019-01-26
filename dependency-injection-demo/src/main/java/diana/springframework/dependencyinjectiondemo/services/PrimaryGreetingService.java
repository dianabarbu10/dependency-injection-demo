package diana.springframework.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("I am king!");

	}

}
