package lee.io.lingualog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class LingualogApplication {

	public static void main(String[] args) {
		SpringApplication.run(LingualogApplication.class, args);
	}

}
