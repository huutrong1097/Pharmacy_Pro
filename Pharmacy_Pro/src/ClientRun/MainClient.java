
package ClientRun;

import Controller.ClientControl;
import View.frmDangKyView;
import View.frmLoginView;
public class MainClient {
    public static void main(String[] args) {
        frmLoginView view=new frmLoginView();
//        frmDangKyView dangKyView=new  frmDangKyView();
//        ClientControl control_dk=new ClientControl(dangKyView);
        //ClientControl control=new ClientControl();
        view.setVisible(true);
//        dangKyView.setVisible(true);
    }
    
}
