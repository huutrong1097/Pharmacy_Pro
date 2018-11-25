/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import UserRemote.LoaiKhachHang;
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
public class LoaiKhachHangDB {
    private DBAccess dba;
    private MyConnection db;
    private PreparedStatement pst;
    Connection con;

    public ArrayList<LoaiKhachHang> LoadData_LoaiKHDB() {
        ArrayList<LoaiKhachHang> LoaikhachHangs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM loaikhachhang";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            LoaiKhachHang lkh;
            while (rs.next()) {
                lkh = new LoaiKhachHang(rs.getString("MaLoaiKH"), rs.getString("TenLoaiKH"));
                LoaikhachHangs.add(lkh);
            }
        } catch (SQLException e) {

        }
        return LoaikhachHangs;
    }
    public int ThemLKHDB(LoaiKhachHang lkh) {
        int res = 0;
        try {
            String sql = "INSERT INTO loaikhachhang VALUES(?,?)";
            MyConnection myCon = new MyConnection();
            con = (Connection) myCon.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, lkh.getMaLoaiKH());
            pst.setString(2, lkh.getTenLoaiKH());
            res = pst.executeUpdate();
        } catch (SQLException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    public String XoaLKHDB(String indexDelete) {
        try {
            String sql = "DELETE FROM loaikhachhang where MaLoaiKH='" + indexDelete + "'";
            dba = new DBAccess();
            dba.ExcuteQueryUpdateDB(sql);
        } catch (Exception e) {
        }
        return null;
    }
    public ArrayList<LoaiKhachHang> LoadCombobox_KHDB() {
        ArrayList<LoaiKhachHang> khachHangs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM loaikhachhang";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            LoaiKhachHang khachHang;
            while (rs.next()) {
                khachHang = new LoaiKhachHang(rs.getString("MaLoaiKH"));
                khachHangs.add(khachHang);
            }
        } catch (SQLException e) {
        }
        return khachHangs;
    }
}
