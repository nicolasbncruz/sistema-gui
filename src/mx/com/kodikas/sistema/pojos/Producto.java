/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.kodikas.sistema.pojos;

import java.io.File;

/**
 *
 * @author Nicolas
 */
public class Producto {
    
    String idProducto;
    String nomProducto;
    String descProducto;
    double stockProducto;
    File fotoProducto;
    String unidadProducto;
    double precioCompraProducto;
    double precioVentaProducto;
    double existenciasProducto;
    int idCategoria;
    int idProveedor;

    public Producto(String idProducto, String nomProducto, String descProducto, double stockProducto, File fotoProducto, String unidadProducto, double precioCompraProducto, double precioVentaProducto, double existenciasProducto, int idCategoria, int idProveedor) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.descProducto = descProducto;
        this.stockProducto = stockProducto;
        this.fotoProducto = fotoProducto;
        this.unidadProducto = unidadProducto;
        this.precioCompraProducto = precioCompraProducto;
        this.precioVentaProducto = precioVentaProducto;
        this.existenciasProducto = existenciasProducto;
        this.idCategoria = idCategoria;
        this.idProveedor = idProveedor;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getDescProducto() {
        return descProducto;
    }

    public void setDescProducto(String descProducto) {
        this.descProducto = descProducto;
    }

    public double getStockProducto() {
        return stockProducto;
    }

    public void setStockProducto(double stockProducto) {
        this.stockProducto = stockProducto;
    }

    public File getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(File fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public String getUnidadProducto() {
        return unidadProducto;
    }

    public void setUnidadProducto(String unidadProducto) {
        this.unidadProducto = unidadProducto;
    }

    public double getPrecioCompraProducto() {
        return precioCompraProducto;
    }

    public void setPrecioCompraProducto(double precioCompraProducto) {
        this.precioCompraProducto = precioCompraProducto;
    }

    public double getPrecioVentaProducto() {
        return precioVentaProducto;
    }

    public void setPrecioVentaProducto(double precioVentaProducto) {
        this.precioVentaProducto = precioVentaProducto;
    }

    public double getExistenciasProducto() {
        return existenciasProducto;
    }

    public void setExistenciasProducto(double existenciasProducto) {
        this.existenciasProducto = existenciasProducto;
    }
    
    
    
    
}
