package com.google.gwt.demo.polymerapis;

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;
import com.google.gwt.demo.myelemental.HTMLElement;

@JsType
public interface CoreDrawerPanel extends HTMLElement {

  void closeDrawer();

  void togglePanel();

  // TODO(digi): Rename to isNarrow() when JsType parsing allows.
  @JsProperty boolean getNarrow();
}
