package com.example.demo.service;

import java.util.List;

import com.example.demo.entity. TypeFormation;

public interface TypeFormationService {

	  TypeFormation addTypeFormation( TypeFormation p);

  void deleteTypeFormation( TypeFormation p);
  
   void deleteTypeFormationById(Long id);
   
     TypeFormation getTypeFormationById(Long id);
    List< TypeFormation> getTypeFormationAll();

	 TypeFormation updateTypeFormation( TypeFormation p);
}
