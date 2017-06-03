package com.act.ppce;

public class Consommateur extends Entite {
  private String _email;

  public Consommateur(final long id, final String nom, final String email) {
	super(id, nom);
	_email = email;
	_type = EntiteType.consommateur;
  }
  
  public String get_email() {
	return _email;
  }
  
  public void set_email(final String email) {
    _email = email;
  }
  
  public void commit(final Produit produit) {
	final Consommateur ancienConsommateur = this;
	ProductOperationsManager.getInstance().entiteEdited(ancienConsommateur, this, produit);
  }
}
