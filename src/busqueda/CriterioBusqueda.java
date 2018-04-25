/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;
import tablas.*;

/**
 *
 * @author emedina
 */
public class CriterioBusqueda {
    private NombreTabla nombreTabla;
    private String campo;
    private String operador;
    private String valor;

    public CriterioBusqueda() {
        
    }

    public CriterioBusqueda(NombreTabla nombreTable, String campo, String operador, String valor) {
        this.nombreTabla = nombreTable;
        this.campo = campo;
        this.operador = operador;
        this.valor = valor;
    }

    public NombreTabla getNombreTabla() {
        return nombreTabla;
    }

    public void setNombreTabla(NombreTabla nombreTable) {
        this.nombreTabla = nombreTable;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}