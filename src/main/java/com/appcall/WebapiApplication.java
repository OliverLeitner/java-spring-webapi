package com.appcall;

import org.hibernate.boot.model.naming.ImplicitNamingStrategy;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyLegacyJpaImpl;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableJpaRepositories
@SpringBootApplication(
	scanBasePackages = {
		"com.appcall.webapi",
	}
)
public class WebapiApplication {

	@Bean
	public PhysicalNamingStrategy physical() {
		return new PhysicalNamingStrategyStandardImpl();
	}

	@Bean
	public ImplicitNamingStrategy implicit() {
		return new ImplicitNamingStrategyLegacyJpaImpl();
	}

	@Bean public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder(); 
	}

	public static void main(String[] args) {
		SpringApplication.run(WebapiApplication.class, args);
	}

}
