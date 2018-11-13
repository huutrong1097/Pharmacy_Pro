package Controller;

import Database.DBAccess;
import Database.MyConnection;
import Model.User;
import View.ServerView;
import java.io.*;
import java.net.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ServerControl {

    private ServerView view;
    private ServerSocket myServer;
    private Socket clientSocket=null;
    private int serverPort = 8888;
    private DBAccess dba;
    Connection con;
    private PreparedStatement pst;

    public ServerControl(ServerView view) {
        this.view = view;
        dba =new DBAccess();
        openServer(serverPort);
        view.showMessage("TCP server is running...");
        while (true) {
            listenning();
        }
    }
    private void openServer(int portNumber) {
        try {
            myServer = new ServerSocket(portNumber);
        } catch (IOException e) {
            view.showMessage(e.toString());
        }
    }
    private void listenning() {
        try {
            clientSocket = myServer.accept();
            ObjectInputStream ois
                    = new ObjectInputStream(clientSocket.getInputStream());
            ObjectOutputStream oos
                    = new ObjectOutputStream(clientSocket.getOutputStream());
            Object o = ois.readObject();
            
            if (o instanceof User) {//toán tử instanceof dùng để so sánh kiểu
                User user = (User) o;
                if(Dangky(user)>0){
                    oos.writeObject("ok");
                }
                else {
                    oos.writeObject("false");
                }
                if (checkUser(user)) {
                    oos.writeObject("ok");
                } else {
                    oos.writeObject("false");
                }
            }
            
        }catch(NullPointerException n){
            n.printStackTrace();
        }
        catch (Exception e) {
            view.showMessage(e.toString());
        }

    }
    private boolean checkUser(User user) throws Exception {
        String sql= "Select * FROM nguoidung WHERE TenDN ='"
                + user.getTenDN()
                + "' AND MatKhau ='" + user.getMatKhau() + "'";
        try {
            dba=new DBAccess();
            ResultSet rs = dba.Query(sql);
            if (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            throw e;
        }
        return false;
    }
    private int Dangky(User user) throws ClassNotFoundException{
        int res=0;
        try{
        String sql="INSERT INTO nguoidung values(?,?,?,?,?,?)";
        MyConnection myCon=new MyConnection();
        con=(Connection)myCon.getConnection();
        pst=con.prepareStatement(sql);
        pst.setString(1,user.getTenDN());
        pst.setString(2,user.getTenND());
        pst.setString(3,user.getMatKhau());
        pst.setString(4,user.getDiaChi());
        pst.setString(5,user.getDienThoai());
        pst.setString(6,user.getQuyen());
        res=pst.executeUpdate();
        }catch(SQLException e){
            
        }
        return res;
    }
}
