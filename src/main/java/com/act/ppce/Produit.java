package com.act.ppce;

public abstract class Produit extends Entite {

  public Produit(String nom, Long id) {
	super(id, nom);
    _type = EntiteType.produit;
  }
  
  public void commit(final Consommateur consommateur) {
	final Produit ancienProduit = this;
	ProductOperationsManager.getInstance().entiteEdited(ancienProduit, this, consommateur);
  }
}
