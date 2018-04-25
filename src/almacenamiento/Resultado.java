/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenamiento;

/**
 *
 * @author emedina
 */
public class Resultado {
    private String localidad;
    private String tabla;

    public Resultado(String localidad, String tabla) {
        this.localidad = localidad;
        this.tabla = tabla;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }
}