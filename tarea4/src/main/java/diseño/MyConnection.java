package diseño;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author 1BestCsharp
 */
public class MyConnection {
    
    
    // create a function to connect with mysql database
    
    public static Connection getConnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3333/crud", "root", "aaAA11@@10032004");
        }   catch (Exception ex) {
            System.out.println("Error en la conexion" +ex);
        }
        return con;
    }
    
    public Connection getconnection(){
     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3333/crud", "root", "aaAA11@@10032004");
        }   catch (Exception ex) {
            System.out.println("Error en la conexion" +ex);
        }
        return con;
    }
    
}