package com.telusko.SpringAOPExample.service;

import java.util.List;

import com.telusko.SpringAOPExample.dao.Alien;

public interface IAlienService {

	public Alien registerAlieniNFO(Alien alien) throws Exception;
	public List<Alien> getAllAlienInfo();
	
}
