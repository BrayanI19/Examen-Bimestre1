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
public class Cliente extends Persona {
     private Integer idCliente;
    
    public Cliente (){
    
    }
       public  Cliente(Integer idCliente){
           this.idCliente = idCliente;
       }
        public Integer getIdCliente(){
            return idCliente;
        }
        public void setIdCliente(Integer idCliente){
            this.idCliente = idCliente;
        }

    @Override
    public String toString() {
        return "idCliente es"+getIdCliente();
    }
        
}
