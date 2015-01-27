package com.google.gwt.polymerdemo.entry;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.ImageResource;

public interface PolymerGwtResources extends ClientBundle {

  @Source("PolymerGwt.css")
  Css css();
 
  ImageResource star();

  interface Css extends CssResource {
    String drawer();
    String main();
    String toolbar();
  }
}
