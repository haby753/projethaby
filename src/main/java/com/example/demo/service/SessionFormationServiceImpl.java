package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import com.example.demo.entity.SessionFormation;

import com.example.demo.repository.SessionFormationRepository;


@Service
public class SessionFormationServiceImpl implements SessionFormationService {
	@Autowired	
    private SessionFormationRepository sessionFormationRepository;

	@Override
	public SessionFormation addSessionFormation(SessionFormation p) {
		// TODO Auto-generated method stub
		return sessionFormationRepository.save(p);
	}

	@Override
	public void deleteSessionFormation(SessionFormation p) {
		// TODO Auto-generated method stub
		  sessionFormationRepository.delete(p);;
		
	}

	@Override
	public void deleteSessionFormationById(Long id) {
		// TODO Auto-generated method stub
		
		  sessionFormationRepository.deleteById(id);
	}

	@Override
	public SessionFormation getSessionFormationById(Long id) {
		// TODO Auto-generated method stub
		return sessionFormationRepository.getReferenceById(id) ;
	}

	@Override
	public List<SessionFormation> getSessionFormationAll() {
		// TODO Auto-generated method stub
		return sessionFormationRepository.findAll();
	}

	@Override
	public SessionFormation updateSessionFormation(SessionFormation p) {
		// TODO Auto-generated method stub
		return sessionFormationRepository.save(p);
	}
	  

}