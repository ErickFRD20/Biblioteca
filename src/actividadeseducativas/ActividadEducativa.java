
package actividadeseducativas;

import java.time.LocalDate;

/**
 *
 * @author Dylan
 */
public class ActividadEducativa {
    
TipoActividades nombreActividad;   
private LocalDate fecha;        
private LocalDate hora;        
private int[] cupoMax;
Usuario usuarioInscrito;

    public TipoActividades getNombreActividad() {
        return nombreActividad;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalDate getHora() {
        return hora;
    }

    public int[] getCupoMax() {
        return cupoMax;
    }

    public Usuario getUsuarioInscrito() {
        return usuarioInscrito;
    }

    public void setNombreActividad(TipoActividades nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public void setCupoMax(int[] cupoMax) {
        this.cupoMax = cupoMax;
    }

    public void setUsuarioInscrito(Usuario usuarioInscrito) {
        this.usuarioInscrito = usuarioInscrito;
    }

    public int cupoDisp(){
        for (int i = 0; i < cupoMax.length; i++) {
            if (cupoDisp() == i) {
                
                
            }
        }
    return -1;
    }
    
    
    public ActividadEducativa(TipoActividades nombreActividad, LocalDate fecha, LocalDate hora, int[] cupoMax, Usuario usuarioInscrito) {
        this.nombreActividad = nombreActividad;
        this.fecha = fecha;
        this.hora = hora;
        this.cupoMax = cupoMax;
        this.usuarioInscrito = usuarioInscrito;
    }

    @Override
    public String toString() {
        return "ActividadEducativa: "  + nombreActividad + " Fecha: " + fecha + " Hora: " + hora + " CupoMax: " + cupoMax + "Usuario Inscrito: " + usuarioInscrito;
    }



}
