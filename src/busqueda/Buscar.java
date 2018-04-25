/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import java.util.List;
import nodo.*;
import tablas.NombreTabla;
import almacenamiento.*;
import java.util.ArrayList;

/**
 *
 * @author emedina
 */
public class Buscar {
    private List<CriterioBusqueda> criterio;
    private Localidad localidad;

    public Buscar(List<CriterioBusqueda> criterio, Localidad localidad) {
        this.criterio = criterio;
        this.localidad = localidad;
    }
    
    /**
     *
     */
    public void buscarCriteriaLocalidad(){
        if(tablasCriteriaEnLocalidad()){
            
        }
    }
    
    private boolean tablasCriteriaEnLocalidad(){
        boolean resultado = false;
        for(CriterioBusqueda cb : criterio){
            for(NombreTabla nt : localidad.getTablas()){
                if(cb.getNombreTabla() == nt || esAlumno(cb,nt)){
                    resultado = true;
                }
            }
        }
        return resultado;
    }
    
    private void busquedaPorTabla(){
        List<CriterioBusqueda> encontrados = new ArrayList<>();
        for(CriterioBusqueda cb : criterio){
            for(NombreTabla nt : localidad.getTablas()){
                if(esAlumno(cb,nt)){
                    
                } else {
                    encontrados.add(cb);
                    ResultadoBusqueda.getInstance().insertarResultado(new Resultado(nt.name(),cb.getNombreTabla().name()));
                }
            }
        }
    }
    
    private boolean esAlumno(CriterioBusqueda cb, NombreTabla nt){
        return (cb.getNombreTabla() == NombreTabla.ALUMNO && esFragmentoAlumno(nt));
    }
    
    private boolean esFragmentoAlumno(NombreTabla nt){
        return (nt == NombreTabla.ALUMNO1A || nt == NombreTabla.ALUMNO1B || nt == NombreTabla.ALUMNO2A || nt == NombreTabla.ALUMNO2B);
    }
    
    private void actualizarCriterioBusqueda(){
        
    }
}