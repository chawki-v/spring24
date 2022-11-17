package com.chawki.produits.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Matiere {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMat;
	private String nomMat;

	@JsonIgnore
	@OneToMany(mappedBy = "matiere")
	private List<Enseignant> enseignants;
	public Long getIdMat() {
		return idMat;
	}
	public void setIdMat(Long idMat) {
		this.idMat = idMat;
	}

}