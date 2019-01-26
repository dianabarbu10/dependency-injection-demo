package diana.springframework.dependencyinjectiondemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import diana.springframework.dependencyinjectiondemo.services.GreetingService;

@Configuration
public class GreetingConfig {

	@Bean
	public GreetingServiceFactory greetingServiceFactory() {
		return new GreetingServiceFactory();
	};

	@Bean
	@Primary
	@Profile({"default", "en"})
	public GreetingService primaryGreetingService(
			GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("en");
	};

	@Bean
	@Primary
	@Profile("es")
	public GreetingService primaryGreetingServiceSpanish(
			GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("es");
	};

	@Bean
	@Primary
	@Profile("de")
	public GreetingService primaryGreetingGerman(
			GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.createGreetingService("de");
	};
}
