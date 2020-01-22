package com.Oauth2.Oauth2;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableOAuth2Sso
@RestController
public class Oauth2Application {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2Application.class, args);
	}
	
	/*
	 * @GetMapping("/") public String message(Principal principal) { return "Hi " +
	 * principal.getName() + " welcome to first Oauth2 Application"; }
	 */
	@PostMapping("/welcome")
	public String oauth() {
		return "welcome.html";
	}

}
