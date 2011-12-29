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
public class Criatura implements ICriatura {

    @Override
    public String getNombre() {
        // TODO Criatura.getNombre()
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNombre() {
        // TODO Criatura.setNombre()
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<IMana> getCosto() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getCostoConvertido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void hacerDaño() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dañoRecibido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int dañoRestante() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void limpiarDaño() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<String> getTipos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<String> getSuperTipos() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
