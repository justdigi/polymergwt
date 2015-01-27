package com.google.gwt.demo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MyWidget extends Composite {

  private static MyWidgetUiBinder uiBinder = GWT.create(MyWidgetUiBinder.class);

  interface MyWidgetUiBinder extends UiBinder<HTMLPanel, MyWidget> {}

  @UiField
  CoreIconButton menuButton;
  
  public MyWidget() {
    initWidget(uiBinder.createAndBindUi(this));
    
    menuButton.addEventListener("click", new EventListener() {
      @Override public void handleEvent(Event event) {
        Window.alert("wow");
      }
    });
  }
}
