
package UserRemote;
import java.io.Serializable;
public class NhaCC implements Serializable{
    private String maNCC;
    private String tenNCC;
    private String diaChiNCC;
    private String dienThoaiNCC;

    public NhaCC(String maNCC, String tenNCC, String diaChiNCC, String dienThoaiNCC) {
        this.maNCC = maNCC;
        this.tenNCC = tenNCC;
        this.diaChiNCC = diaChiNCC;
        this.dienThoaiNCC = dienThoaiNCC;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public String getTenNCC() {
        return tenNCC;
    }

    public void setTenNCC(String tenNCC) {
        this.tenNCC = tenNCC;
    }

    public String getDiaChiNCC() {
        return diaChiNCC;
    }

    public void setDiaChiNCC(String diaChiNCC) {
        this.diaChiNCC = diaChiNCC;
    }

    public String getDienThoaiNCC() {
        return dienThoaiNCC;
    }

    public void setDienThoaiNCC(String dienThoaiNCC) {
        this.dienThoaiNCC = dienThoaiNCC;
    }
    
    
}
