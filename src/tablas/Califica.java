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
public class Califica extends Tabla{
    private final NombreTabla nombre = NombreTabla.CALIFICA;
    private String noCtrl;
    private String cveMat;
    private String cveMaestro;
    private int calificacion;
    private int oportunidad;

    public Califica() {
        
    }

    public Califica(String noCtrl, String cveMat, String cveMaestro, int calificacion, int oportunidad) {
        this.noCtrl = noCtrl;
        this.cveMat = cveMat;
        this.cveMaestro = cveMaestro;
        this.calificacion = calificacion;
        this.oportunidad = oportunidad;
    }
    
    @Override
    public NombreTabla getNombreTabla(){
        return nombre;
    }

    public String getNoCtrl() {
        return noCtrl;
    }

    public void setNoCtrl(String noCtrl) {
        this.noCtrl = noCtrl;
    }

    public String getCveMat() {
        return cveMat;
    }

    public void setCveMat(String cveMat) {
        this.cveMat = cveMat;
    }

    public String getCveMaestro() {
        return cveMaestro;
    }

    public void setCveMaestro(String cveMaestro) {
        this.cveMaestro = cveMaestro;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getOportunidad() {
        return oportunidad;
    }

    public void setOportunidad(int oportunidad) {
        this.oportunidad = oportunidad;
    }
    
}
