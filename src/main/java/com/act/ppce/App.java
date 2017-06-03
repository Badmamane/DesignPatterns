package com.act.ppce;

import com.act.ppce.listeners.Bague;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) {
	  Produit produitAchete = new Bague("La bague dorée", 1, (float) 1.65);
	  Consommateur consommateur = new Consommateur(12, "ali", "ali@yahoo.fr");
	  ProductOperationsManager.getInstance().addEventListener(new EmailStrategy());
	  consommateur.commit(produitAchete);
	}
}
