package com.rapportvisiteur.rapportVisiteur.repository;

import java.util.List;

import com.rapportvisiteur.rapportVisiteur.entite.Rapport;
import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;


public interface RapportRepositoryItf {

	Rapport save(Rapport rapport);
	List<Rapport> findAll();
	Rapport findByIdentifiant(Long identifiant);
	Rapport deleteByIdentifiant(Long identifiant);
}
