package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Utilisateur;
import com.example.demo.service.UtilisateurService;


@RestController
@RequestMapping("/api/utilisateur")
@CrossOrigin
     public class UtilisateurRESTController {
	
     @Autowired
     
     UtilisateurService utilisateurService;
     
      @RequestMapping( value="/all", method = RequestMethod.GET)
      
      public List<Utilisateur> getAllUtilisateur() {
          return utilisateurService.getUtilisateurAll();
    }
      @RequestMapping(value="/{id}",method = RequestMethod.GET) public
      Utilisateur getUtilisateurById(@PathVariable("id") Long id) {
      return utilisateurService.getUtilisateurById(id);
   }
      
      @RequestMapping(method = RequestMethod.POST)
      public Utilisateur createutilisateur(@RequestBody Utilisateur utilisateur) 
      { return utilisateurService.addUtilisateur(utilisateur);
      }

 }


      
      
      



