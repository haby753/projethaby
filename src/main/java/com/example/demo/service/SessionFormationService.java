package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.SessionFormation;

public interface SessionFormationService {
	SessionFormation addSessionFormation(SessionFormation p);

	  void deleteSessionFormation(SessionFormation p);
	  
	   void deleteSessionFormationById(Long id);
	   
	    SessionFormation getSessionFormationById(Long id);
	    List<SessionFormation> getSessionFormationAll();

		SessionFormation updateSessionFormation(SessionFormation p);
}
