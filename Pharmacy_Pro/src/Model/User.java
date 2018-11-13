/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
/**
 *
 * @author Thomas Nguyen
 */
public class User implements Serializable{//Java object của chúng ta sẽ được chuyển đổi qua byte streams để truyền qua mạng
    private static final long serialVersionUID = 1L;// giá trị dùng để định nghĩa thứ tự data của object 
    private String tenDN;
    private String tenND;
    private String matKhau;
    private String diaChi;
    private String dienThoai;
    private String quyen;

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
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

    public User(String tenDN, String tenND, String matKhau, String diaChi, String dienThoai, String quyen) {
        this.tenDN = tenDN;
        this.tenND = tenND;
        this.matKhau = matKhau;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.quyen = quyen;
    }
}
