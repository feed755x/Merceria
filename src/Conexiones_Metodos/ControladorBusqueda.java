/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones_Metodos;

/**
 *
 * @author root
 */
public class ControladorBusqueda {
    Modelo_Busqueda Modelo;
    
    public ControladorBusqueda(){
    
        Modelo =new Modelo_Busqueda();
    
    }
    public Object [][] muestraProductos(){
    
    String seleccion = "SELECT proveedor.idproveedor,proveedor.nombre_proveedor,proveedor.direccion, proveedor.Contacto FROM";
    String tablas = " proveedor";
    String sentencia = seleccion + tablas;
    Object[][]datos= null;
    String [] columnas={"proveedor.idproveedor","proveedor.nombre_proveedor","proveedor.direccion", "proveedor.Contacto"};
    datos = Modelo.GetTabla(columnas, sentencia,tablas);
    
    
        return datos;
    
    
    }
    
    public Object[][] Busqueda(String busqueda){
    String seleccion = "SELECT proveedor.idproveedor,proveedor.nombre_proveedor, proveedor.direccion,proveedor.Contacto FROM";
    String tablas = " proveedor where proveedor.nombre_proveedor like '%"+busqueda+"%'";
    String sentencia = seleccion + tablas;
    Object[][]datos= null;
    String [] columnas={"proveedor.idproveedor","proveedor.nombre_proveedor","proveedor.direccion","proveedor.Contacto"};
    datos = Modelo.GetTabla(columnas, sentencia,tablas);
    
    
        return datos;
    
    
    }    
    
    
    public Object[][] Productos(){
    
    String seleccion = "SELECT productos.idproductos,productos.descripcion,productos.stock,productos.cantidad,productos.precio_compra,productos.precio_publico FROM";
    String tablas = " productos";
    String sentencia = seleccion + tablas;
    Object[][]datos= null;
    String [] columnas={"productos.idproductos","productos.descripcion","productos.stock","productos.cantidad","productos.precio_compra","productos.precio_publico"};
    datos = Modelo.GetTabla(columnas, sentencia,tablas);
    
    
        return datos;
    
    
    }
     public Object[][] BusquedaProductos(String busqueda){
    
    String seleccion = "SELECT productos.idproductos,productos.descripcion,productos.stock,productos.cantidad,productos.precio_compra,productos.precio_publico FROM";
    String tablas = " productos where productos.descripcion like '%"+busqueda+"%'";
    String sentencia = seleccion + tablas;
    Object[][]datos= null;
    String [] columnas={"productos.idproductos","productos.descripcion","productos.stock","productos.cantidad","productos.precio_compra","productos.precio_publico"};
    datos = Modelo.GetTabla(columnas, sentencia,tablas);
    
    
        return datos;
    
    
    }
      public Object[][] BusquedaProductos2(String busqueda){
    
    String seleccion = "SELECT productos.idproductos,productos.descripcion,productos.stock,productos.precio_publico FROM";
    String tablas = " productos where productos.descripcion like '%"+busqueda+"%'";
    String sentencia = seleccion + tablas;
    Object[][]datos= null;
    String [] columnas={"productos.idproductos","productos.descripcion","productos.stock","productos.precio_publico"};
    datos = Modelo.GetTabla(columnas, sentencia,tablas);
    
    
        return datos;
    
    
    }
}
