package Conexiones_Metodos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class Modelo_Busqueda {
    private Conexion con;
    PreparedStatement ps;
    ResultSet  res;
    public Modelo_Busqueda(){
    con = new Conexion();
    
    }
    

    
  
    public Object[][] GetTabla(String ColName[],String sql, String tablas){
        int Registros =0;
        String Sentencia ="select count(*) as total from"+ tablas;
        try{
           
           ps= con.Conectado().prepareStatement(Sentencia);
            res = ps.executeQuery();
            res.next();
            Registros = res.getInt("total");
            res.close();
            
        
        
        
        }catch(SQLException e){
            System.out.println(e);
        }
        
        Object [][] data= new String[Registros][ColName.length];
        String Col[] = new String[ColName.length];
        try{
            ps = con.Conectado().prepareStatement(sql);
            res= ps.executeQuery();
            int i =0;
            while(res.next()){
            for(int j=0; j<=ColName.length - 1; j++){
                Col[j] = res.getString(ColName[j]);
                data[i][j] = Col[j];
                
            
            
            }
            i++;
            
            }
        
            res.close();
        }catch(SQLException e){}
    
        return data;
    
    }
}
