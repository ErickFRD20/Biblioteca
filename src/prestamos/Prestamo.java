/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamos;

import java.time.LocalDate;
import usuarios.Usuario;
/**
 *
 * @author Student
 */
public class Prestamo extends Usuario{
    
    protected LocalDate fechaPrestamo;
    protected LocalDate fechaMaxDevolucion;
    protected LocalDate fechaRealDevolucion;

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaMaxDevolucion, LocalDate fechaRealDevolucion, String nombre, String identificacion, LocalDate fechaNacimiento, String telefono, String correo, String direccion, LocalDate calcularEdad) {
        super(nombre, identificacion, fechaNacimiento, telefono, correo, direccion, calcularEdad);
        this.fechaPrestamo = fechaPrestamo;
        this.fechaMaxDevolucion = fechaMaxDevolucion;
        this.fechaRealDevolucion = fechaRealDevolucion;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaMaxDevolucion() {
        return fechaMaxDevolucion;
    }

    public LocalDate getFechaRealDevolucion() {
        return fechaRealDevolucion;
    }

    public void setFechaMaxDevolucion(LocalDate fechaMaxDevolucion) {
        this.fechaMaxDevolucion = fechaMaxDevolucion;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaPrestamo=" + fechaPrestamo + 
                ", fechaMaxDevolucion=" + fechaMaxDevolucion + 
                ", fechaRealDevolucion=" + fechaRealDevolucion + '}';
    }
    

    }
    
    
  
 
