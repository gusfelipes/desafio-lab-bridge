package com.gusfelipes.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gusfelipes.backend.model.Repositories;
import com.gusfelipes.backend.service.RepositoriesService;

@RestController
public class RepositoriesController {

	@Autowired
	private RepositoriesService repositoriesService;

	@GetMapping("/users/{user}")
	public ResponseEntity<Repositories> ListRepositoriesForAUser(@PathVariable String user) {
		Repositories repositories = this.repositoriesService.RepositoriesForUser(user);

		return ResponseEntity.ok(repositories);
	}

}
