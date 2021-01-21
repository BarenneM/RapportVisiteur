package com.rapportvisiteur.rapportVisiteur.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;
import com.rapportvisiteur.rapportVisiteur.repository.VisiteurRepositoryItf;

@Service
public class VisiteurService implements VisiteurServiceItf {
	
	@Autowired
	private VisiteurRepositoryItf visiteurRepository;
	
	@Override
	public List<Visiteur> list() {
		return visiteurRepository.findAll();
	}
	
	@Override
	public Visiteur create(Visiteur visiteur) {
		return visiteurRepository.save(visiteur);
	}
	
	@Override
	public Visiteur getByIdentifiant(Long identifiant) {
		return visiteurRepository.findByIdentifiant(identifiant);
	}
	
	@Override
	public Visiteur deleteByIdentifiant(Long identifiant) {
		return visiteurRepository.deleteByIdentifiant(identifiant);
	}
	
	@Override
	public Visiteur updateByIdentifiant(Long identifiant, Visiteur visiteur) {
		visiteur.setIdentifiant(identifiant);
		return visiteurRepository.save(visiteur);
	}
	
}
