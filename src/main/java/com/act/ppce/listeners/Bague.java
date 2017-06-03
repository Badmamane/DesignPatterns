package com.act.ppce.listeners;

import com.act.ppce.Produit;

public class Bague extends Produit {

  private float _circonference;
  
  public Bague(final String nom, final long id, final float circonference) {
	super(nom, id);
	_circonference = circonference;
  }

  public float getCirconference() {
	return _circonference;
  }

  public void setCirconference(final float circonference) {
	_circonference = circonference;
  }
}
