/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import UserRemote.User;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Thomas Nguyen
 */
public class NhanVienDB {
    private DBAccess dba;
    private MyConnection db;
    private PreparedStatement pst;
    Connection con;
    public ArrayList<User> LoadDataTB_NV(){
        ArrayList<User> users = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM nhanvien";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            User user;
            while (rs.next()) {
                user = new User(rs.getString("TenDN"), rs.getString("TenNV"), 
                        rs.getString("MatKhau"), rs.getString("DiaChi"),
                        rs.getString("DienThoai"), rs.getString("Quyen"));
                users.add(user);
            }
        } catch (SQLException e) {
        }
        return users;
    }

    public ArrayList<User> SearchNV(String Search){
        ArrayList<User> users = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM nhanvien WHERE TenDN like N'%" + Search + "%'or TenNV like N'%" + Search + "%' "
                    + "or DiaChi like N'%" + Search + "%'";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            User user;
            while (rs.next()) {
                user = new User(rs.getString("TenDN"), rs.getString("TenNV"), rs.getString("MatKhau"), rs.getString("DiaChi"), rs.getString("DienThoai"), rs.getString("Quyen"));
                users.add(user);
            }
        } catch (SQLException e) {
        }
        return users;
    }

    public ArrayList<User> LoadCombobox_NV(){
        ArrayList<User> users = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM nhanvien";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            User user;
            while (rs.next()) {
                user=new User(rs.getString("Quyen"));
                users.add(user);
            }
        } catch (SQLException e) {
        }
        return users;
    }

    public String XoaNV(String indexDelete){
        try {
            String sql = "DELETE FROM nhanvien where TenDN='" + indexDelete + "'";
            dba = new DBAccess();
            dba.ExcuteQueryUpdateDB(sql);
        } catch (Exception e) {
        }
        return null;
    }

    public void CapNhatNV(User user) {
        String sql = "UPDATE nhanvien SET TenNV='" + user.getTenNV() + "',MatKhau='" + user.getMatKhau() + "',"
                + "DiaChi='" + user.getDiaChi() + "',DienThoai='" + user.getDienThoai() + "',Quyen='" + user.getQuyen() + "'"
                + "WHERE TenDN='" + user.getTenDN() + "'";
        dba = new DBAccess();
        dba.ExcuteQueryUpdateDB(sql);
    }
}
