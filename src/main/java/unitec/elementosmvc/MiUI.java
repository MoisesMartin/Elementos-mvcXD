package unitec.elementosmvc;

import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;
import org.springframework.beans.factory.annotation.Autowired;

@SpringUI
public class MiUI extends UI {

    //Ponemos como atributo el repositorio
    @Autowired
    RepositorioMensaje repoMensa;//Inyeccion de dependencias

    @Override
    protected void init(VaadinRequest request) {
        //Aqui ira toda la interfaz de usuario
        VerticalLayout layout = new VerticalLayout();
        Label etiqueta = new Label("Bienvenido a mi aplicacion");
        etiqueta.addStyleName(ValoTheme.LABEL_H2);
        Label et2 = new Label("NuevoMensaje:");
        et2.addStyleName(ValoTheme.LABEL_H3);
        TextField texto = new TextField();
        texto.setPlaceholder("CuerpoMensaje");
        Button boton = new Button("Guardar Mensaje");
        boton.addStyleName(ValoTheme.BUTTON_FRIENDLY);
        //CASO 1 GUARDAR
        //Manejamos el evento de tipo boton "programación funcional"
        boton.addClickListener(algo -> {
            String valor = texto.getValue();
            //Guardamos
         // repoMensa.save(new Mensaje(cuerpo));
            ///Enviamos un mensajito al user
            Notification.show("Mensaje Guardado", Notification.Type.ERROR_MESSAGE);
        }
        );
        //CASO 2 Buscar Todos
        Grid<Mensaje> grid = new Grid<>();
        grid.setItems(repoMensa.findAll());

        grid.addColumn(Mensaje::getId).setCaption("ID");
        grid.addColumn(Mensaje::getCuerpo).setCaption("CUERPO");
      

        
        
        //Agregamos la etiqueta y el boton a el layout
        layout.addComponent(etiqueta);
        layout.addComponent(et2);
        layout.addComponent(texto);
        layout.addComponent(boton);
        //Agregamos dicha componente a nuestro layout
        layout.addComponent(grid);
        
        //Finalmente agregamos el layout al cintenedor principal de init
        setContent(layout);

    }
}
