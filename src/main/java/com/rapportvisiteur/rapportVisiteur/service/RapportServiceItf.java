package com.rapportvisiteur.rapportVisiteur.service;

import java.util.List;

import com.rapportvisiteur.rapportVisiteur.entite.Rapport;
import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;

public interface RapportServiceItf {
	
		List<Rapport> list();
		Rapport getByIdentifiant(Long identifiant);
		Rapport deleteByIdentifiant(Long identifiant);
		Rapport updateByIdentifiant(Long identifiant, Rapport rapport);
		Rapport createRapportVisiteur(Visiteur visiteur, Rapport rapport);
		
		// creer rapport pour une personne 
		//	Rapport create(Rapport rapport);
	//	Rapport createRapportVisiteur(Long visiteurIdentifiant, Rapport rapport);
}

