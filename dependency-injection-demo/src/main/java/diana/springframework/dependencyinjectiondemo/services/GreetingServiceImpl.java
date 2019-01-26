package diana.springframework.dependencyinjectiondemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public void sayGreeting() {
		System.out.println("No, this is Patrick!");
		System.out.println();
	}

}
