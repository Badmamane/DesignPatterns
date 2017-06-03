package com.act.ppce.listeners;

import com.act.ppce.EntiteEvent;

public abstract class ProductListenerAdapter implements ProductListner {
	
  
  public ProductListenerAdapter() {
  }

  @Override
  public abstract boolean operate(EntiteEvent event);
}
