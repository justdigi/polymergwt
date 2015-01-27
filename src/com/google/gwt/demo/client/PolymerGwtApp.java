package com.google.gwt.demo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class PolymerGwtApp implements EntryPoint {

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    GWT.<PolymerGwtResources>create(PolymerGwtResources.class)
        .css().ensureInjected();
    
    RootPanel.get().add(new MyWidget());
  }
}
