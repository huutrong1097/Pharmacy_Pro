
package UserRemote;

import java.io.Serializable;

public class KhachHang implements Serializable{
    private String maKH;
    private String tenKH;
    private String diaChiKH;
    private String dienThoaiKH;
    private String maLoaiKH;
    private String tenLoaiKH;
    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, String diaChiKH, String dienThoaiKH, String maLoaiKH, String tenLoaiKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChiKH = diaChiKH;
        this.dienThoaiKH = dienThoaiKH;
        this.maLoaiKH = maLoaiKH;
        this.tenLoaiKH = tenLoaiKH;
    }

    public KhachHang(String maKH, String tenKH, String diaChiKH, String dienThoaiKH, String maLoaiKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChiKH = diaChiKH;
        this.dienThoaiKH = dienThoaiKH;
        this.maLoaiKH = maLoaiKH;
    }

    public KhachHang(String maLoaiKH) {
        this.maLoaiKH = maLoaiKH;
    }
    
    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChiKH() {
        return diaChiKH;
    }

    public void setDiaChiKH(String diaChiKH) {
        this.diaChiKH = diaChiKH;
    }

    public String getDienThoaiKH() {
        return dienThoaiKH;
    }

    public void setDienThoaiKH(String dienThoaiKH) {
        this.dienThoaiKH = dienThoaiKH;
    }

    public String getMaLoaiKH() {
        return maLoaiKH;
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
