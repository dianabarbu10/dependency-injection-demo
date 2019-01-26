package diana.springframework.dependencyinjectiondemo.services;

public class PrimaryGreetingServiceGerman implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("Ich bin keiser!");

	}

}
