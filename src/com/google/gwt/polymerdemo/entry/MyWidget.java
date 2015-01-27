package com.google.gwt.polymerdemo.entry;

import com.google.gwt.core.client.GWT;
import com.google.gwt.polymerdemo.myelemental.Event;
import com.google.gwt.polymerdemo.myelemental.EventListener;
import com.google.gwt.polymerdemo.polymerapis.CoreDrawerPanel;
import com.google.gwt.polymerdemo.polymerapis.CoreIconButton;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MyWidget extends Composite {

  private static MyWidgetUiBinder uiBinder = GWT.create(MyWidgetUiBinder.class);

  interface MyWidgetUiBinder extends UiBinder<HTMLPanel, MyWidget> {}

  @UiField
  CoreIconButton menuButton;
  
  @UiField
  CoreDrawerPanel drawerPanel;
  
  public MyWidget() {
    initWidget(uiBinder.createAndBindUi(this));
    
    menuButton.addEventListener("click", new EventListener() {
      @Override public void handleEvent(Event event) {
        drawerPanel.togglePanel();
      }
    });
  }
}
