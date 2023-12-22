package com.example.demo.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Formation;
import com.example.demo.service.*;


@RestController
@RequestMapping("/api/formation")
@CrossOrigin
 public class FormationRESTController {
	
     @Autowired
     FormationService formationService;
     
     @RequestMapping( value="/all", method = RequestMethod.GET)
     
     public List<Formation> getAllFormation() {
         return formationService.getFormationAll();
   }
     @RequestMapping(value="/{id}",method = RequestMethod.GET) public
     Formation getFormationById(@PathVariable("id") Long id) {
     return formationService.getFormationById(id);
     }
     
     @RequestMapping(method = RequestMethod.POST)
     public Formation createformation(@RequestBody Formation formation ) 
     { return formationService.addFormation(formation);
     }  
     
}
