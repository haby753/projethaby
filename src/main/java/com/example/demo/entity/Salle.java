package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

import jakarta.persistence.JoinColumn;
@Entity
public class Salle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_salle;
    private int capacite;
    
    @JsonIgnore
    @ManyToMany
    @JoinTable(
        name = "formation_salle",
        joinColumns = @JoinColumn(name = "salle_id"),
        inverseJoinColumns = @JoinColumn(name = "formation_id"))
    private List<Formation> formations;

    // Constructeur par défaut
    public Salle() {
    }

    // Constructeur avec paramètres
    public Salle(String nom_salle, int capacite) {
        this.nom_salle = nom_salle;
        this.capacite = capacite;
    }

    // Getters and setters
    
    public String getNom_salle() {
        return nom_salle;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}





	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public void setNom_salle(String nom_salle) {
        this.nom_salle = nom_salle;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}