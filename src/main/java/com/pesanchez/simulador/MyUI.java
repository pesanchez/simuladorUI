package com.pesanchez.simulador;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@Theme("mytheme")
public class MyUI extends UI {
	private static final long serialVersionUID = 4474061105666140879L;

	@Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
    
        layout.setMargin(true);
        layout.setSpacing(true);
        
        
        final Button open = new Button("Open Sub-Window");
        open.addClickListener(new ClickListener() {
			private static final long serialVersionUID = -4110361455802117681L;

			public void buttonClick(ClickEvent event) {
                MySub sub = new MySub();

                // Add it to the root component
                UI.getCurrent().addWindow(sub);
            }
        });
        layout.addComponent(open);
        
        final Button btnWindow = new Button("Open Window");
        btnWindow.addClickListener(new ClickListener() {
			private static final long serialVersionUID = -4110361455802117681L;

			public void buttonClick(ClickEvent event) {
				// Create a new sub-window
				Window mywindow = new Window("Simulador");

				// Set window size.
				mywindow.setWidth("500px");
				mywindow.setHeight("650px");
				

				// Set window position.
				mywindow.setPositionX(200);
				mywindow.setPositionY(50);
				
				SimuladorDesign simulador = new SimuladorDesign();
				mywindow.setContent(simulador);

				UI.getCurrent().addWindow(mywindow);
			}
        });
        layout.addComponent(btnWindow);
        
        setContent(layout);
    }
    

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
		private static final long serialVersionUID = -3479729274628591261L;
    }
}
