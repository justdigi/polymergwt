package com.google.gwt.polymerdemo.entry;

import com.google.gwt.core.client.GWT;
import com.google.gwt.polymerdemo.myelemental.Event;
import com.google.gwt.polymerdemo.myelemental.EventListener;
import com.google.gwt.polymerdemo.polymerstubs.CoreDrawerPanel;
import com.google.gwt.polymerdemo.polymerstubs.CoreIconButton;
import com.google.gwt.polymerdemo.polymerstubs.CoreResponsiveChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MyView extends Composite {

  interface Binder extends UiBinder<HTMLPanel, MyView> {}
  private static Binder binder = GWT.create(Binder.class);

  @UiField
  CoreIconButton menuButton;
  
  @UiField
  CoreIconButton starButton;
  
  @UiField
  CoreDrawerPanel drawerPanel;
  
  public MyView() {
    initWidget(binder.createAndBindUi(this));
    
    menuButton.setHidden(!drawerPanel.getNarrow());
    menuButton.addEventListener("click", new EventListener() {
      @Override 
      public void handleEvent(Event event) {
        drawerPanel.togglePanel();
      }
    });

    starButton.addEventListener("click", new EventListener() {
      @Override 
      public void handleEvent(Event event) {
        Window.alert("You pressed the star!");
      }
    });
    
    drawerPanel.addEventListener("core-responsive-change", new EventListener() {   
      @Override
      public void handleEvent(Event event) {
        boolean isNowNarrow = ((CoreResponsiveChangeEvent) event).getDetail().getNarrow();
        menuButton.setHidden(!isNowNarrow);
      }
    });
  }
}
