package com.example.demo.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Formation;
import com.example.demo.repository.FormationRepository;


@Service
public class FormationServiceImpl implements FormationService {
	@Autowired	
    private FormationRepository formationRepository;

	@Override
	public Formation addFormation(Formation p) {
		// TODO Auto-generated method stub
		return formationRepository.save(p);
	}

	@Override
	public void deleteFormation(Formation p) {
		// TODO Auto-generated method stub
		  formationRepository.delete(p);;
		
	}

	@Override
	public void deleteFormationById(Long id) {
		// TODO Auto-generated method stub
		
		  formationRepository.deleteById(id);
	}

	@Override
	public Formation getFormationById(Long id) {
		// TODO Auto-generated method stub
		return formationRepository.getReferenceById(id) ;
	}

	@Override
	public List<Formation> getFormationAll() {
		// TODO Auto-generated method stub
		return formationRepository.findAll();
	}

	@Override
	public Formation updateFormation(Formation p) {
		// TODO Auto-generated method stub
		return formationRepository.save(p);
	}
	  

}