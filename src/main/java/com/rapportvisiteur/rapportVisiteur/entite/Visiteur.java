package com.rapportvisiteur.rapportVisiteur.entite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*Un identifiant de type Long
 Un nom de type String
 Une date d’embauche de type Date (package java.util.Date)
 Une liste de rapport
*/


public class Visiteur {
	private Long identifiant;
	private String nomVisiteur;
	private Date dateEmbauche;
	private List<Rapport> rapports;
	
// constructor	
public Visiteur() {
		rapports = new ArrayList<>();
	}	
	
public Visiteur (Long identifiant, String nomVisiteur, Date dateEmbauche) {
	this();
	this.identifiant = identifiant;
	this.nomVisiteur = nomVisiteur;
	this.dateEmbauche = dateEmbauche; 
}	

public Visiteur (Long identifiant, String nomVisiteur, Date dateEmbauche, List<Rapport> rapports) {
	this.identifiant = identifiant;
	this.nomVisiteur = nomVisiteur;
	this.dateEmbauche = dateEmbauche;
	this.rapports = rapports;
}

// methode ? 
public void addRapport(Rapport rapport) {
	rapports.add(rapport);
}

		
	
	
@Override
	public String toString() {
		return "Visiteur [identifiant=" + identifiant + ", nomVisiteur=" + nomVisiteur + ", dateEmbauche="
				+ dateEmbauche + ", rapport=" + rapports + "]";
	}




	// getter Setter	
	public Long getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}
	public String getNomVisiteur() {
		return nomVisiteur;
	}
	public void setNomVisiteur(String nomVisiteur) {
		this.nomVisiteur = nomVisiteur;
	}
	public Date getDateEmbauche() {
		return dateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}
	public List<Rapport> getRapport() {
		return rapports;
	}
	public void setRapport(List<Rapport> rapport) {
		this.rapports = rapport;
	}
	
	
	
	
}

