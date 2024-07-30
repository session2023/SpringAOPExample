package com.telusko.SpringAOPExample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringAOPExample.dao.Alien;
import com.telusko.SpringAOPExample.dao.AlienRepo;

@Service
public class AlienService implements IAlienService {
	
	@Autowired
	private AlienRepo repo;

	@Override
	public Alien registerAlieniNFO(Alien alien) throws Exception {
		
		String name=alien.getName();
		if(name.length()!=5)
			throw new Exception("Invalid name length exception");
		else
		
		return repo.save(alien);
	}

	@Override
	public List<Alien> getAllAlienInfo() {
		
		return repo.findAll();
	}

}
