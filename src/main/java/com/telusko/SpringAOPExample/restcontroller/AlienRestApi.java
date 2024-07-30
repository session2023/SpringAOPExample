package com.telusko.SpringAOPExample.restcontroller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SpringAOPExample.dao.Alien;
import com.telusko.SpringAOPExample.service.IAlienService;

@RestController
@RequestMapping("/api")
public class AlienRestApi {
	
	@Autowired
	private IAlienService service;
	
	@PostMapping("/register")
	public ResponseEntity<Alien> registerAlien(@RequestBody Alien alien) throws Exception{
		
		System.out.println("Request made to register api at" + LocalTime.now());
		Alien al = service.registerAlieniNFO(alien);
		return new ResponseEntity<>(al, HttpStatus.CREATED);
		
	}
	
	
	
	@GetMapping("/fetch")
	public ResponseEntity<List> fetchAliens(){
		
		System.out.println("Request made to fetch api at" + LocalTime.now());
		List<Alien> list = service.getAllAlienInfo();
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}
	
	
	

}
