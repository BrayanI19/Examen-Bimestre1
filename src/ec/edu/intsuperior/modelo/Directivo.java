/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author USER
 */
public class Directivo {
   private Integer idDirectivo;
   private String categoria;
   private Integer sueldo;
   
public Directivo(){

}
    public Directivo(Integer idDirectivo, String categoria, Integer sueldo){
        this.idDirectivo = idDirectivo;
        this.categoria = categoria;
        this.sueldo = sueldo;
        
    }
    

    public Integer getIdDirectivo() {
        return idDirectivo;
    }

    public void setIdDirectivo(Integer idDirectivo) {
        this.idDirectivo = idDirectivo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "El idDirectivo es: "+getIdDirectivo()+"\n"
            +"La Categoria que ocupa es: "+getCategoria()+"\n"
            +"El Sueldo es: "+getSueldo();
    }
    
    
}
