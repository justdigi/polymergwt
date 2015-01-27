package com.google.gwt.demo.client;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

public interface PolymerGwtResources extends ClientBundle {

  @Source("PolymerGwt.css")
  Css css();
  
  interface Css extends CssResource {
    String drawer();
    String main();
    String toolbar();
  }
}
