package com.alkathirikhalid.firstapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
// This would be like our Main
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		// Add 
		RootPanel.get().add(new Label("Welcome!"));

	}

}
