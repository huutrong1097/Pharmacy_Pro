/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import UserRemote.DonViTinh;
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
public class DonViTinhDB {
    private DBAccess dba;
    private MyConnection db;
    private PreparedStatement pst;
    Connection con;

    public ArrayList<DonViTinh> LoadData_DonVTDB() {
        ArrayList<DonViTinh> donViTinhs = new ArrayList<>();
        try {
            String sql = "SELECT * FROM donvitinh";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            DonViTinh donViTinh;
            while (rs.next()) {
                donViTinh = new DonViTinh(rs.getString("MaDVT"), rs.getString("TenDVT"));
                donViTinhs.add(donViTinh);
            }
        } catch (SQLException e) {

        }
        return donViTinhs;
    }
    public ArrayList<DonViTinh> LoadComDonVTDB() {
        ArrayList<DonViTinh> donViTinhs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM donvitinh";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            DonViTinh donViTinh;
            while (rs.next()) {
                donViTinh = new DonViTinh(rs.getString("MaDVT"));
                donViTinhs.add(donViTinh);
            }
        } catch (SQLException e) {

        }
        return donViTinhs;
    }
    
    public ArrayList<DonViTinh> TimKiemDVTDB(String timKiem) {
        ArrayList<DonViTinh> donViTinhs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM donvitinh WHERE MaDVT like N'%" + timKiem + "%'or TenDVT like N'%" + timKiem + "%'";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            DonViTinh donViTinh;
            while (rs.next()) {
                donViTinh = new DonViTinh(rs.getString("MaDVT"), rs.getString("TenDVT"));
                donViTinhs.add(donViTinh);
            }
        } catch (SQLException e) {
        }
        return donViTinhs;
    }
    public int ThemDonVTDB(DonViTinh dvt) {
        int res = 0;
        try {
            String sql = "INSERT INTO donvitinh VALUES(?,?)";
            MyConnection myCon = new MyConnection();
            con = (Connection) myCon.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, dvt.getMaDVT());
            pst.setString(2, dvt.getTenDVT());
            res = pst.executeUpdate();
        } catch (SQLException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public String XoaDVTDB(String indexDelete) {
        try {
            String sql = "DELETE FROM donvitinh where MaDVT='" + indexDelete + "'";
            dba = new DBAccess();
            dba.ExcuteQueryUpdateDB(sql);
        } catch (Exception e) {
        }
        return null;
    }
    
    public void CapNhatDVTDB(DonViTinh dvt) {
        String sql = "UPDATE donvitinh SET TenDVT='" + dvt.getTenDVT() + "'"
                + "WHERE MaDVT='" + dvt.getMaDVT() + "'";
        dba = new DBAccess();
        dba.ExcuteQueryUpdateDB(sql);
    }
}
