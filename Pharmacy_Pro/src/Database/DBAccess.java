
package Database;
import java.sql.*;
import javax.swing.JOptionPane;

public class DBAccess {
    private Connection con;
    private Statement stm;
    public DBAccess()
    {
        try 
        {
            MyConnection mycon=new MyConnection();
            con=mycon.getConnection();
            stm=con.createStatement();
        } catch (ClassNotFoundException | SQLException e) 
        {
             JOptionPane.showMessageDialog(null,"Error"+e);
        }
    }
    public ResultSet Query(String sql) throws SQLException
    {
         try {
            ResultSet rs = stm.executeQuery(sql);
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
        return null;

    }
    public void ExcuteQueryUpdateDB(String sql)
     {
       
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error");
        }
    }
}
