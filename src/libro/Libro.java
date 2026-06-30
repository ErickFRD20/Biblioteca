/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro;

/**
 *
 * @author Student
 */
public class Libro {
    protected String ejemplares;
    protected String editorial;
    protected String numPag;

    public String getEjemplares() {
        return ejemplares;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getNumPag() {
        return numPag;
    }

    public void setNumPag(String numPag) {
        this.numPag = numPag;
    }

    public Libro(String ejemplares, String editorial, String numPag) {
        this.ejemplares = ejemplares;
        this.editorial = editorial;
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Libro{" + "ejemplares=" + ejemplares + ", editorial=" + editorial + ", numPag=" + numPag + '}';
    }
    
    
}
