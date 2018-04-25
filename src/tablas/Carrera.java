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
public class Carrera extends Tabla{
    private final NombreTabla nombre = NombreTabla.CARRERA;
    private String cveCarr;
    private String nomCarr;
    private int añoCarr;

    public Carrera() {
        
    }

    public Carrera(String cveCarr, String nomCarr, int añoCarr) {
        this.cveCarr = cveCarr;
        this.nomCarr = nomCarr;
        this.añoCarr = añoCarr;
    }
    
    @Override
    public NombreTabla getNombreTabla(){
        return nombre;
    } 
    
    public String getCveCarr() {
        return cveCarr;
    }

    public void setCveCarr(String cveCarr) {
        this.cveCarr = cveCarr;
    }

    public String getNomCarr() {
        return nomCarr;
    }

    public void setNomCarr(String nomCarr) {
        this.nomCarr = nomCarr;
    }

    public int getAñoCarr() {
        return añoCarr;
    }

    public void setAñoCarr(int añoCarr) {
        this.añoCarr = añoCarr;
    } 
}