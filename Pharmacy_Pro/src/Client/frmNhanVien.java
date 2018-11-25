/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import UserRemote.User;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thomas Nguyen
 */
public class frmNhanVien extends javax.swing.JFrame {
    RMI_Client rmi_client;
    DefaultTableModel dm;
    User u;
    public frmNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
        rmi_client = new RMI_Client();
        Show_Data();
        Show_Data_ComboBox();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenDN = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDienThoai = new javax.swing.JTextField();
        cboQuyen = new javax.swing.JComboBox<String>();
        btnTimKiem = new javax.swing.JButton();
        txt_Search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNhanVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Tên đăng nhâp");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Tên nhân viên");

        txtTenDN.setPreferredSize(new java.awt.Dimension(25, 25));

        txtTenNV.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Địa chỉ");

        txtMatKhau.setPreferredSize(new java.awt.Dimension(25, 25));

        txtDiaChi.setPreferredSize(new java.awt.Dimension(25, 25));

        btnSua.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edit-validated-icon.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/trash-icon.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Điện thoại");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Quyền");

        txtDienThoai.setPreferredSize(new java.awt.Dimension(25, 25));

        cboQuyen.setPreferredSize(new java.awt.Dimension(25, 25));
        cboQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboQuyenActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search-icon.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        txt_Search.setPreferredSize(new java.awt.Dimension(25, 25));

        tableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên đăng nhập", "Tên người dùng", "Mật khẩu", "Địa chỉ", "Điện thoại", "Quyền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableNhanVien.setToolTipText("");
        tableNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNhanVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnTimKiem)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSua)
                        .addGap(60, 60, 60)
                        .addComponent(btnXoa))
                    .addComponent(txt_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(258, 258, 258))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTenDN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cboQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtTenDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Show_Data() {
        try {
            ArrayList<User> list = rmi_client.user.LoadData();
            dm = (DefaultTableModel) tableNhanVien.getModel();//thêm dữ liêu vào tablenguoidung
            Object[] obj = new Object[6];
            for (int i = 0; i < list.size(); i++) {
                obj[0] = list.get(i).getTenDN();
                obj[1] = list.get(i).getTenNV();
                obj[2] = list.get(i).getMatKhau();
                obj[3] = list.get(i).getDiaChi();
                obj[4] = list.get(i).getDienThoai();
                obj[5] = list.get(i).getQuyen();
                dm.addRow(obj);//Thêm một dòng vào dm
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "Lỗi " + e);

        }
    }
    private void Show_Data_ComboBox() {
        try {
            ArrayList<User> list = rmi_client.user.Load_Combobox();
            for (int i = 0; i < list.size(); i++) {
                cboQuyen.addItem(list.get(i).getQuyen());
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "Lỗi " + e);

        }
    }
    private boolean validation() {
        if (txtTenDN.getText().equals("") || txtTenNV.getText().equals("")
                || txtMatKhau.getText().equals("") || txtDiaChi.getText().equals("") ||txtDienThoai.getText().equals("")){
            return false;
        }
        return true;
    }
//    public User quyen(){
//        u=(User)quyen_cbo.getSelectedItem();
//        return u;
//    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String tenDN = txtTenDN.getText();
        String tenND = txtTenNV.getText();
        String matKhau = txtMatKhau.getText();
        String diaChi = txtDiaChi.getText();
        String dienThoai = txtDienThoai.getText();
        String quyen=cboQuyen.getSelectedItem().toString();
        u = new User(tenDN, tenND, matKhau, diaChi, dienThoai,quyen);
        if (validation()) {
            try {
                if (!rmi_client.user.KiemTraSo(dienThoai)) {
                    JOptionPane.showMessageDialog(null,"Số điện thoại phải là số!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    rmi_client.user.CapNhatNVien(u);
                    dm.setRowCount(0);
                    Show_Data();
                }
            } catch (RemoteException ex) {
                Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa điền thông tin cần sửa");
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dongdachon = tableNhanVien.getSelectedRow();
        if (dongdachon == -1) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn dòng cần xóa");
        } else {
            int[] index = tableNhanVien.getSelectedRows();//lấy chỉ mục trong bảng khi người dùng click để xóa
            for (int i = 0; i < index.length; i++) {
                String indexDelete = tableNhanVien.getValueAt(index[i]/*dòng thứ i*/, 0/* cột 0 tên đăng nhập*/).toString();//chuyển sang chuỗi
                try {
                    rmi_client.user.XoaNhanVien(indexDelete);//đưa qua server xử lý xóa dữ liệu trong CSDL
                } catch (RemoteException ex) {
                    Logger.getLogger(frmNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            dm.setRowCount(0);//đặt số dòng về 0
            Show_Data();//load lại dữ liệu vào bảng sau khi xóa
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cboQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboQuyenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboQuyenActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String Search = txt_Search.getText();
        try {

            ArrayList<User> list = rmi_client.user.Search(Search);
            dm = (DefaultTableModel) tableNhanVien.getModel();//thêm dữ liêu vào tablenguoidung
            dm.setRowCount(0);
            Object[] obj = new Object[6];
            for (int i = 0; i < list.size(); i++) {
                obj[0] = list.get(i).getTenDN();
                obj[1] = list.get(i).getTenNV();
                obj[2] = list.get(i).getMatKhau();
                obj[3] = list.get(i).getDiaChi();
                obj[4] = list.get(i).getDienThoai();
                obj[5] = list.get(i).getQuyen();
                dm.addRow(obj);//Thêm một dòng vào dm
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "Lỗi " + e);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tableNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNhanVienMouseClicked
        int row = tableNhanVien.getSelectedRow();
        txtTenDN.setText(String.valueOf(tableNhanVien.getValueAt(row, 0)));
        txtTenNV.setText (String.valueOf(tableNhanVien.getValueAt(row, 1)));
        txtMatKhau.setText (String.valueOf(tableNhanVien.getValueAt(row, 2)));
        txtDiaChi.setText (String.valueOf(tableNhanVien.getValueAt(row, 3)));
        txtDienThoai.setText (String.valueOf(tableNhanVien.getValueAt(row, 4)));
        cboQuyen.setSelectedItem(String.valueOf(tableNhanVien.getValueAt(row, 5)));
        // TODO add your handling code here:
    }//GEN-LAST:event_tableNhanVienMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDienThoai;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTenDN;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txt_Search;
    // End of variables declaration//GEN-END:variables
}
