
package OperacionesBancarias;

import ConexionJDBC.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class OpeacionesBD {
    
    private boolean validarNumeroCuenta;
    
    public OpeacionesBD(){
    
    }
       
    public void retirar_depositar(int numCuenta, float dinero,String tipo_operacion){
        try{  
            Conexion cone = new Conexion();           
            
            CallableStatement updateRetirae = cone.getConexion().prepareCall(tipo_operacion);
            
            updateRetirae.setInt(1, numCuenta);
            updateRetirae.setFloat(2, dinero);
            
            updateRetirae.execute();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos..","Error",JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    public void transferir(int numCuentaUser,float dinero,int numCuentaDesti){   
        try{  
            Conexion cone = new Conexion();           
       
            CallableStatement updateTransferir = cone.getConexion().prepareCall("{CALL transferir(?,?,?)}");
            
            updateTransferir.setInt(1, numCuentaUser);
            updateTransferir.setFloat(2, dinero);
            updateTransferir.setInt(3, numCuentaDesti);
            
            updateTransferir.execute();
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al conectarse a la base de datos..","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean validarNumeroCuenta(int numCuenta){
        try{
            Conexion cone = new Conexion();           
            Statement instrucion;
            instrucion = cone.getConexion().createStatement();
            
            ResultSet result;
            result = instrucion.executeQuery("select * from cuenta_bancaria where numCuenta= '"+numCuenta+"' ");   
            
            while(result.next()){
                this.validarNumeroCuenta = numCuenta==result.getInt(1);                                           
            }
            instrucion.close();
            result.close();
            instrucion.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos..");
        }
        
        return this.validarNumeroCuenta;
        
    }
}
