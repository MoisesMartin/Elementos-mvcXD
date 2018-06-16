/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

import java.time.LocalDate;
import org.springframework.data.annotation.Id;

public class Mensaje {
    @Id
    private String id;
    private String cuerpo;

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", cuerpo=" + cuerpo + ", fecha=" + fecha + '}';
    }
    private LocalDate fecha;
      //Este constructor es para hacer un UPDATE ya que incluye el id
    public Mensaje(String id, String cuerpo, LocalDate fecha) {
        this.id = id;//Terremoto de Oaxaca de 2018 
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }
    public Mensaje(String cuerpo, LocalDate fecha) {
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public Mensaje(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
   
    public Mensaje() {
    }

    Mensaje(LocalDate fecha, String mi_Primer_Mensaje) {
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
