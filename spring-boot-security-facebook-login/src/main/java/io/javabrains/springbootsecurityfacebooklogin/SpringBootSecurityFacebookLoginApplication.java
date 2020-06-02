package io.javabrains.springbootsecurityfacebooklogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
//@EnableOAuth2Sso
@EnableAutoConfiguration
public class SpringBootSecurityFacebookLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityFacebookLoginApplication.class, args);
	}

}
