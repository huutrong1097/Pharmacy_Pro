/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserRemote;

import java.io.Serializable;

/**
 *
 * @author Thomas Nguyen
 */
public class LoaiThuoc implements Serializable{
    private String maLoaiThuoc;
    private String tenLoaiThuoc;
    private int heSoLuong;
    public LoaiThuoc() {
    }

    public LoaiThuoc(String maLoaiThuoc, String tenLoaiThuoc, int heSoLuong) {
        this.maLoaiThuoc = maLoaiThuoc;
        this.tenLoaiThuoc = tenLoaiThuoc;
        this.heSoLuong = heSoLuong;
    }

    public LoaiThuoc(String maLoaiThuoc) {
        this.maLoaiThuoc = maLoaiThuoc;
    }
    
    public String getMaLoaiThuoc() {
        return maLoaiThuoc;
    }

    public void setMaLoaiThuoc(String maLoaiThuoc) {
        this.maLoaiThuoc = maLoaiThuoc;
    }

    public String getTenLoaiThuoc() {
        return tenLoaiThuoc;
    }

    public void setTenLoaiThuoc(String tenLoaiThuoc) {
        this.tenLoaiThuoc = tenLoaiThuoc;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    
    
}
