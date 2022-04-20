
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Aukse Levonaite 5 grupe
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/stdmgdb","root","");
        } catch (Exception ex) {
            System.out.println( ex.getMessage());
        }
        return con;
    }
}
