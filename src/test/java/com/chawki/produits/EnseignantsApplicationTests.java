package com.chawki.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.chawki.produits.entities.Matiere;
import com.chawki.produits.entities.Enseignant;
import com.chawki.produits.repos.EnseignantRepository;

@SpringBootTest
class EnseignantsApplicationTests {

	@Autowired
	private EnseignantRepository enseignantRepository;

	@Test
	public void testCreateEnseignant() {
		Enseignant ens = new Enseignant("chawki");
		enseignantRepository.save(ens);
	}

	@Test
	public void testFindEnseignant() {
		Enseignant p = enseignantRepository.findById(1L).get();
		System.out.println(p);
	}

	@Test
	public void testUpdateEnseignant() {
		Enseignant p = enseignantRepository.findById(1L).get();
		p.setNomEnseignant("hamed");
		enseignantRepository.save(p);
	}

	@Test
	public void testDeleteEnseignant() {
		enseignantRepository.deleteById(1L);
		;
	}

	@Test
	public void testListerTousProduits() {
		List<Enseignant> prods = enseignantRepository.findAll();
		for (Enseignant p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testFindByNomEnseignant() {
		List<Enseignant> prods = enseignantRepository.findByNomEnseignant("hamed");

		for (Enseignant p : prods) {
			System.out.println(p);
		}

	}

	@Test
	public void testFindByNomEnseignantContains() {
		List<Enseignant> prods = enseignantRepository.findByNomEnseignantContains("ha");

		for (Enseignant p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByNom() {
		List<Enseignant> prods = enseignantRepository.findByNomPrix("hamed");
		for (Enseignant p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByMatiere() {
		Matiere cat = new Matiere();
		cat.setIdMat(1L);
		List<Enseignant> prods = enseignantRepository.findByMatiere(cat);
		for (Enseignant p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void findByMatiereIdMat() {
		List<Enseignant> prods = enseignantRepository.findByMatiereIdMat(1L);
		for (Enseignant p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testfindByOrderByNomEnseignantAsc() {
		List<Enseignant> prods = enseignantRepository.findByOrderByNomEnseignantAsc();
		for (Enseignant p : prods) {
			System.out.println(p);
		}
	}

	@Test
	public void testTrierProduitsNomsPrix() {
		List<Enseignant> prods = enseignantRepository.trierEnseignantsNomsPrix();
		for (Enseignant p : prods) {
			System.out.println(p);
		}

	}

}
