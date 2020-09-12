package com.gusfelipes.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.gusfelipes.backend.model.Repositories;

import reactor.core.publisher.Mono;


@Service
public class RepositoriesService {

	@Autowired
	private WebClient webclient;
	
	public Repositories RepositoriesForUser(String user) {
		Mono<Repositories> monoRepositories = this.webclient
				.method(HttpMethod.GET)
				.uri("/users/{user}/repos", user)
				.retrieve()
				.bodyToMono(Repositories.class);
		
		Repositories repositories = monoRepositories.block(); 
		
		return repositories;
	}
}
