/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package magic;

import java.util.List;

/**
 *
 * @author Andres
 */
public interface ICriatura extends IPermanente {
    
    public void hacerDaño();
    public int dañoRecibido();
    public int dañoRestante();
    public void limpiarDaño();
    
    public List<String> getTipos();
    public List<String> getSuperTipos();
    
}
