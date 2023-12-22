package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.repository.UtilisateurRepository;
import com.example.demo.entity.Utilisateur;

   @SpringBootTest
   class UtilisateurApplicationTests {
	   
	   @Autowired	
       private UtilisateurRepository UtilisateurRepository;


      @Test
      public void testCreateUtilisateur(){
    	  Utilisateur prod = new Utilisateur("nom","prenom","email","motdepasse","role");
    	  UtilisateurRepository.save(prod);
 }
}
