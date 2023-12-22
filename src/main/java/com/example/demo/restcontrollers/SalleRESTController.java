package com.example.demo.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Salle;
import com.example.demo.entity.SessionFormation;
import com.example.demo.service.*;


@RestController
@RequestMapping("/api/salle")
@CrossOrigin
     public class SalleRESTController {
	
     @Autowired
     
     SalleService salleService;
     
      @RequestMapping( value="/all", method = RequestMethod.GET)
      
      public List<Salle> getAllSalle() {
          return salleService.getSalleAll();
    }
      
      @RequestMapping(value="/{id}",method = RequestMethod.GET) public
      Salle getSalleById(@PathVariable("id") Long id) {
      return salleService.getSalleById(id);
   }
      @RequestMapping(method = RequestMethod.POST)
      public Salle createsalle(@RequestBody Salle salle ) 
      { return salleService.addSalle(salle);
      }
      
      @RequestMapping(method = RequestMethod.PUT)
      public Salle updateSalle(@RequestBody Salle salle) 
      { return salleService.updateSalle(salle);
      }
}

