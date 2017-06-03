package com.act.ppce;

import java.util.Date;

public abstract class EntiteEvent {
  protected Date _time;
  protected Produit _produit;
  protected EntiteEventType _type;
  protected Consommateur _consommateur;
  protected int _idVue;

  public Consommateur get_consommateur() {
	return _consommateur;
  }

  public void set_consommateur(Consommateur consommateur) {
	_consommateur = consommateur;
  }

  public int get_idVue() {
	return _idVue;
  }

  public void set_idVue(int idVue) {
	_idVue = idVue;
  }

  public EntiteEvent(int idVue, Date time, Produit produit,
		                  EntiteEventType type, Consommateur consommateur) {
	_idVue = idVue;
	_time = time;
	_produit = produit;
	_type = type;
	_consommateur = consommateur;
  }
  
//  public EntiteEvent(int idVue, Date time,
//                          EntiteEventType type) {
//    _idVue = idVue;
//    _time = time;
//    _type = type;
//  }
  
  public EntiteEvent() {}

  public Date get_time() {
	return _time;
  }
  
  public void set_time(Date time) {
	_time = time;
  }
  
  public Produit get_produit() {
	return _produit;
  }

  public void set_produit(Produit produit) {
	_produit = produit;
  }

  public EntiteEventType get_type() {
	return _type;
  }

  public void set_type(EntiteEventType type) {
	_type = type;
  }
}
