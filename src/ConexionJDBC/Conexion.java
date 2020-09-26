package ConexionJDBC;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private Connection conexion;
      
    public Conexion(){
       
    }  
    
    //Metodo para establecer una conexion a la base de datos, que devuelve un objeto Connection
    public Connection getConexion(){   
        String conexionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Usuarios;";
        //Nombre de usuario del gestor de la base de datos
        final String USUARIO_SQL_SERVER = "Java"; 
        //Password del usuario del gestor de la base de datos
        final String PASSWORD = "123456";
        
        try{         
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection cone = DriverManager.getConnection(conexionUrl,USUARIO_SQL_SERVER,PASSWORD);
            conexion = cone;
                      
        }catch(ClassNotFoundException | SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos..\n" + e.getMessage());
        }
        return conexion;
    }
   
   
}
