/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones_Metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexion {
private final String url ="jdbc:mysql://localhost/Merceria2";
PreparedStatement psPreparedStatemen;
Connection con = null;
public Conexion(){
    try{
    
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection(url,"root","");
        if(con!=null){
            System.out.println("Conexion Establecida");
            
        }
    
    
    }catch(SQLException e){System.out.println(e);}
    catch(ClassNotFoundException e){System.out.println(e);}

}
public Connection Conectado(){
return con;
}
public void desconectar(){
    try{
    con.close();
    }catch(SQLException e){
    }

}
}

