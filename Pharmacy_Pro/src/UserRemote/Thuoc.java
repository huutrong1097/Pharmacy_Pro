/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserRemote;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Thomas Nguyen
 */
public class Thuoc implements Serializable{
    private String maThuoc;
    private String tenThuoc;
    private String maDVT;
    private int soLuong;
    private double donGiaMua;
    private double donGiaBan;
    private String maLoaiThuoc;
    private LoaiThuoc mLoaiThuoc;
    
    public Thuoc() {
    }

    public Thuoc(String maThuoc, String tenThuoc, String maDVT, int soLuong, double donGiaMua, double donGiaBan, String maLoaiThuoc) {
        this.maThuoc = maThuoc;
        this.tenThuoc = tenThuoc;
        this.maDVT = maDVT;
        this.soLuong = soLuong;
        this.donGiaMua = donGiaMua;
        this.donGiaBan = donGiaBan;
        this.maLoaiThuoc = maLoaiThuoc;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public String getMaDVT() {
        return maDVT;
    }

    public void setMaDVT(String maDVT) {
        this.maDVT = maDVT;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGiaMua() {
        return donGiaMua;
    }

    public void setDonGiaMua(double donGiaMua) {
        this.donGiaMua = donGiaMua;
    }

    public double getDonGiaBan() {
        return donGiaBan;
    }

    public void setDonGiaBan(double donGiaBan) {
        this.donGiaBan = donGiaBan;
    }

    public String getMaLoaiThuoc() {
        return maLoaiThuoc;
    }

    public void setMaLoaiThuoc(String maLoaiThuoc) {
        this.maLoaiThuoc = maLoaiThuoc;
    }

    public LoaiThuoc getmLoaiThuoc() {
        return mLoaiThuoc;
    }

    public void setmLoaiThuoc(LoaiThuoc mLoaiThuoc) {
        this.mLoaiThuoc = mLoaiThuoc;
    }
    
}
