
package Server;

import Server.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MyConnection {
    public Connection getConnection() throws ClassNotFoundException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost/quanlynhathuoc?user=root"+"&password=&setUnicode=true&"+"characterEncoding=UTF-8");
            if(con != null){
                System.out.println("Kết nối CSDL thành công!");
            }
            else{
                System.out.println("Kết nối CSDL thất bại");
            }
            return con;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
        return null;
    }
}
