package com.gusfelipes.backend.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RepositoriesController {

	@Autowired
	RestTemplate restTemplate;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(value = "/repos/{user}")
	public String ListRepositoriesForAUser(@PathVariable String user) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		System.out.println("----------------" + user + "----------------");
		return restTemplate
				.exchange("https://api.github.com/users/" + user + "/repos", HttpMethod.GET, entity, String.class)
				.getBody();
	}

}
