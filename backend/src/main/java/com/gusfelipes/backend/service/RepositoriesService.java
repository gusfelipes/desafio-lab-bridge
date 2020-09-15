package com.gusfelipes.backend.service;

import org.springframework.stereotype.Service;

import com.gusfelipes.backend.model.Repositories;


@Service
public class RepositoriesService {

	
	public Repositories RepositoriesForUser(String user) {
		Repositories repositories = new Repositories();
		
		return repositories;
	}
}
