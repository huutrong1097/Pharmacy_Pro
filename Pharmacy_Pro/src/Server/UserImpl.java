package Server;

import UserRemote.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas Nguyen
 */
public class UserImpl extends UnicastRemoteObject implements RemoteUser {

    private DBAccess dba;
    private PreparedStatement pst;
    Connection con;
    NhanVienDB nvdb;
    NhaCungCapDB nccdb;
    LoaiKhachHangDB lkhdb;
    LoaiKhachHangDB lkH;
    ThuocDB tdb;
    LoaiThuocDB ltdb;
    DonViTinhDB dB;

    public UserImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean KiemTraDangNhap(User user) throws RemoteException {
        String sql = "SELECT * FROM nhanvien WHERE TenDN ='" + user.getTenDN() + "' and MatKhau ='" + user.getMatKhau() + "'";
        try {
            dba = new DBAccess();
            ResultSet rs = dba.Query(sql);
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }

    @Override
    public boolean KiemTraSo(String str) throws RemoteException {
        try {
            int d = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public int DangKy(User user) throws RemoteException {
        int res = 0;
        try {
            String sql = "INSERT INTO nhanvien VALUES(?,?,?,?,?,?)";
            MyConnection myCon = new MyConnection();
            con = (Connection) myCon.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getTenDN());
            pst.setString(2, user.getTenNV());
            pst.setString(3, user.getMatKhau());
            pst.setString(4, user.getDiaChi());
            pst.setString(5, user.getDienThoai());
            pst.setString(6, user.getQuyen());
            res = pst.executeUpdate();
        } catch (SQLException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    //Nhân viên
    @Override
    public ArrayList<User> LoadData() throws RemoteException {
        nvdb = new NhanVienDB();
        ArrayList<User> users = nvdb.LoadDataTB_NV();
        return users;
    }

    @Override
    public ArrayList<User> Search(String Search) throws RemoteException {
        nvdb = new NhanVienDB();
        ArrayList<User> listNV = nvdb.SearchNV(Search);
        return listNV;
    }

    @Override
    public ArrayList<User> Load_Combobox() throws RemoteException {
        nvdb = new NhanVienDB();
        ArrayList<User> load = nvdb.LoadCombobox_NV();
        return load;
    }

    @Override
    public String XoaNhanVien(String indexDelete) throws RemoteException {
        nvdb = new NhanVienDB();
        nvdb.XoaNV(indexDelete);
        return null;
    }

    @Override
    public void CapNhatNVien(User user) throws RemoteException {
        nvdb = new NhanVienDB();
        nvdb.CapNhatNV(user);
    }

    //Nhà cung cấp
    @Override
    public ArrayList<NhaCC> LoadData_NCC() throws RemoteException {
        nccdb = new NhaCungCapDB();
        ArrayList<NhaCC> loadA = nccdb.LoadData_NCCDB();
        return loadA;
    }

    @Override
    public int ThemNCC(NhaCC ncc) throws RemoteException {
        int res;
        nccdb = new NhaCungCapDB();
        res = nccdb.ThemNCCDB(ncc);
        return res;
    }

    @Override
    public String XoaNCC(String indexDelete) throws RemoteException {
        nccdb = new NhaCungCapDB();
        nccdb.XoaNCCDB(indexDelete);
        return null;
    }

    //Khách hàng
    @Override
    public ArrayList<KhachHang> LoadData_KH() throws RemoteException {
        KhachHangDB kh = new KhachHangDB();
        ArrayList<KhachHang> load = kh.LoadData_KHDB();
        return load;
    }

    @Override
    public int ThemKH(KhachHang kh) throws RemoteException {
        int res;
        KhachHangDB kH = new KhachHangDB();
        res = kH.ThemKHDB(kh);
        return res;
    }

    @Override
    public String XoaKH(String indexDelete) throws RemoteException {
        KhachHangDB kH = new KhachHangDB();
        kH.XoaKHDB(indexDelete);
        return null;
    }

    @Override
    public ArrayList<KhachHang> TimKiem(String Search) throws RemoteException {
        KhachHangDB kh = new KhachHangDB();
        ArrayList<KhachHang> arrSear = kh.TimKiemDB(Search);
        return arrSear;
    }

    //Loại khách hàng
    @Override
    public ArrayList<LoaiKhachHang> LoadData_LKH() throws RemoteException {
        lkhdb = new LoaiKhachHangDB();
        ArrayList<LoaiKhachHang> loadA = lkhdb.LoadData_LoaiKHDB();
        return loadA;
    }

    @Override
    public int ThemLKH(LoaiKhachHang lkh) throws RemoteException {
        int res;
        lkH = new LoaiKhachHangDB();
        res = lkH.ThemLKHDB(lkh);
        return res;
    }

    @Override
    public String XoaLKH(String indexDelete) throws RemoteException {
        lkH = new LoaiKhachHangDB();
        lkH.XoaLKHDB(indexDelete);
        return null;
    }

    @Override
    public ArrayList<LoaiKhachHang> LoadCombobox_KH() throws RemoteException {
        lkH = new LoaiKhachHangDB();
        ArrayList<LoaiKhachHang> LoadCombobox = lkH.LoadCombobox_KHDB();
        return LoadCombobox;
    }

    //thuốc
    @Override
    public ArrayList<Thuoc> LoadThuocs() throws RemoteException {
        tdb = new ThuocDB();
        ArrayList<Thuoc> listThuocs = tdb.LoadData_ThuocDB();
        return listThuocs;
    }

    @Override
    public ArrayList<Thuoc> TimKiemThuoc(String timKiem) throws RemoteException {
        tdb = new ThuocDB();
        ArrayList<Thuoc> listThuocs = tdb.TimKiemThuocDB(timKiem);
        return listThuocs;
    }

    @Override
    public void CapNhatThuoc(Thuoc thuoc) throws RemoteException {
        tdb = new ThuocDB();
        tdb.CapNhatThuocDB(thuoc);
    }

    @Override
    public String XoaThuoc(String indexDelete) throws RemoteException {
        tdb = new ThuocDB();
        tdb.XoaThuocDB(indexDelete);
        return null;
    }

    //loại thuốc
    @Override
    public ArrayList<LoaiThuoc> LoadLThuoc() throws RemoteException {
        ltdb = new LoaiThuocDB();
        ArrayList<LoaiThuoc> listThuocs = ltdb.LoadLThuocDB();
        return listThuocs;
    }

    @Override
    public ArrayList<LoaiThuoc> LoadComLThuoc() throws RemoteException {
        ltdb = new LoaiThuocDB();
        ArrayList<LoaiThuoc> listThuocs = ltdb.LoadComLThuocDB();
        return listThuocs;
    }

    @Override
    public ArrayList<LoaiThuoc> TimKiemLThuoc(String timKiem) throws RemoteException {
        ltdb = new LoaiThuocDB();
        ArrayList<LoaiThuoc> listLThuocs = ltdb.TimKiemLThuocDB(timKiem);
        return listLThuocs;
    }

    @Override
    public int ThemLThuoc(LoaiThuoc lt) throws RemoteException {
        int res;
        ltdb = new LoaiThuocDB();
        res = ltdb.ThemLThuocDB(lt);
        return res;
    }

    @Override
    public String XoaLThuoc(String indexDelete) throws RemoteException {
        ltdb = new LoaiThuocDB();
        ltdb.XoaLThuocDB(indexDelete);
        return null;
    }

    @Override
    public void CapNhatLoaiThuoc(LoaiThuoc lt) throws RemoteException {
        ltdb = new LoaiThuocDB();
        ltdb.CapNhatLoaiThuocDB(lt);
    }

    @Override

    public int ThemThuoc(Thuoc th) throws RemoteException {
        int res;
        tdb = new ThuocDB();
        res = tdb.ThemThuocDB(th);
        return res;
    }

    //Đơn vị tính
    @Override
    public ArrayList<DonViTinh> LoadData_DonVT() throws RemoteException {
        dB = new DonViTinhDB();
        ArrayList<DonViTinh> listDVT = dB.LoadData_DonVTDB();
        return listDVT;
    }

    @Override
    public ArrayList<DonViTinh> LoadComDonVT() throws RemoteException {
        dB = new DonViTinhDB();
        ArrayList<DonViTinh> listDVT = dB.LoadComDonVTDB();
        return listDVT;
    }

    @Override
    public ArrayList<DonViTinh> TimKiemDVT(String timKiem) throws RemoteException{
        dB = new DonViTinhDB();
        ArrayList<DonViTinh> listDVT = dB.TimKiemDVTDB(timKiem);
        return listDVT;
    }

    @Override
    public int ThemDonVT(DonViTinh dvt) throws RemoteException {
        dB = new DonViTinhDB();
        int res = dB.ThemDonVTDB(dvt);
        return res;
    }

    @Override
    public String XoaDVT(String indexDelete) throws RemoteException {
        dB = new DonViTinhDB();
        dB.XoaDVTDB(indexDelete);
        return null;
    }

    public void CapNhatDVT(DonViTinh dvt) throws RemoteException {
        dB = new DonViTinhDB();
        dB.CapNhatDVTDB(dvt);
    }

}
