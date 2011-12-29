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
public interface ICarta {
    
    public String getNombre();
    public void setNombre();
    
    public List<IMana> getCosto();
    public int getCostoConvertido();
    
}
