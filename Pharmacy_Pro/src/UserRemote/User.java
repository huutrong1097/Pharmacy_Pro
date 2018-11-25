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
public class User implements Serializable{
    private String tenDN;
    private String tenNV;
    private String matKhau;
    private String diaChi;
    private String dienThoai;
    private String quyen;

    public User() {
        
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public User(String tenDN, String matKhau) {
        this.tenDN = tenDN;
        this.matKhau = matKhau;
    }

    public User(String quyen) {
        this.quyen = quyen;
    }
    
    public User(String tenDN, String tenNV, String matKhau, String diaChi, String dienThoai, String quyen) {
        this.tenDN = tenDN;
        this.tenNV = tenNV;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.quyen = quyen;
    }
    @Override
    public String toString(){
        return this.quyen;
    }
}
