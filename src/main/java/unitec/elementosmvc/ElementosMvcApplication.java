package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ElementosMvcApplication implements CommandLineRunner {

    //Para realizar la inyeccion se usa la anotacion
    @Autowired
    RepositorioMensaje repoMensa;
    @Autowired
    ServicioTarjeta servicio;

    public static void main(String[] args) {
        SpringApplication.run(ElementosMvcApplication.class, args);
        //servicio.obtenerSaldo();//El main se carga antes ergo servicio se queda sin inicializar xD
    }

    @Override
    public void run(String... args) throws Exception {
      /*
        //Aqui se prueba todo
        servicio.obtenerSaldo();
        LocalDate fecha = LocalDate.now();
        //repoMensa.save(new Mensaje("Hola",fecha,"Dec"));
        */
        //BUSCAR TODOS
        /* for(Mensaje mensa: repoMensa.findAll())
        {
	System.out.println(mensa);
        }
         */
        //BUSCAR POR ID       
        //System.out.println(repoMensa.findById("5b08c87f40825e07a4eec25b").get());
       /* System.out.println(repoMensa.findByCuerpo("MiPrimerMensaje"));
        //ACTUALIZAR
        repoMensa.save(new Mensaje("Hola", fecha, "Dec"));
        for (Mensaje mensa : repoMensa.findAll()) {
            System.out.println(mensa);
        }
        //Borrar
        Mensaje m= new Mensaje();
        m.setId("Hola");
        repoMensa.deleteById(new Mensaje(m));
        */
    }
}
