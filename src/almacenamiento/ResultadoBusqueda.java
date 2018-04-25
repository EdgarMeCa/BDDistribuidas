/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacenamiento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author emedina
 */
public class ResultadoBusqueda {
    private List<Resultado> resultados = new ArrayList<>();
    
    private ResultadoBusqueda() {
    }
    
    public static ResultadoBusqueda getInstance() {
        return ResultadoBusquedaHolder.INSTANCE;
    }
    
    public void insertarResultado(Resultado res){
        resultados.add(res);
    }
    
    public List<Resultado> getResultados(){
        return resultados;
    }
    
    private static class ResultadoBusquedaHolder {

        private static final ResultadoBusqueda INSTANCE = new ResultadoBusqueda();
    }
}
