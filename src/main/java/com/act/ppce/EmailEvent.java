package com.act.ppce;

import java.util.Date;

public class EmailEvent extends EntiteEvent {
  private final Consommateur _consommateurAncien;
  
  public EmailEvent(final int idVue, final Date time,
		  final EntiteEventType type, final Consommateur consommateurAncien, final Consommateur consommateurNouveau, final Produit produit) {
  super(idVue, time, produit, type, consommateurNouveau);
  
  _consommateurAncien = consommateurAncien;
  System.out.println("email event cree");
  }

  public Consommateur get_consommateurAncien() {
	return _consommateurAncien;
  }
}
