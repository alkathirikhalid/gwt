package com.alkathirikhalid.firstapp.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Home implements EntryPoint {
	private Form form = new Form();

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		RootPanel.get("myDiv").add(form);

	}

}
