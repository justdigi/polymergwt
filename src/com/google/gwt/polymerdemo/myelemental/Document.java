package com.google.gwt.polymerdemo.myelemental;

import com.google.gwt.core.client.js.JsType;

@JsType
public interface Document extends Node {

  EventTarget getElementById(String id);
}