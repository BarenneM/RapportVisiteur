package com.rapportvisiteur.rapportVisiteur.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;
import com.rapportvisiteur.rapportVisiteur.service.VisiteurServiceItf;

@RestController
@RequestMapping("/visiteur")
@CrossOrigin("*")
public class VisiteurRestApi {
	
	@Autowired
	private VisiteurServiceItf visiteurService;
	
	@GetMapping("")
	public List<Visiteur> list() {
		System.out.println("InvoiceControllerWeb - displayHome");
		List<Visiteur> visiteurs = visiteurService.list();
		System.out.println("visiteurs=" + visiteurs);
		return visiteurs;
	}

	@GetMapping("/{id}")
	public Visiteur get(@PathVariable("id") Long identifiant) {
		System.out.println("VisiteurRestApi - get(id) ");
		return visiteurService.getByIdentifiant(identifiant);
	}
	
	@PostMapping("")
	public Visiteur create(@RequestBody Visiteur visiteur) {
        return visiteurService.create(visiteur);
	}
	
	@PutMapping("/{id}")
	public Visiteur update(@PathVariable("id") Long identifiant, @RequestBody Visiteur visiteur) {
		return visiteurService.updateByIdentifiant(identifiant, visiteur);
	}
	
	@DeleteMapping("/{id}")
	public Visiteur delete(@PathVariable("id") Long identifiant) {
		return visiteurService.deleteByIdentifiant(identifiant);
	}
	
}
