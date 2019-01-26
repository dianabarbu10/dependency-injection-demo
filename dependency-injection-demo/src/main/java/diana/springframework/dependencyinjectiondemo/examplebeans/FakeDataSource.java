package diana.springframework.dependencyinjectiondemo.examplebeans;

import lombok.Data;

@Data
public class FakeDataSource {
	private String user;
	private String password;
	private String url;
}
