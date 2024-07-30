package com.telusko.SpringAOPExample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
