/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

import java.util.List;
import tablas.NombreTabla;

/**
 *
 * @author emedina
 */
public class Localidad {
    private NodoId nodo;
    private List<NombreTabla> tablas;

    public Localidad(NodoId nodo,List<NombreTabla> tablas) {
        this.nodo = nodo;
        this.tablas = tablas;
    }

    public NodoId getNodo() {
        return nodo;
    } 

    public List<NombreTabla> getTablas() {
        return tablas;
    }
}