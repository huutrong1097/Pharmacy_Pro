/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import UserRemote.LoaiThuoc;
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
public class LoaiThuocDB {

    private DBAccess dba;
    private PreparedStatement pst;
    Connection con;

    public ArrayList<LoaiThuoc> LoadLThuocDB() {
        ArrayList<LoaiThuoc> loaiThuocs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM loaithuoc";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            LoaiThuoc loaiThuoc;
            while (rs.next()) {
                loaiThuoc = new LoaiThuoc(rs.getString("MaLoaiThuoc"), rs.getString("TenLoai"), rs.getInt("HeSoLuong"));
                loaiThuocs.add(loaiThuoc);
            }
        } catch (SQLException e) {

        }
        return loaiThuocs;
    }

    public ArrayList<LoaiThuoc> LoadComLThuocDB() {
        ArrayList<LoaiThuoc> loaiThuocs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM loaithuoc";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            LoaiThuoc loaiThuoc;
            while (rs.next()) {
                loaiThuoc = new LoaiThuoc(rs.getString("MaLoaiThuoc"));
                loaiThuocs.add(loaiThuoc);
            }
        } catch (SQLException e) {

        }
        return loaiThuocs;
    }

    public ArrayList<LoaiThuoc> TimKiemLThuocDB(String timKiem) {
        ArrayList<LoaiThuoc> loaiThuocs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM loaithuoc WHERE MaLoaiThuoc like N'%" + timKiem + "%'or TenLoai like N'%" + timKiem + "%' ";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            LoaiThuoc loaiThuoc;
            while (rs.next()) {
                loaiThuoc = new LoaiThuoc(rs.getString("MaLoaiThuoc"), rs.getString("TenLoai"), rs.getInt("HeSoLuong"));
                loaiThuocs.add(loaiThuoc);
            }
        } catch (SQLException e) {
        }
        return loaiThuocs;
    }

    public int ThemLThuocDB(LoaiThuoc lt) {
        int res = 0;
        try {
            String sql = "INSERT INTO loaithuoc VALUES(?,?,?)";
            MyConnection myCon = new MyConnection();
            con = (Connection) myCon.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, lt.getMaLoaiThuoc());
            pst.setString(2, lt.getTenLoaiThuoc());
            pst.setInt(3, lt.getHeSoLuong());
            res = pst.executeUpdate();
        } catch (SQLException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public String XoaLThuocDB(String indexDelete) {
        try {
            String sql = "DELETE FROM loaithuoc where MaLoaiThuoc='" + indexDelete + "'";
            dba = new DBAccess();
            dba.ExcuteQueryUpdateDB(sql);
        } catch (Exception e) {
        }
        return null;
    }

    public void CapNhatLoaiThuocDB(LoaiThuoc lt) {
        String sql = "UPDATE loaithuoc SET TenLoai='" + lt.getTenLoaiThuoc() + "',"
                + "HeSoLuong='" + lt.getHeSoLuong() + "'"
                + "WHERE MaLoaiThuoc='" + lt.getMaLoaiThuoc() + "'";
        dba = new DBAccess();
        dba.ExcuteQueryUpdateDB(sql);
    }
}
