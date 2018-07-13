
package connect.all.ug;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectDB {
    Connection conn = null;
       public Connection getConnection(){
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeDB", "root", "amonkats");
      
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        return conn;
    }
}
