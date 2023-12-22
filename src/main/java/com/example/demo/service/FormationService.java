package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Formation;

public interface FormationService {
	
	Formation addFormation(Formation p);

  void deleteFormation(Formation p);
  
   void deleteFormationById(Long id);
   
    Formation getFormationById(Long id);
    List<Formation> getFormationAll();

	Formation updateFormation(Formation p);


}

 