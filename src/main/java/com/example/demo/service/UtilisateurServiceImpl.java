package com.example.demo.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Utilisateur;
import com.example.demo.repository.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
	@Autowired	
    private UtilisateurRepository utilisateurRepository;

	@Override
	public Utilisateur addUtilisateur(Utilisateur p) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(p);
		
	}

	@Override
	public void deleteUtilisateur(Utilisateur p) {
		// TODO Auto-generated method stub
		  utilisateurRepository.delete(p);
		
	}

	@Override
	public void deleteUtilisateurById(Long id) {
		// TODO Auto-generated method stub
		
		  utilisateurRepository.deleteById(id);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Utilisateur getUtilisateurById(Long id) {
		// TODO Auto-generated method stub
		return utilisateurRepository.getById(id) ;
	}

	@Override
	public List<Utilisateur> getUtilisateurAll() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur p) {
		// TODO Auto-generated method stub
		return utilisateurRepository.save(p);
	}
	  

}

