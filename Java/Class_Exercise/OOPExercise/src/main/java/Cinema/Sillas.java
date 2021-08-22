/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema;

import java.util.Calendar;

/**
 *
 * @author userx
 */
public class Sillas implements ICobro {
    private int numeroSillas;
    private String imagen;
    private Estado estado;

    public Sillas(int numeroSillas, String imagen, Estado estado) {
        this.numeroSillas = numeroSillas;
        this.imagen = imagen;
        this.estado = estado;
    }
    
    public void cambiarEstado(Estado estado){
        this.estado = estado;
    }

    public int getNumeroSillas() {
        return numeroSillas;
    }

    public String getImagen() {
        return imagen;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public double calcularPrecio(int dia) {
//        boolean estaEnSemana = dia >= Calendar.MONDAY && dia <= Calendar.FRIDAY
        if (esDiaEnSemana(dia)){
            return 5000;
        }
        return 7000;
    }

    public static boolean esDiaEnSemana(int dia) {
        return dia >= Calendar.MONDAY && dia <= Calendar.FRIDAY;
    }

    @Override
    public String toString() {
        return "silla #" + this.getNumeroSillas();
    }
}
