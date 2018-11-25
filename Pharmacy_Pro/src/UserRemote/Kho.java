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
public class Kho implements Serializable{
    private String maKho;
    private String tenKho;
    private String diaDiem;

    public Kho() {
    }

    public Kho(String maKho, String tenKho, String diaDiem) {
        this.maKho = maKho;
        this.tenKho = tenKho;
        this.diaDiem = diaDiem;
    }

    public String getMaKho() {
        return maKho;
    }

    public void setMaKho(String maKho) {
        this.maKho = maKho;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }
    
}
