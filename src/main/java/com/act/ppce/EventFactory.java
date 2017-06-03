package com.act.ppce;

import java.util.Date;

public class EventFactory {
  public static EntiteEvent getEvent(final int idComposant, final Consommateur consommateurAncien, final Consommateur consommateurNouveau, final Date date, final Produit produit) {
	switch (idComposant) {
	case 21: 
	  return new EmailEvent(idComposant, date, EntiteEventType._emailRequired, consommateurAncien, consommateurNouveau, produit);
	default:
	  return null;
	}
  }
}
