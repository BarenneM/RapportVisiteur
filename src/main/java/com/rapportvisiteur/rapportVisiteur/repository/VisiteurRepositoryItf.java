package com.rapportvisiteur.rapportVisiteur.repository;
import java.util.List;
import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;

public interface VisiteurRepositoryItf {
	Visiteur save(Visiteur visiteur);
	List<Visiteur> findAll();
	Visiteur findByIdentifiant(Long identifiant);
	Visiteur deleteByIdentifiant(Long identifiant);
}
