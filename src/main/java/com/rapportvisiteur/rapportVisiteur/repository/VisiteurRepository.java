package com.rapportvisiteur.rapportVisiteur.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;

@Repository
public class VisiteurRepository implements VisiteurRepositoryItf {
	private Map<Long, Visiteur> visiteurs;
// 	private Long idVisiteur = 1L;
	
	public VisiteurRepository() {
		visiteurs = new HashMap<>();
	}
	@Override
	public Visiteur save(Visiteur visiteur) {
	// 	set / id a voir autoecremnte pour n e pas le faire dans
		visiteurs.put(visiteur.getIdentifiant(), visiteur);
		return visiteur;
	}
	@Override
	public List<Visiteur> findAll() {
		return new ArrayList<>(visiteurs.values());
	}
	@Override
	public Visiteur findByIdentifiant(Long identifiant) {
		return visiteurs.get(identifiant);
	}
	@Override
	public Visiteur deleteByIdentifiant(Long identifiant) {
		return visiteurs.remove(identifiant);
	}
}

