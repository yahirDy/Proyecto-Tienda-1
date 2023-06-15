package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Alan Nava Martinez
 */
public class Conexionlogin{
    public static final String URL = "jdbc:mysql://localhost:3306/login";
    public static final String USER = "root";
    public static final String CLAVE = "";
    
    public Connection getConexionlogin(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        return con;
    }    
}