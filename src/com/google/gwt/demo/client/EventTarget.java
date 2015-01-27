package com.google.gwt.demo.client;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventTarget {
  void addEventListener(String type, EventListener listener);
}
