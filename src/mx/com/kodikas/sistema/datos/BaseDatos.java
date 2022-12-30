package mx.com.kodikas.sistema.datos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

import java.sql.SQLException;
import mx.com.kodikas.sistema.pojos.CategoriaProd;
import mx.com.kodikas.sistema.pojos.DetalleVenta;
import mx.com.kodikas.sistema.pojos.Producto;
import mx.com.kodikas.sistema.pojos.Proveedor;
import mx.com.kodikas.sistema.pojos.Venta;



/**
 *      Paquetes ->Imports->Clases  ..............(P->I->C --> Variables y Metodos (Constructor) )
 */
public class BaseDatos {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public BaseDatos() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//fin Metodo Constructor
    
    public void insertarProducto(Producto producto) {
        try {
            
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema","postgres", "admin");
            FileInputStream fis = new FileInputStream(producto.getFotoProducto());
            
            String sql = "INSERT INTO CAT_PRODUCTOS(id_prod, nombre_prod, desc_prod, stock_prod, unidad_prod, "
                    + "precio_compra_prod, precio_venta_prod, existencias_prod, id_categoria_prod, id_proveedor) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, producto.getIdProducto());
            preparedStatement.setString(2, producto.getNomProducto());
            preparedStatement.setString(3, producto.getDescProducto());
            preparedStatement.setDouble(4, producto.getStockProducto());
            preparedStatement.setBinaryStream(5, fis, (int)producto.getFotoProducto().length());
            preparedStatement.setString(6, producto.getUnidadProducto());
            preparedStatement.setDouble(7, producto.getPrecioCompraProducto());
            preparedStatement.setDouble(8, producto.getPrecioVentaProducto());
            preparedStatement.setDouble(9, producto.getExistenciasProducto());
            preparedStatement.setInt(10, producto.getIdCategoria());
            preparedStatement.setInt(11, producto.getIdProveedor());
                        
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex){
            ex.printStackTrace();
        }
        finally{
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        }
        
    }//fin metodo insertarProducto            
    
    public void insertarCategoriaProducto(CategoriaProd categoria) {
        try {
            
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema","postgres", "admin");            
            
            String sql = "INSERT INTO CAT_CATEGORIAS(nom_categoria_prod, desc_categoria_prod) "
                    + "VALUES(?, ?)";
            
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, categoria.getNomCategoriaProd());
            preparedStatement.setString(2, categoria.getDescCategoriaProd());
                        
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        } finally{
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }           
        }        
    }//fin metodo insertarCategoriaProducto
    
    public void insertarProveedor(Proveedor proveedor) {
        try {
            
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema","postgres", "admin");            
            
            String sql = "INSERT INTO CAT_PROVEEDORES(nom_proveedor, dir_proveedor, telefono_proveedor, "
                    + "email_proveedor, contacto_proveedor) "
                    + "VALUES(?, ?, ?, ?, ?)";
            
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setString(1, proveedor.getNomProveedor());
            preparedStatement.setString(2, proveedor.getDirProveedor());
            preparedStatement.setString(3, proveedor.getTelefonoProveedor());
            preparedStatement.setString(4, proveedor.getEmailProveedor());
            preparedStatement.setString(5, proveedor.getContactoProveedor());
                        
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        } finally{
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }           
        }        
    }//fin metodo insertarProveedor
    
    public void insertarVenta(Venta venta) {
        try {
            
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema","postgres", "admin");            
            
            String sql = "INSERT INTO VENTAS(monto_venta, fecha_venta) "
                    + "VALUES(?, ?)";
            
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setDouble(1, venta.getMontoVenta());
            preparedStatement.setDate(2, venta.getFechaVenta());
                        
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        } finally{
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }           
        }        
    }//fin metodo insertarVenta
    
    public void insertarDetalleVenta(DetalleVenta detalleVenta) {
        try {
            
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema","postgres", "admin");            
            
            String sql = "INSERT INTO VENTAS(monto_venta, fecha_venta) "
                    + "VALUES(?, ?)";
            
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setInt(1, detalleVenta.getIdVenta());
            preparedStatement.setInt(2, detalleVenta.getIdProd());
            preparedStatement.setDouble(3, detalleVenta.getCantidadVendida());
                        
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        
        } finally{
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }           
        }        
    }//fin metodo insertarDetalleVenta
    
    public static void main(String[] args) {
        CategoriaProd categoria = new CategoriaProd(1, "Categoria de prueba", "descripcion categoria ");
        BaseDatos baseDatos = new BaseDatos();                
        
        baseDatos.insertarCategoriaProducto(categoria);
    }
    
}//fin Clase BaseDatos
