
package Validaciones;

import ConexionJDBC.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;

public class Usuario {
    
    private boolean validar_sesion;
   
    public Usuario(){
       
    }
    
    public boolean validarSesion(String usuario, String pass){
        try{
            Conexion cone = new Conexion();           
            Statement instrucion;
            instrucion = cone.getConexion().createStatement();
            
            ResultSet result;
            result = instrucion.executeQuery("select * from usuario where users= '"+usuario+"' ");   
            
            while(result.next()){
                if(usuario.equals(result.getString(1))){
                    if(pass.equals(result.getString(4))){
                        this.validar_sesion = true;                    
                    }
                }else{
                    this.validar_sesion=  false;
                }                                           
            }
            instrucion.close();
            result.close();
            instrucion.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error inesperado! " + e.toString());
        }
        
        return this.validar_sesion;
        
    }
    
    public boolean validarUsuario(String usuario){
        try{
            Conexion cone = new Conexion();           
            Statement instrucion;
            instrucion = cone.getConexion().createStatement();
            
            ResultSet result;
            result = instrucion.executeQuery("select * from usuario where users= '"+usuario+"' ");   
            
            while(result.next()){
                this.validar_sesion = usuario.equals(result.getString(1));                                           
            }
            instrucion.close();
            result.close();
            instrucion.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos..");
        }
        
        return this.validar_sesion;
        
    }
       
    
}
