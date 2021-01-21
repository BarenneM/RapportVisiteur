package com.rapportvisiteur.rapportVisiteur.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.rapportvisiteur.rapportVisiteur.entite.Rapport;
import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;



@Repository
public class RapportRepository implements RapportRepositoryItf {
	private Map<Long, Rapport> rapports;
	
	public RapportRepository() {
		rapports = new HashMap<>();
	}
	
	@Override
	public Rapport save(Rapport rapport) {
		rapports.put(rapport.getIdentifiant(), rapport);
		return rapport;
	}
	
	@Override
	public List<Rapport> findAll() {
		return new ArrayList<>(rapports.values());
	}
	@Override
	public Rapport findByIdentifiant(Long identifiant) {
		return rapports.get(identifiant);
	}
	@Override
	public Rapport deleteByIdentifiant(Long identifiant) {
		return rapports.remove(identifiant);
	}
}
