package unitec.elementosmvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//Controlador MVC con arquitectura REST
@RequestMapping("/api")//Raiz de servicios api es estandar
@CrossOrigin//Origenes Cruzados 'servidor a servidor'
public class ControladorMensaje 
{
    @Autowired RepositorioMensaje repoMensa;
  //Caso 'A' Buscar Todos terremoto de Pinotep
    @GetMapping("/mensaje")
        public List<Mensaje>buscarTodos(){
        return repoMensa.findAll();      
        }
        
    //Caso 'B' Buscar por ID
        @GetMapping("/mensaje/{id}")
        public Mensaje buscarPoiId(@PathVariable String id)
        {
            Mensaje mensa=new Mensaje();
            mensa.setId(id);
            return repoMensa.findById(id).get();
        }
    }
