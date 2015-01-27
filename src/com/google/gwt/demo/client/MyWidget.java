package com.google.gwt.demo.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class MyWidget extends Composite {

  private static MyWidgetUiBinder uiBinder = GWT.create(MyWidgetUiBinder.class);

  interface MyWidgetUiBinder extends UiBinder<HTMLPanel, MyWidget> {
  }

  public MyWidget() {
    initWidget(uiBinder.createAndBindUi(this));
  }
}
