package com.google.gwt.polymerdemo.myelemental;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Event {
  
  @JsProperty Detail getDetail();

  @JsType
  public interface Detail {
  }
}
