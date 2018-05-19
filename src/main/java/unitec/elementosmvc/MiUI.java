package unitec.elementosmvc;

import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

@SpringUI
public class MiUI extends UI{

    @Override
    protected void init(VaadinRequest request) {
    //Aqui ira toda la interfaz de usuario
    VerticalLayout layout = new VerticalLayout();
    Label etiqueta = new Label("Bienvenido a mi aplicacion");
    etiqueta.addStyleName(ValoTheme.LABEL_H2);
    Button boton = new Button("Ingresar");
    boton.addStyleName(ValoTheme.BUTTON_FRIENDLY);
    //Agregamos la etiqueta y el boton a el layout
    layout.addComponent(etiqueta);
    layout.addComponent(boton);
    //Finalmente agregamos el layout al cintenedor principal de init
        setContent(layout);
    
    }
}
