package Registro;


import ConexionJDBC.Conexion;
import java.sql.CallableStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registrarse extends Registro{
    
    public Registrarse(){
    
    }
    
    public void registroUsuarios(String u,String n, String a, String p, int e){       
        try{  
            Conexion cone = new Conexion();           
       
            CallableStatement registrarse = cone.getConexion().prepareCall("{CALL crearCuenta(?,?,?,?,?)}");
            
            registrarse.setString(1, u);
            registrarse.setString(2, n);
            registrarse.setString(3, a);
            registrarse.setString(4, p);
            registrarse.setInt(5, e);
                       
            registrarse.execute();
                    
        }catch(SQLException ex){          
            JOptionPane.showMessageDialog(null,"Ocurrio un error inesperado! " + ex.toString(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    
    }
   
}

