package com.rapportvisiteur.rapportVisiteur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapportvisiteur.rapportVisiteur.entite.Rapport;
import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;
import com.rapportvisiteur.rapportVisiteur.repository.RapportRepositoryItf;


@Service
public class RapportService implements RapportServiceItf {
	@Autowired
	private RapportRepositoryItf rapportRepository;
	
	@Override
	public List<Rapport> list() {
		return rapportRepository.findAll();
	}
	
	@Override
	public Rapport getByIdentifiant(Long identifiant) {
		return rapportRepository.findByIdentifiant(identifiant);
	}
	@Override
	public Rapport deleteByIdentifiant(Long identifiant) {
		return rapportRepository.deleteByIdentifiant(identifiant);
	}
	
	@Override
	public Rapport updateByIdentifiant(Long identifiant, Rapport rapport) {
		rapport.setIdentifiant(identifiant);
		return rapportRepository.save(rapport);
	}

	@Override
	public Rapport createRapportVisiteur(Visiteur visiteur, Rapport rapport) {
		rapportRepository.save(rapport);
		visiteur.addRapport(rapport);
		return null;
	}
	
	
}