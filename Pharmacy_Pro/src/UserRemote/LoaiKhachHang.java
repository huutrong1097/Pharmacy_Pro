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
public class LoaiKhachHang implements Serializable{
    private String maLoaiKH;
    private String tenLoaiKH;

    public LoaiKhachHang() {
    }

    public LoaiKhachHang(String maLoaiKH, String tenLoaiKH) {
        this.maLoaiKH = maLoaiKH;
        this.tenLoaiKH = tenLoaiKH;
    }

    public String getMaLoaiKH() {
        return maLoaiKH;
    }

    public LoaiKhachHang(String maLoaiKH) {
        this.maLoaiKH = maLoaiKH;
    }

    public void setMaLoaiKH(String maLoaiKH) {
        this.maLoaiKH = maLoaiKH;
    }

    public String getTenLoaiKH() {
        return tenLoaiKH;
    }

    public void setTenLoaiKH(String tenLoaiKH) {
        this.tenLoaiKH = tenLoaiKH;
    }
    
}
