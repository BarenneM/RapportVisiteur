package com.rapportvisiteur.rapportVisiteur.service;

import java.util.List;

import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;


public interface VisiteurServiceItf {
	Visiteur create(Visiteur visiteur);
	List<Visiteur> list();
	Visiteur getByIdentifiant(Long identifiant);
	Visiteur deleteByIdentifiant(Long identifiant);
	Visiteur updateByIdentifiant(Long identifiant, Visiteur visiteur);
}
