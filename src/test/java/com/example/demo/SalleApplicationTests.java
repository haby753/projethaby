package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.repository.SalleRepository;
import com.example.demo.entity.Salle;

   @SpringBootTest
   class SalleApplicationTests {
	   
	   @Autowired	
       private SalleRepository SalleRepository;


      @Test
      public void testCreateSalle() {
    	  Salle prod = new Salle("nom_salle",50);
    	  SalleRepository.save(prod);
 }
}
