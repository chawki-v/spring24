package com.chawki.produits.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.chawki.produits.entities.Matiere;
import com.chawki.produits.entities.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
	List<Enseignant> findByNomEnseignant(String nom);
	List<Enseignant> findByNomEnseignantContains(String nom);
	@Query("select p from Enseignant p where p.nomEnseignant like %:nom")
	List<Enseignant> findByNomPrix (@Param("nom") String nom);
	@Query("select p from Enseignant p where p.matiere = ?1")
	List<Enseignant> findByMatiere (Matiere matiere);
	List<Enseignant> findByMatiereIdMat(Long id);
	List<Enseignant> findByOrderByNomEnseignantAsc();
	@Query("select p from Enseignant p order by p.nomEnseignant ASC")
	List<Enseignant> trierEnseignantsNomsPrix ();
}
