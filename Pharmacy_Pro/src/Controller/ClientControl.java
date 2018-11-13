package Controller;

import Model.User;
import View.frmLoginView;
import View.frmDangKyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class ClientControl {

    private frmLoginView view;
    private frmDangKyView dangKyView;
    private String serverHost = "localhost";
    private int serverPort = 8888;

    //
//    public ClientControl(frmLoginView view) {
//        this.view = view;
//        this.view.addLoginListener(new LoginListener());
//        this.view.addDangKyListener(new DangKyListener());
//    }
//    //
//    public ClientControl(frmDangKyView dangKyView) {
//        this.dangKyView = dangKyView;
//        this.dangKyView.addOKListener(new OKListener());
//        this.dangKyView.addHuyListener(new HuyListener());
//    }
    public ClientControl() {
    }

//    class LoginListener implements ActionListener {
//        @Override
//        public void actionPerformed(ActionEvent e){
//            try {
//                User user = view.getUser();
//                Socket mySocket = new Socket(serverHost, serverPort);
//                ObjectOutputStream oos = new ObjectOutputStream(mySocket.getOutputStream());
//                oos.writeObject(user);
//                ObjectInputStream ois = new ObjectInputStream(mySocket.getInputStream());
//                Object o = ois.readObject();
//                if (o instanceof String) {//kiểm tra o có phải là kiểu string k,toán tử instanceof dùng để so sánh kiểu
//                    String result = (String) o;
//                    if (result.equals("ok")){
//                        view.showMessage("Login thành công!");
//                    } else{
//                        view.showMessage("Sai username and/or password!");
//                    }
//                }
//                mySocket.close();
//            } catch (Exception ex) {
//                view.showMessage(ex.getStackTrace().toString());
//            }
//        }
//    }
    public void dangNhap(User user) {
        try {
            Socket mySocket = new Socket(serverHost, serverPort);
            ObjectOutputStream oos = new ObjectOutputStream(mySocket.getOutputStream());
            oos.writeObject(user);
            ObjectInputStream ois = new ObjectInputStream(mySocket.getInputStream());
            Object o = ois.readObject();
            if (o instanceof String) {//kiểm tra o có phải là kiểu string k,toán tử instanceof dùng để so sánh kiểu
                String result = (String) o;
                if (result.equals("ok")) {
                    JOptionPane.showMessageDialog(null, "Login thành công!");
                    new frmDangKyView().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Sai tên đăng nhập or mật  khẩu!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lỗi");
            }
            mySocket.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi" + ex);
        }
    }

    //}
//    class OKListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            try {
//                User user = dangKyView.setAllUser();
//                Socket mySocket = new Socket(serverHost, serverPort);
//                ObjectOutputStream oos = new ObjectOutputStream(mySocket.getOutputStream());
//                oos.writeObject(user);
//                ObjectInputStream ois = new ObjectInputStream(mySocket.getInputStream());
//                Object o = ois.readObject();
//                if (user.getTenDN().equals("") || user.getTenND().equals("") || user.getMatKhau().equals("") || user.getDiaChi().equals("")) {
//                    dangKyView.showMessage("Vui lòng nhập đầy đủ thông tin");
//                } else {
//                    if (o instanceof String) {//kiểm tra o có phải là kiểu string k,toán tử instanceof dùng để so sánh kiểu
//                        String result = (String) o;
//                        if (result.equals("ok")) {
//                            dangKyView.showMessage("Đăng ký thành công!");
//                            view.setVisible(true);
//                        } else {
//                            dangKyView.showMessage("Đăng ký thất bại!");
//                        }
//                    }
//                }
//                mySocket.close();
//            } catch (Exception ex) {
//                view.showMessage(ex.getStackTrace().toString());
//            }
//        }
//    }
    public void DangKy(User user) {
        try {
            Socket mySocket = new Socket(serverHost, serverPort);
            ObjectOutputStream oos = new ObjectOutputStream(mySocket.getOutputStream());
            oos.writeObject(user);
            ObjectInputStream ois = new ObjectInputStream(mySocket.getInputStream());
            Object o = ois.readObject();
            if (user.getTenDN().equals("")
                    || user.getTenND().equals("")
                    || user.getMatKhau().equals("")
                    || user.getDiaChi().equals("")) {
                dangKyView.showMessage("Vui lòng nhập đầy đủ thông tin");
            } else {
                if (o instanceof String) {//kiểm tra o có phải là kiểu string k,toán tử instanceof dùng để so sánh kiểu
                    String result = (String) o;
                    if (result.equals("ok")) {
                        JOptionPane.showMessageDialog(null, "Đăng ký thành công!");
                        view.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Đăng ký thất bại!");
                    }
                }
            }
            mySocket.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi " + e);
        }
    }

//    class DangKyListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            new frmDangKyView().setVisible(true);
//            view.dispose();
//        }
//    }
//
//    class HuyListener implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            view.setVisible(true);
//            dangKyView.dispose();
//        }
//    }
}
