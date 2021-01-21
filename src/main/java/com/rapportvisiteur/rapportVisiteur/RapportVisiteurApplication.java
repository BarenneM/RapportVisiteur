package com.rapportvisiteur.rapportVisiteur;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rapportvisiteur.rapportVisiteur.entite.Rapport;
import com.rapportvisiteur.rapportVisiteur.entite.Visiteur;
import com.rapportvisiteur.rapportVisiteur.repository.RapportRepositoryItf;
import com.rapportvisiteur.rapportVisiteur.service.RapportServiceItf;
import com.rapportvisiteur.rapportVisiteur.service.VisiteurServiceItf;

@SpringBootApplication
public class RapportVisiteurApplication {
	
	public static void main(String[] args) {
		//on récupère le composant qui va lancer les services, repository et entitees
		ApplicationContext ctx = SpringApplication.run(RapportVisiteurApplication.class, args);
		VisiteurServiceItf visiteurService = ctx.getBean(VisiteurServiceItf.class);
		RapportRepositoryItf rapportRepository = ctx.getBean(RapportRepositoryItf.class);
		RapportServiceItf rapportService = ctx.getBean(RapportServiceItf.class);
		
		
		Visiteur visiteur1 = new Visiteur(1L, "LEVOTHYROX", new Date()); 
		Visiteur visiteur2 = new Visiteur(2L, "KLIKLI", new Date()); 
		Visiteur visiteur3 = new Visiteur(3L, "BACO", new Date()); 
		Visiteur visiteur4 = new Visiteur(4L, "NAVER", new Date()); 
		
		visiteurService.create(visiteur1);
		visiteurService.create(visiteur2);
		visiteurService.create(visiteur3);
		visiteurService.create(visiteur4);
		
		
		//TEST
		//System.out.println(visiteur1);
		//System.out.println(visiteur2);
		//System.out.println(visiteur3);
		//System.out.println(visiteur4);
		
		//System.out.println(visiteurService.list());

		//System.out.println("_____________________");
		//visiteurService.deleteByIdentifiant(1L);
		//System.out.println(visiteurService.list());
		
		//System.out.println(visiteurService.getByIdentifiant(4L));
		
		//System.out.println(visiteurService.updateByIdentifiant(5L, visiteur1));
		
		
		Rapport rapport1 = new Rapport(1L, new Date(), "C'est bien", "visite de courtoisie");
		Rapport rapport2 = new Rapport(2L, new Date(), "pas ouf", "visite de politesse");
		Rapport rapport3 = new Rapport(3L, new Date(), "bien", "visite scolaire");
		
		
		//System.out.println(rapport1);
		//System.out.println(rapport2);
		//System.out.println(rapport3);
		
		rapportRepository.save(rapport1);
		rapportRepository.save(rapport2);
		rapportRepository.save(rapport3);
		//System.out.println("__________");
		//System.out.println(rapportRepository.findByIdentifiant(2L));
		
		//rapportRepository.deleteByIdentifiant(1L);
		//System.out.println(rapportRepository.findByIdentifiant(2L));
		//System.out.println(rapportRepository.findByIdentifiant(1L));
		
		//System.out.println("____________");
		//System.out.println(rapportRepository.findAll());
		
		System.out.println("_________");
		//System.out.println(rapportService.list());
		
		//System.out.println(rapportService.getByIdentifiant(2L));
		//rapportService.deleteByIdentifiant(2L);
		
		//rapportService.updateByIdentifiant(5L, rapport2);
		System.out.println(rapportService.list());
		
		rapportService.createRapportVisiteur(visiteur1, rapport1);
		System.out.println(visiteur1.getRapport());
	
		
	}
}


