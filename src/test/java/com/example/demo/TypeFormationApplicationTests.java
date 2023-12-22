package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repository.TypeFormationRepository;
import com.example.demo.entity.TypeFormation;

   @SpringBootTest
   class TypeFormationApplicationTests {
	   
	   @Autowired	
       private TypeFormationRepository TypeFormationRepository;

      @Test
      public void testCreateTypeFormation() {
    	  TypeFormation prod = new TypeFormation("id_typeformation",0, "libelle");
    	  TypeFormationRepository.save(prod);
 }
}
