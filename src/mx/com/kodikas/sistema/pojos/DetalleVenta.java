/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.kodikas.sistema.pojos;

/**
 *
 * @author Nicolas
 */
public class DetalleVenta {
   private int idDetalleVenta;
   private int idVenta;
   private int idProd;
   private double cantidadVendida;

    public DetalleVenta(int idDetalleVenta, int idVenta, int idProd, double cantidadVendida) {
        this.idDetalleVenta = idDetalleVenta;
        this.idVenta = idVenta;
        this.idProd = idProd;
        this.cantidadVendida = cantidadVendida;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public double getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(double cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
   
    
}
