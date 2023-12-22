package com.example.demo.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.TypeFormation;
import com.example.demo.service.*;


@RestController
@RequestMapping("/api/typeformation")
@CrossOrigin
 public class TypeformationRESTController {
	
     @Autowired
     TypeFormationService typeFormationService;
     
      @RequestMapping( value="/all", method = RequestMethod.GET)
      
      public List<TypeFormation> getAllTypeFormation() {
          return typeFormationService.getTypeFormationAll();
    }
      @RequestMapping(value="/{id}",method = RequestMethod.GET) public
      TypeFormation getTypeFormationById(@PathVariable("id") Long id) {
      return typeFormationService.getTypeFormationById(id);
   }
      @RequestMapping(method = RequestMethod.POST)
      public TypeFormation createtypeformation(@RequestBody TypeFormation typeformation) 
      { return typeFormationService.addTypeFormation(typeformation);
      }
 
 }


      
      

