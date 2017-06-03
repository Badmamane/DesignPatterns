package com.act.ppce;

public abstract class Entite {
	
	protected String _nom;
	protected Long _id;
	protected EntiteType _type;
	
	public EntiteType get_type() {
		return _type;
	}

	public void set_type(EntiteType type) {
	  _type = type;
	}

	public Entite(Long id, String nom) {
      _id = id;
      _nom = nom;
	}

	public Long get_id() {
	  return _id;
    }

    public void set_id(Long id) {
	  _id = id;
    }
	  
	public String get_nom() {
	  return _nom;
	}

	public void set_nom(final String nom) {
	  _nom = nom;
	}
}
