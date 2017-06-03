package com.act.ppce;


import java.util.Date;

import javax.swing.event.EventListenerList;

import com.act.ppce.listeners.ProductHelper;
import com.act.ppce.listeners.ProductListner;

public class ProductOperationsManager extends Thread {

  public final EventListenerList _eventList = new EventListenerList();
  private EntiteEvent _EntiteEvent;
  
  private final ProductHelper productHelper = new ProductHelper();
  private static ProductOperationsManager INSTANCE = null;
  
  private ProductOperationsManager() {}

  @Override
  public void run() {
	System.out.println("run");
  }
  
  public static ProductOperationsManager getInstance() {
	  System.out.println("entrée de getInstance");
	if(!isInit()) {
	  System.out.println("éteint");
	  init();
	}
    return INSTANCE;
  }
  
  private static boolean isInit() {
	return INSTANCE == null ? false : true;
  }

  public void addEventListener(ProductListner listener) {
    _eventList.add(ProductListner.class, listener);
  }

  public void removeEventListener(ProductListner listener) {
	_eventList.remove(ProductListner.class, listener);
  }
  
  public static void init() {
	INSTANCE = new ProductOperationsManager();
	INSTANCE.start();
	System.out.println("allumé");
  }

  public void entiteEdited(Entite entiteAnciennne, Entite entiteNouvelle, Entite autreEntite) {
	if( ! entiteAnciennne.get_type().equals(entiteNouvelle.get_type())) {
	  throw new IllegalArgumentException("Operations Manager: types d'entités en entrée difféerentes." + entiteAnciennne.get_type() + "et" + entiteNouvelle.get_type());
	}
	// (badam) traiter les envent qui sont relatifs aux consommateurs
	switch (entiteAnciennne.get_type()) {
	  case consommateur:
		// déclencher un emailEvent s'il se trouve que l'email a changé
		// d'autres situations peuvent engendrer un emailEvent
		  System.out.println("devantIf");
		// aurait été utile si présence d'une base de données qui permet de récupérer l'ancienne antité 
	    //if( ((Consommateur) entiteAnciennne).get_email() != ((Consommateur) entiteNouvelle).get_email() ) {
	  	  System.out.println("event en creation");
		  _EntiteEvent = EventFactory.getEvent(21, (Consommateur) entiteAnciennne, (Consommateur) entiteNouvelle, new Date(), (Produit) autreEntite);
	   // }
		  productHelper.dispatchEvent(_eventList, _EntiteEvent);
	    break;
	  default:
	    break;
	// TODO: traiter les event qui sont relatifs aux produits
	}
  }
}
