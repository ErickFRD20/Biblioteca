/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materialesbibliograficos;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class MaterialesBibliograficos {
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected LocalDate añoPublicacion;
    protected String categoria;
    protected boolean Estado;

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public LocalDate getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public MaterialesBibliograficos(int codigo, String titulo, String autor, LocalDate añoPublicacion, String categoria, boolean Estado) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.categoria = categoria;
        this.Estado = Estado;
    }
}
   

    
   
        
    
    
    
    
    
    

