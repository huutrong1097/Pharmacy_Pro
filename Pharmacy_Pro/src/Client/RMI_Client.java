
package Client;

import UserRemote.RemoteUser;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RMI_Client {
    RemoteUser user;
    public RMI_Client(){
        Registry registry;
        try {
            registry = LocateRegistry.getRegistry("localhost",1997);
            user=(RemoteUser) registry.lookup("rmi://localhost/trong");
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(RMI_Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
