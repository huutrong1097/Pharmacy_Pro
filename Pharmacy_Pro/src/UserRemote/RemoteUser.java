/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserRemote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author Thomas Nguyen
 */
public interface RemoteUser extends Remote {

    public boolean KiemTraDangNhap(User user) throws RemoteException;

    public boolean KiemTraSo(String str) throws RemoteException;

    public int DangKy(User user) throws RemoteException;

    public ArrayList<User> LoadData() throws RemoteException;

    public ArrayList<User> Search(String Search) throws RemoteException;

    public ArrayList<User> Load_Combobox() throws RemoteException;

    public String XoaNhanVien(String indexDelete) throws RemoteException;

    public void CapNhatNVien(User user) throws RemoteException;

    //Nhà cung cấp
    public ArrayList<NhaCC> LoadData_NCC() throws RemoteException;

    public int ThemNCC(NhaCC ncc) throws RemoteException;

    public String XoaNCC(String indexDelete) throws RemoteException;

    //Khách hàng
    public ArrayList<KhachHang> LoadData_KH() throws RemoteException;

    public int ThemKH(KhachHang kh) throws RemoteException;

    public String XoaKH(String indexDelete) throws RemoteException;

    public ArrayList<KhachHang> TimKiem(String Search) throws RemoteException;

    //Loại khách hàng
    public ArrayList<LoaiKhachHang> LoadData_LKH() throws RemoteException;

    public int ThemLKH(LoaiKhachHang lkh) throws RemoteException;

    public String XoaLKH(String indexDelete) throws RemoteException;

    public ArrayList<LoaiKhachHang> LoadCombobox_KH() throws RemoteException;

    //thuốc
    public ArrayList<Thuoc> LoadThuocs() throws RemoteException;

    public ArrayList<Thuoc> TimKiemThuoc(String timKiem) throws RemoteException;

    public String XoaThuoc(String indexDelete) throws RemoteException;

    public int ThemThuoc(Thuoc th) throws RemoteException;

    public void CapNhatThuoc(Thuoc thuoc) throws RemoteException;
    //Loai thuoc

    public ArrayList<LoaiThuoc> LoadLThuoc() throws RemoteException;

    public ArrayList<LoaiThuoc> LoadComLThuoc() throws RemoteException;
    
    public ArrayList<LoaiThuoc> TimKiemLThuoc(String timKiem) throws RemoteException ;

    public int ThemLThuoc(LoaiThuoc lt) throws RemoteException;

    public String XoaLThuoc(String indexDelete) throws RemoteException;

    public void CapNhatLoaiThuoc(LoaiThuoc lt) throws RemoteException;
    
    //Đơn vị tính

    public ArrayList<DonViTinh> LoadData_DonVT() throws RemoteException;

    public ArrayList<DonViTinh> LoadComDonVT() throws RemoteException;
    
    public ArrayList<DonViTinh> TimKiemDVT(String timKiem) throws RemoteException;
    
    public int ThemDonVT(DonViTinh dvt) throws RemoteException;
    
    public String XoaDVT(String indexDelete) throws RemoteException;
    
    public void CapNhatDVT(DonViTinh dvt) throws RemoteException;
}
