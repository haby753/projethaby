package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "type_formations")
public class TypeFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_typeFormation")
    private Long id;

    @Column(name = "libelle")
    private String libelle;

    @Column(name = "niveau")
    private String niveau;
    
    @JsonIgnore
     @OneToMany(mappedBy = "typeFormation")
    private List<Formation> formations ;

    // Constructeurs, getters et setters

    public TypeFormation() {
    }

    public TypeFormation(String libelle, int duree, String niveau) {
        this.libelle = libelle;
     
        this.niveau = niveau;
    }

    // ... Getters and Setters ...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }



    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
}