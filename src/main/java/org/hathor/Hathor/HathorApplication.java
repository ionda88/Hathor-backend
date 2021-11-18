package org.hathor.Hathor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableJpaRepositories("org.hathor.Hathor.repository")
//@EntityScan("org.hathor.Hathor.model")
//@ComponentScan("org.hathor.Hathor.service")
//@EnableWebSecurity
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@SpringBootApplication()
public class HathorApplication {

	public static void main(String[] args) {
		SpringApplication.run(HathorApplication.class, args);
	}

}
