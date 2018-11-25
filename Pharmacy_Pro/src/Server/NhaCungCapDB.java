/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import UserRemote.NhaCC;
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
public class NhaCungCapDB {

    private DBAccess dba;
    private MyConnection db;
    private PreparedStatement pst;
    Connection con;

    public ArrayList<NhaCC> LoadData_NCCDB() {
        ArrayList<NhaCC> nccs = new ArrayList<>();//tạo mảng đề lưu user
        try {
            String sql = "SELECT * FROM nhacungcap";
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            NhaCC ncc;
            while (rs.next()) {
                ncc = new NhaCC(rs.getString("MaNCC"), rs.getString("TenNCC"), rs.getString("DiaChiNCC"), rs.getString("DienThoaiNCC"));
                nccs.add(ncc);
            }
        } catch (SQLException e) {

        }
        return nccs;
    }

    public int ThemNCCDB(NhaCC ncc) {
        int res = 0;
        try {
            String sql = "INSERT INTO nhacungcap VALUES(?,?,?,?)";
            MyConnection myCon = new MyConnection();
            con = (Connection) myCon.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, ncc.getMaNCC());
            pst.setString(2, ncc.getTenNCC());
            pst.setString(3, ncc.getDiaChiNCC());
            pst.setString(4, ncc.getDienThoaiNCC());
            res = pst.executeUpdate();
        } catch (SQLException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public String XoaNCCDB(String indexDelete) {
        try {
            String sql = "DELETE FROM nhacungcap where MaNCC='" + indexDelete + "'";
            dba = new DBAccess();
            dba.ExcuteQueryUpdateDB(sql);
        } catch (Exception e) {
        }
        return null;
    }
}
