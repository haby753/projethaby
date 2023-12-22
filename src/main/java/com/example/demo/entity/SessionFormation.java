package com.example.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "session_formations")
public class SessionFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_session")
    private Long id;

    @Column(name = "datededebut")
    private LocalDate dateDeDebut;

    @Column(name = "datedefin")
    private LocalDate dateDeFin;

    @Column(name = "lieu")
    private String lieu;
    
    @ManyToOne
    private Formation formation;
    
    @JsonIgnore
    @ManyToMany
    private List<Utilisateur> utilisateur;

    // Constructeurs, getters et setters

    public SessionFormation() {
    }

   

    // ... Getters and Setters ...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Formation getFormation() {
		return formation;
	}



	public void setFormation(Formation formation) {
		this.formation = formation;
	}



	public LocalDate getDateDeDebut() {
        return dateDeDebut;
    }

    public void setDateDeDebut(LocalDate dateDeDebut) {
        this.dateDeDebut = dateDeDebut;
    }

    public LocalDate getDateDeFin() {
        return dateDeFin;
    }

    public void setDateDeFin(LocalDate dateDeFin) {
        this.dateDeFin = dateDeFin;
    }

    public String getLieu() {
        return lieu;
    }

  



	public List<Utilisateur> getUtilisateur() {
		return utilisateur;
	}



	public void setUtilisateur(List<Utilisateur> utilisateur) {
		this.utilisateur = utilisateur;
	}



	public void setLieu(String lieu) {
        this.lieu = lieu;
    }
}