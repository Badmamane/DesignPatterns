package com.act.ppce.listeners;

import javax.swing.event.EventListenerList;

import com.act.ppce.EmailStrategy;
import com.act.ppce.EntiteEvent;

public class ProductHelper {
  public void dispatchEvent(final EventListenerList eventList, final EntiteEvent event) {
	ProductListner pListner;
    for(ProductListner listner : getProductListeners(eventList)){
      if (listner != null) {
    	  switch (event.get_type()) {
		case _emailRequired:
			pListner = (EmailStrategy) listner;
			System.out.println("operate");
			pListner.operate(event);
			break;
		default:
			break;
		}
		
	  }
	}
  }
  
  public static ProductListner[] getProductListeners(final EventListenerList eventList) {
	return eventList.getListeners(ProductListner.class);
  }
}
