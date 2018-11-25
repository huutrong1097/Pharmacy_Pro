/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import UserRemote.Thuoc;
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
public class ThuocDB {

    private DBAccess dba;
    private MyConnection db;
    private PreparedStatement pst;
    Connection con;

    public ArrayList<Thuoc> LoadData_ThuocDB() {
        ArrayList<Thuoc> thuocs = new ArrayList<>();
        try {
            String sql = "SELECT * FROM thuoc";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            Thuoc thuoc;
            while (rs.next()) {
                thuoc = new Thuoc(rs.getString("MaThuoc"), rs.getString("TenThuoc"),
                        rs.getString("MaDVT"), rs.getInt("SoLuong"), rs.getInt("DonGiaMua"),
                        rs.getInt("DonGiaBan"), rs.getString("MaLoaiThuoc"));
                thuocs.add(thuoc);
            }
        } catch (SQLException e) {

        }
        return thuocs;
    }

    public ArrayList<Thuoc> TimKiemDB(String Search) {
        ArrayList<Thuoc> thuocs = new ArrayList<>();//tạo mảng đề lưu khach hàng
        try {
            String sql = "SELECT * FROM khachhang WHERE MaKH like N'%" + Search + "%'or TenKH like N'%" + Search + "%' "
                    + "or DiaChi like N'%" + Search + "%'";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            Thuoc thuoc;
            while (rs.next()) {
                thuoc = new Thuoc(rs.getString("MaThuoc"), rs.getString("TenThuoc"),
                        rs.getString("MaDVT"), rs.getInt("SoLuong"),
                        rs.getDouble("DonGiaMua"), rs.getDouble("DonGiaBan"), rs.getString("MaLoaiThuoc"));
                thuocs.add(thuoc);
            }
        } catch (SQLException e) {
        }
        return thuocs;
    }

    public ArrayList<Thuoc> TimKiemThuocDB(String timKiem) {
        ArrayList<Thuoc> thuocs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM thuoc WHERE MaThuoc like N'%" + timKiem + "%'or TenThuoc like N'%" + timKiem + "%' "
                    + "or MaDVT like N'%" + timKiem + "%' or MaLoaiThuoc like N'%" + timKiem + "%'";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            Thuoc thuoc;
            while (rs.next()) {
                thuoc = new Thuoc(rs.getString("MaThuoc"), rs.getString("TenThuoc"),
                        rs.getString("MaDVT"), rs.getInt("SoLuong"), rs.getDouble("DonGiaMua"),
                        rs.getDouble("DonGiaBan"), rs.getString("MaLoaiThuoc"));
                thuocs.add(thuoc);
            }
        } catch (SQLException e) {
        }
        return thuocs;
    }

    public int ThemThuocDB(Thuoc th) {
        int res = 0;
        try {
            String sql = "INSERT INTO thuoc VALUES(?,?,?,?,?,?,?)";
            MyConnection myCon = new MyConnection();
            con = (Connection) myCon.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, th.getMaThuoc());
            pst.setString(2, th.getTenThuoc());
            pst.setString(3, th.getMaDVT());
            pst.setInt(4, th.getSoLuong());
            pst.setDouble(5, th.getDonGiaMua());
            pst.setDouble(6, th.getDonGiaBan());
            pst.setString(7, th.getMaLoaiThuoc());
            res = pst.executeUpdate();
        } catch (SQLException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public String XoaThuocDB(String indexDelete) {
        try {
            String sql = "DELETE FROM thuoc where MaThuoc='" + indexDelete + "'";
            dba = new DBAccess();
            dba.ExcuteQueryUpdateDB(sql);
        } catch (Exception e) {
        }
        return null;
    }

    public void CapNhatThuocDB(Thuoc thuoc) {
        String sql = "UPDATE thuoc SET TenThuoc='" + thuoc.getTenThuoc() + "',"
                + "MaDVT='" + thuoc.getMaDVT() + "',SoLuong='" + thuoc.getSoLuong() + "',"
                + "DonGiaMua='" + thuoc.getDonGiaMua() + "',DonGiaBan='" + thuoc.getDonGiaBan() + "',MaLoaiThuoc='" + thuoc.getMaLoaiThuoc() + "'"
                + "WHERE MaThuoc='" + thuoc.getMaThuoc() + "'";
        dba = new DBAccess();
        dba.ExcuteQueryUpdateDB(sql);
    }
}
