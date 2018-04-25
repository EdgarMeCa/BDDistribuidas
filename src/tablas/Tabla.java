/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

/**
 *
 * @author emedina
 */
public class Tabla {
    private final NombreTabla nombre = NombreTabla.TABLA;
    
    public Tabla() {
        
    }
    
    public NombreTabla getNombreTabla(){
        return nombre;
    }
}
