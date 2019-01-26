package diana.springframework.dependencyinjectiondemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import diana.springframework.dependencyinjectiondemo.examplebeans.FakeDataSource;
import diana.springframework.dependencyinjectiondemo.examplebeans.FakeDataSourceOther;

@Configuration
// @PropertySource("classpath:datasource.properties")
@PropertySources({@PropertySource("classpath:datasource.properties"),
		@PropertySource("classpath:datasource-other.properties")})
public class PropertyConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}
	@Value("${super.user}")
	private String user;

	@Value("${super.pass}")
	private String password;

	@Value("${super.url}")
	private String url;

	@Value("${super.other.user}")
	private String user_other;

	@Value("${super.other.pass}")
	private String password_other;

	@Value("${super.other.url}")
	private String url_other;

	@Bean
	public FakeDataSource fakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	@Bean
	public FakeDataSourceOther fakeDataSourceOther() {
		FakeDataSourceOther fakeDataSource = new FakeDataSourceOther();
		fakeDataSource.setUser(user_other);
		fakeDataSource.setPassword(password_other);
		fakeDataSource.setUrl(url_other);
		return fakeDataSource;
	}
}
