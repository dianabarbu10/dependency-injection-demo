package diana.springframework.dependencyinjectiondemo.services;

public class PrimaryGreetingServiceSpanish implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("Soy el rey!");

	}

}
