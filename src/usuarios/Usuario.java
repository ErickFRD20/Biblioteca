/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Usuario {
    protected String nombre;
    protected String identificacion;
    protected LocalDate fechaNacimiento;
    protected String telefono;
    protected String correo;
    protected String direccion;
    protected LocalDate calcularEdad;

    public Usuario(String nombre, String identificacion, LocalDate fechaNacimiento, String telefono, String correo, String direccion, LocalDate calcularEdad) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.calcularEdad = calcularEdad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public LocalDate getCalcularEdad() {
        return calcularEdad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCalcularEdad(LocalDate calcularEdad) {
        this.calcularEdad = calcularEdad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + 
                ", identificacion=" + identificacion + 
                ", fechaNacimiento=" + fechaNacimiento + 
                ", telefono=" + telefono + 
                ", correo=" + correo + 
                ", direccion=" + direccion + 
                ", calcularEdad=" + calcularEdad + '}';
    }
    
    
    
}
