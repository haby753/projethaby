package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.repository.FormationRepository;
import com.example.demo.entity.Formation;

   @SpringBootTest
   class FormationApplicationTests {
	   
	   @Autowired	
       private FormationRepository FormationRepository;


      @Test
      public void testCreateFormation() {
    	  Formation prod = new Formation("Description",5);
    	  FormationRepository.save(prod);
 }
}
