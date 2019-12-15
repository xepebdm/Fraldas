package com.hackaton.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackaton.model.PersonModel;
import com.hackaton.service.PersonService;

@RestController("/")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@PostMapping
	private ResponseEntity<?> checkPhoto(@RequestBody PersonModel person){
		
		//TODO
		return new ResponseEntity<>(person, HttpStatus.OK);
	}
}
