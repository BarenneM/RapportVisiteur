package com.rapportvisiteur.rapportVisiteur.entite;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Rapport {

	private Long identifiant;
	private Date dateRapport;
	private String bilan; 
	private String motif; 
	
	public Rapport() {

	}
	
	public Rapport(Long identifiant, Date dateRapport, String bilan, String motif) {
		this();
		this.identifiant = identifiant;
		this.dateRapport = dateRapport;
		this.bilan = bilan; 
		this.motif = motif;
	}

	
	@Override
	public String toString() {
		return "Rapport [identifiant=" + identifiant + ", dateRapport=" + dateRapport + ", bilan=" + bilan + ", motif="
				+ motif + "]";
	}
			
// get et set 
	public Long getIdentifiant() {
		return identifiant;
	}

	

	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}

	public Date getDateRapport() {
		return dateRapport;
	}

	public void setDateRapport(Date dateRapport) {
		this.dateRapport = dateRapport;
	}

	public String getBilan() {
		return bilan;
	}

	public void setBilan(String bilan) {
		this.bilan = bilan;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}
	

	
}
