package org.hathor.Hathor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableWebSecurity
@CrossOrigin(origins = "*")
public class HathorApplication {

	@GetMapping("/")
	public String login() {
		return "OK";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HathorApplication.class, args);
	}

}
