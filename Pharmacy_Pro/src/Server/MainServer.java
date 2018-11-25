
package Server;
import UserRemote.RemoteUser;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;
public class MainServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("RMI starting...");
             RemoteUser ru=new UserImpl();//Tạo đối tượng có phương thức cho phép gọi từ xa và trả về tham chiếu đến giao diện của chúng Remote Object
             Registry reg = LocateRegistry.createRegistry(1997);////Tạo đối tượng Registry
            reg.rebind("rmi://localhost/trong", ru);//đưa sr ra cổng
        }catch ( RemoteException e) {
            JOptionPane.showMessageDialog(null,"Lỗi "+e);
        }
    }
    
}
