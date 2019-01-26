package diana.springframework.dependencyinjectiondemo.services;

public class PrimaryGreetingService implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("I am king!");

	}

}
