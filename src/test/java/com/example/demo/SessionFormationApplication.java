package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.repository.SessionFormationRepository;
import com.example.demo.entity.SessionFormation;


   @SpringBootTest
   class SessionFormationApplicationTests {
	   
	   @Autowired	
       private SessionFormationRepository SessionFormationRepository;


      @Test
      public void testCreateProduit() {
       SessionFormation prod = new SessionFormation();
       SessionFormationRepository.save(prod);
 }
}
