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
public class DonViTinh implements Serializable{
    private String maDVT;
    private String tenDVT;

    public DonViTinh() {
    }

    public DonViTinh(String maDVT, String tenDVT) {
        this.maDVT = maDVT;
        this.tenDVT = tenDVT;
    }

    public DonViTinh(String maDVT) {
        this.maDVT = maDVT;
    }
    
    public String getMaDVT() {
        return maDVT;
    }

    public void setMaDVT(String maDVT) {
        this.maDVT = maDVT;
    }

    public String getTenDVT() {
        return tenDVT;
    }

    public void setTenDVT(String tenDVT) {
        this.tenDVT = tenDVT;
    }
    
    
}
