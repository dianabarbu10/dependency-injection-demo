package diana.springframework.dependencyinjectiondemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimaryGreetingServiceSpanish implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("Soy el rey!");

	}

}
