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

import com.rapportvisiteur.rapportVisiteur.entite.Rapport;
import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;
import com.rapportvisiteur.rapportVisiteur.service.RapportService;
import com.rapportvisiteur.rapportVisiteur.service.RapportServiceItf;
import com.rapportvisiteur.rapportVisiteur.service.VisiteurServiceItf;

@RestController
@RequestMapping("/rapport")
@CrossOrigin("*")
public class RapportRestApi {

	@Autowired
	private RapportServiceItf rapportService;
	
	@GetMapping("")
	public List<Rapport> list() {
		System.out.println("InvoiceControllerWeb - displayHome");
		List<Rapport> rapports = rapportService.list();
		System.out.println("rapports=" + rapports);
		return rapports;
	}
/*
	@GetMapping("/{id}")
	public Visiteur get(@PathVariable("id") Long identifiant) {
		System.out.println("VisiteurRestApi - get(id) ");
		return rapportService.getByIdentifiant(identifiant);
	}
	
	@PostMapping("")
	public Visiteur create(@RequestBody Visiteur visiteur) {
        return rapportService.create(visiteur);
	}
	
	@PutMapping("/{id}")
	public Visiteur update(@PathVariable("id") Long identifiant, @RequestBody Visiteur visiteur) {
		return rapportService.updateByIdentifiant(identifiant, visiteur);
	}
	
	@DeleteMapping("/{id}")
	public Visiteur delete(@PathVariable("id") Long identifiant) {
		return rapportService.deleteByIdentifiant(identifiant);
	}
*/
}
