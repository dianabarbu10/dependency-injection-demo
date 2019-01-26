package diana.springframework.dependencyinjectiondemo.config;

import diana.springframework.dependencyinjectiondemo.services.GreetingService;
import diana.springframework.dependencyinjectiondemo.services.PrimaryGreetingService;
import diana.springframework.dependencyinjectiondemo.services.PrimaryGreetingServiceGerman;
import diana.springframework.dependencyinjectiondemo.services.PrimaryGreetingServiceSpanish;
public class GreetingServiceFactory {

	public GreetingService createGreetingService(String language) {

		switch (language) {
			case "en" :
				return new PrimaryGreetingService();
			case "es" :
				return new PrimaryGreetingServiceSpanish();
			case "de" :
				return new PrimaryGreetingServiceGerman();
			default :
				return new PrimaryGreetingService();
		}
	}
}
