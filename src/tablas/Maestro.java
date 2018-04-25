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
public class Maestro extends Tabla{
    private final NombreTabla nombre = NombreTabla.MAESTRO;
    private String cveMaestro;
    private String nomMaestro;
    private String apMaestro;
    private String amMaestro;
    private String grado;

    public Maestro() {
        
    }

    public Maestro(String cveMaestro, String nomMaestro, String apMaestro, String amMaestro, String grado) {
        this.cveMaestro = cveMaestro;
        this.nomMaestro = nomMaestro;
        this.apMaestro = apMaestro;
        this.amMaestro = amMaestro;
        this.grado = grado;
    }
    
    @Override
    public NombreTabla getNombreTabla(){
        return nombre;
    } 

    public String getCveMaestro() {
        return cveMaestro;
    }

    public void setCveMaestro(String cveMaestro) {
        this.cveMaestro = cveMaestro;
    }

    public String getNomMaestro() {
        return nomMaestro;
    }

    public void setNomMaestro(String nomMaestro) {
        this.nomMaestro = nomMaestro;
    }

    public String getApMaestro() {
        return apMaestro;
    }

    public void setApMaestro(String apMaestro) {
        this.apMaestro = apMaestro;
    }

    public String getAmMaestro() {
        return amMaestro;
    }

    public void setAmMaestro(String amMaestro) {
        this.amMaestro = amMaestro;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
}