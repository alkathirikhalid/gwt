package com.alkathirikhalid.firstapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
	private Button button = new Button("Submit");
// This would be like our Main
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		// Add 
		//RootPanel.get().add(new Label("Welcome!"));
		//RootPanel.get("myDiv").add(new Label("Welcome"));
		RootPanel.get().add(button);

	}

}
