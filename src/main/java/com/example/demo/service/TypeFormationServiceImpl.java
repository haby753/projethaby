package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.TypeFormation;
import com.example.demo.repository.TypeFormationRepository;

@Service
public class TypeFormationServiceImpl implements TypeFormationService {
	@Autowired	
    private TypeFormationRepository typeformationRepository;

	@Override
	public TypeFormation addTypeFormation(TypeFormation p) {
		// TODO Auto-generated method stub
		return typeformationRepository.save(p);
	}

	@Override
	public void deleteTypeFormation(TypeFormation p) {
		// TODO Auto-generated method stub
		  typeformationRepository.delete(p);;
		
	}

	@Override
	public void deleteTypeFormationById(Long id) {
		// TODO Auto-generated method stub
		
		  typeformationRepository.deleteById(id);
	}

	@Override
	public TypeFormation getTypeFormationById(Long id) {
		// TODO Auto-generated method stub
		return typeformationRepository.getReferenceById(id) ;
	}

	@Override
	public List<TypeFormation> getTypeFormationAll() {
		// TODO Auto-generated method stub
		return typeformationRepository.findAll();
	}

	@Override
	public TypeFormation updateTypeFormation(TypeFormation p) {
		// TODO Auto-generated method stub
		return typeformationRepository.save(p);
	}
	  

}