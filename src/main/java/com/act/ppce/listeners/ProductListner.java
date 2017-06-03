package com.act.ppce.listeners;

import java.util.EventListener;

import com.act.ppce.EntiteEvent;

public interface ProductListner extends EventListener {
  boolean operate(EntiteEvent event);
}
