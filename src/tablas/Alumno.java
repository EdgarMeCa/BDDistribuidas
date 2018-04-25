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
public class Alumno extends Tabla{
    private final NombreTabla nombre = NombreTabla.ALUMNO;
    protected String noCtrl;
    protected String nom;
    protected String ap;
    protected String am;
    protected String dom;
    protected String tel;
    protected String cveCar;
    protected String sem;
    protected String prom;
    protected String titulo;

    public Alumno() {
        
    }

    public Alumno(String noCtrl, String nom, String ap, String am, String dom, String tel, String cveCar, String sem, String prom, String titulo) {
        this.noCtrl = noCtrl;
        this.nom = nom;
        this.ap = ap;
        this.am = am;
        this.dom = dom;
        this.tel = tel;
        this.cveCar = cveCar;
        this.sem = sem;
        this.prom = prom;
        this.titulo = titulo;
    }
    
    public boolean isLic() {
        return this.titulo.equalsIgnoreCase("Lic");
    }
    
    public boolean isIng() {
        return this.titulo.equalsIgnoreCase("Ing");
    }
    
    public NombreTabla getNombreTabla(){
        return nombre;
    }
}