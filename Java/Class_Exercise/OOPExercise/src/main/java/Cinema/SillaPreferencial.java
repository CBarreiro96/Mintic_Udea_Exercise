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
public class SillaPreferencial extends Sillas{
    
    public SillaPreferencial(int numeroSillas, String imagen, Estado estado) {
        super(numeroSillas, imagen, estado);
    }

    @Override
    public double calcularPrecio(int dia) {
        double precio = super.calcularPrecio(dia);
        return precio * 1.5;
    }
    
}
