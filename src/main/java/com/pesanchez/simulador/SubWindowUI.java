package com.pesanchez.simulador;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

public class SubWindowUI extends MyUI {

	private static final long serialVersionUID = -7830629857376100721L;

	@Override
	protected void init(VaadinRequest vaadinRequest) {
		// Some other UI content
	    setContent(new Label("Here's my UI"));

	    // Create a sub-window and set the content
	    Window subWindow = new Window("Sub-window");
	    VerticalLayout subContent = new VerticalLayout();
	    subContent.setMargin(true);
	    subWindow.setContent(subContent);

	    // Put some components in it
	    subContent.addComponent(new Label("Meatball sub"));
	    subContent.addComponent(new Button("Awlright"));

	    // Center it in the browser window
	    subWindow.center();

	    // Open it in the UI
	    addWindow(subWindow);
	}
	
}
