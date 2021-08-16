/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cinema.ventas;

import Cinema.Sillas;
import java.util.Date;

/**
 *
 * @author userx
 */
public class Ventas {
    
    private Date fecha;
    private double valorVenta;
    private Cliente cliente;
    private Sillas silla;

    public Ventas(Date fecha) {
        this.fecha = fecha;
    }

    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(double valorVenta) {
        this.valorVenta = valorVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sillas getSilla() {
        return silla;
    }

    public void setSilla(Sillas silla) {
        this.silla = silla;
    }
    
    
}
