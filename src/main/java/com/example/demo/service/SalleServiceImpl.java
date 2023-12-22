package com.example.demo.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Salle;

import com.example.demo.repository.SalleRepository;


@Service
public class SalleServiceImpl implements SalleService {
	@Autowired	
    private SalleRepository salleRepository;

	@Override
	public Salle addSalle(Salle p) {
		// TODO Auto-generated method stub
		return salleRepository.save(p);
	}

	@Override
	public void deleteSalle(Salle p) {
		// TODO Auto-generated method stub
		  salleRepository.delete(p);;
		
	}

	@Override
	public void deleteSalleById(Long id) {
		// TODO Auto-generated method stub
		
		  salleRepository.deleteById(id);
	}

	@Override
	public Salle getSalleById(Long id) {
		// TODO Auto-generated method stub
		return salleRepository.getReferenceById(id) ;
	}

	@Override
	public List<Salle> getSalleAll() {
		// TODO Auto-generated method stub
		return salleRepository.findAll();
	}

	@Override
	public Salle updateSalle(Salle p) {
		// TODO Auto-generated method stub
		return salleRepository.save(p);
	}
	  

}