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
public class Materia extends Tabla{
    private final NombreTabla nombre = NombreTabla.MATERIA;
    private String cveMat;
    private String nomMat;
    private int creditos;

    public Materia() {
        
    }

    public Materia(String cveMat, String nomMat, int creditos) {
        this.cveMat = cveMat;
        this.nomMat = nomMat;
        this.creditos = creditos;
    }
    
    @Override
    public NombreTabla getNombreTabla(){
        return nombre;
    } 

    public String getCveMat() {
        return cveMat;
    }

    public void setCveMat(String cveMat) {
        this.cveMat = cveMat;
    }

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }  
}