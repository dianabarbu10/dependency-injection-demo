package diana.springframework.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGreetingServiceGerman implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("Ich bin keiser!");

	}

}
