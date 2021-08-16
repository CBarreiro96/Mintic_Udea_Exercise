/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

/**
 *
 * @author userx
 */
public class SillaDeshabilitada extends Sillas{
    
    public SillaDeshabilitada(int numeroSillas, String imagen, Estado estado) {
        super(numeroSillas, imagen, estado);
    }

    @Override
    public double calcularPrecio(int dia) {
        return -1;
    }
    
    
    
}
