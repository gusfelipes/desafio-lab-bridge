package com.gusfelipes.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class BackendApplication {

	@Bean
	public WebClient webclient(WebClient.Builder builder) {
		return builder.baseUrl("https://api.github.com").build();
		}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
