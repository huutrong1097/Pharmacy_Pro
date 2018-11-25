/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import UserRemote.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thomas Nguyen
 */
public class KhachHangDB {

    private DBAccess dba;
    private MyConnection db;
    private PreparedStatement pst;
    Connection con;

    public ArrayList<KhachHang> LoadData_KHDB() {
        ArrayList<KhachHang> khachHangs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM khachhang";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            UserRemote.KhachHang khachHang;
            while (rs.next()) {
                khachHang = new UserRemote.KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("DiaChi"), rs.getString("DienThoai"), rs.getString("MaLoaiKH"));
                khachHangs.add(khachHang);
            }
        } catch (SQLException e) {

        }
        return khachHangs;
    }
    public int ThemKHDB(KhachHang kh) {
        int res = 0;
        try {
            String sql = "INSERT INTO khachhang VALUES(?,?,?,?,?)";
            MyConnection myCon = new MyConnection();
            con = (Connection) myCon.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, kh.getMaKH());
            pst.setString(2, kh.getTenKH());
            pst.setString(3, kh.getDiaChiKH());
            pst.setString(4, kh.getDienThoaiKH());
            pst.setString(5, kh.getMaLoaiKH());
            res = pst.executeUpdate();
        } catch (SQLException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public String XoaKHDB(String indexDelete) {
        try {
            String sql = "DELETE FROM khachhang WHERE MaKH='"+indexDelete+"'";
            dba = new DBAccess();
            dba.ExcuteQueryUpdateDB(sql);
        } catch (Exception e) {
        }
        return null;
    }

    public ArrayList<KhachHang> TimKiemDB(String Search) {
        ArrayList<KhachHang> khachHangs = new ArrayList<>();//tạo mảng đề lưu khach hàng
        try {
            String sql = "SELECT * FROM khachhang WHERE MaKH like N'%" + Search + "%'or TenKH like N'%" + Search + "%' "
                    + "or DiaChi like N'%" + Search + "%'";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            KhachHang khachHang;
            while (rs.next()) {
                khachHang = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"),rs.getString("DiaChi"), rs.getString("DienThoai"),rs.getString("MaLoaiKH"));
                khachHangs.add(khachHang);
            }
        } catch (SQLException e) {
        }
        return khachHangs;
    }
}
