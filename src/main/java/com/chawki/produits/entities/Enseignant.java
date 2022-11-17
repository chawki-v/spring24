package com.chawki.produits.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Enseignant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEnseignant;
	private String nomEnseignant;
	@ManyToOne
	private Matiere matiere;
	public Enseignant() {
		super();
	}

	public Enseignant(String nomEnseignant) {
		super();
		this.nomEnseignant = nomEnseignant;
	
	}

	public Long getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(Long idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	public String getNomEnseignant() {
		return nomEnseignant;
	}

	public void setNomEnseignant(String nomEnseignant) {
		this.nomEnseignant = nomEnseignant;
	}

	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nomEnseignant=" + nomEnseignant + "]";
	}

	
}
