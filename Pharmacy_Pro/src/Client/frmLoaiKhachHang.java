/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import UserRemote.LoaiKhachHang;
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
public class frmLoaiKhachHang extends javax.swing.JFrame {
    RMI_Client rmi_client;
    DefaultTableModel dtm;
    LoaiKhachHang lkh;

    /**
     * Creates new form frmLoaiKhachHang
     */
    public frmLoaiKhachHang() {
        initComponents();
        setLocationRelativeTo(null);
        rmi_client = new RMI_Client();
        ShowData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaLKH = new javax.swing.JTextField();
        txtTenLKH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLoaiKH = new javax.swing.JTable();
        btnLuu = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Loại Khách Hàng", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Times New Roman", 0, 16), new java.awt.Color(0, 51, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setText("Mã Loại khách hàng ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setText("Tên Loại khách hàng");

        txtMaLKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtTenLKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tableLoaiKH.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tableLoaiKH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã loại khách hàng", "Tên loại khách hàng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableLoaiKH.setAlignmentX(5.0F);
        tableLoaiKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableLoaiKHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableLoaiKH);

        btnLuu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
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

        btnThem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actions-list-add-icon.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-Close-icon.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem)
                .addGap(176, 176, 176))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnLuu)
                    .addGap(48, 48, 48)
                    .addComponent(btnXoa)
                    .addGap(237, 237, 237)
                    .addComponent(btnThoat)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLuu)
                        .addComponent(btnXoa)
                        .addComponent(btnThoat))
                    .addContainerGap(159, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean validation() {
        if (txtMaLKH.getText().equals("") || txtTenLKH.getText().equals("")) {
            return false;
        }
        return true;
    }
    private void ShowData() {
        try {
            ArrayList<LoaiKhachHang> listLKH = rmi_client.user.LoadData_LKH();
            dtm = (DefaultTableModel) tableLoaiKH.getModel();//thêm dữ liêu vào tablenguoidung
            Object[] obj = new Object[2];
            for (int i = 0; i < listLKH.size(); i++) {
                obj[0] = listLKH.get(i).getMaLoaiKH();
                obj[1] = listLKH.get(i).getTenLoaiKH();
                dtm.addRow(obj);//Thêm một dòng vào dm
            }
        } catch (RemoteException e) {
            JOptionPane.showMessageDialog(null, "Lỗi " + e);

        }
    }
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String maLKH = txtMaLKH.getText();
        String tenLKH = txtTenLKH.getText();
        lkh = new LoaiKhachHang(maLKH, tenLKH);
        if (validation()) {
            try {
                int res = rmi_client.user.ThemLKH(lkh);
                if (res > 0) {
                    JOptionPane.showMessageDialog(null, "Lưu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    dtm.setRowCount(0);
                    ShowData();
                } else {
                    JOptionPane.showMessageDialog(null, "Đã tồn tại Mã loại khách hàng", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            } catch (RemoteException ex) {
                Logger.getLogger(frmLoaiKhachHang.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa điền đủ thông tin", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int dongdachon = tableLoaiKH.getSelectedRow();
        if (dongdachon == -1) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn dòng cần xóa");
        } else {
            int[] index = tableLoaiKH.getSelectedRows();//lấy chỉ mục trong bảng khi người dùng click để xóa
            for (int i = 0; i < index.length; i++) {
                String indexDelete = tableLoaiKH.getValueAt(index[i]/*dòng thứ i*/, 0/* cột 0 tên đăng nhập*/).toString();//chuyển sang chuỗi
                try {
                    rmi_client.user.XoaLKH(indexDelete);//đưa qua server xử lý xóa dữ liệu trong CSDL
                } catch (RemoteException ex) {
                    Logger.getLogger(frmLoaiKhachHang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            dtm.setRowCount(0);//đặt số dòng về 0
            ShowData();//load lại dữ liệu vào bảng sau khi xóa
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        txtMaLKH.setText("");
        txtTenLKH.setText("");
        txtMaLKH.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tableLoaiKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableLoaiKHMouseClicked
        int row=tableLoaiKH.getSelectedRow();
        txtMaLKH.setText(String.valueOf(tableLoaiKH.getValueAt(row, 0)));
        txtTenLKH.setText (String.valueOf(tableLoaiKH.getValueAt(row, 1)));
        // TODO add your handling code here:
    }//GEN-LAST:event_tableLoaiKHMouseClicked

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
            java.util.logging.Logger.getLogger(frmLoaiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoaiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoaiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoaiKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoaiKhachHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableLoaiKH;
    private javax.swing.JTextField txtMaLKH;
    private javax.swing.JTextField txtTenLKH;
    // End of variables declaration//GEN-END:variables
}
