package com.act.ppce;

import com.act.ppce.listeners.ProductListenerAdapter;

public class EmailStrategy extends ProductListenerAdapter {
  
  public EmailStrategy () {};

  @Override
  public boolean operate(EntiteEvent event) {
	final String email = event.get_consommateur().get_email(); 
	if (!email.isEmpty()) {
	  return sendEmail(email);
	}
	return false;
  }

  private final boolean sendEmail(String email) {
    System.out.println("Vous avez changé votre email à " + email);
	return true;
  }
 }