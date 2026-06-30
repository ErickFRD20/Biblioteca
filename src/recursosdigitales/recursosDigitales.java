/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursosdigitales;

/**
 *
 * @author Student
 */
public class recursosDigitales {
    protected String formato;
    protected String tamaño;
    protected String enlace;

    public String getFormato() {
        return formato;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getEnlace() {
        return enlace;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public recursosDigitales(String formato, String tamaño, String enlace) {
        this.formato = formato;
        this.tamaño = tamaño;
        this.enlace = enlace;
    }

    @Override
    public String toString() {
        return "recursosDigitales{" + "formato=" + formato + ", tama\u00f1o=" + tamaño + ", enlace=" + enlace + '}';
    }
    
    
}
