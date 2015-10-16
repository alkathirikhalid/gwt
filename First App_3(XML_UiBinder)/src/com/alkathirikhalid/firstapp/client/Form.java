package com.alkathirikhalid.firstapp.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Form extends Composite {

	private static FormUiBinder uiBinder = GWT.create(FormUiBinder.class);

	interface FormUiBinder extends UiBinder<Widget, Form> {
	}

	public Form() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
