package com.google.gwt.polymerdemo.myelemental;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface EventListener {
  void handleEvent(Event event);
}
