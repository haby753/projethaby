package com.example.demo.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.SessionFormation;
import com.example.demo.service.*;


@RestController
@RequestMapping("/api/sessionformation")
@CrossOrigin
 public class SessionFormationRESTController {
	
     @Autowired
     SessionFormationService sessionFormationService;
     
     @RequestMapping( value="/all", method = RequestMethod.GET)
     
     public List<SessionFormation> getAllSessionFormation() {
         return sessionFormationService.getSessionFormationAll();
   }
     
     @RequestMapping(value="/{id}",method = RequestMethod.GET) public
     SessionFormation getSessionFormationById(@PathVariable("id") Long id) {
     return sessionFormationService.getSessionFormationById(id);
  }
     @RequestMapping(method = RequestMethod.POST)
     public SessionFormation createsessionformation(@RequestBody SessionFormation sessionformation ) 
     { return sessionFormationService.addSessionFormation(sessionformation);
     }
 
}

