package Client;

import UserRemote.User;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmDangKy extends javax.swing.JFrame {

    RMI_Client rmi;
    User u;

    public frmDangKy() {
        initComponents();
        setLocationRelativeTo(null);
        rmi = new RMI_Client();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblTenDangNhap = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_tendangnhap = new javax.swing.JTextField();
        txt_tennguoidung = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        txt_matkhau = new javax.swing.JPasswordField();
        lblReMatKhau1 = new javax.swing.JLabel();
        txt_diachi = new javax.swing.JTextField();
        lblReMatKhau4 = new javax.swing.JLabel();
        txt_dienthoai = new javax.swing.JTextField();
        lblReMatKhau3 = new javax.swing.JLabel();
        txt_quyen = new javax.swing.JTextField();
        btn_ok = new javax.swing.JButton();
        btn_huy = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng ký");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTenDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.png"))); // NOI18N
        lblTenDangNhap.setText("   Tên Đăng Nhập");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaption);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/users-mixed-gender-icon.png"))); // NOI18N
        jLabel1.setText("Sign up");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user-male-edit-icon.png"))); // NOI18N
        jLabel3.setText("Tên Nhân Viên ");

        lblMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N
        lblMatKhau.setText("  Mật Khẩu");

        txt_matkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_matkhauActionPerformed(evt);
            }
        });

        lblReMatKhau1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Address-Book-icon.png"))); // NOI18N
        lblReMatKhau1.setText("  Địa chỉ ");

        lblReMatKhau4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phone-icon.png"))); // NOI18N
        lblReMatKhau4.setText("Số điện thoại ");

        lblReMatKhau3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/permission.png"))); // NOI18N
        lblReMatKhau3.setText("Quyền");

        btn_ok.setBackground(new java.awt.Color(0, 153, 0));
        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        btn_huy.setBackground(new java.awt.Color(0, 153, 0));
        btn_huy.setText("Hủy");
        btn_huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_huyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(lblTenDangNhap)
                        .addGap(10, 10, 10)
                        .addComponent(txt_tendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblReMatKhau3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lblMatKhau)
                            .addComponent(lblReMatKhau1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_tennguoidung, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btn_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblReMatKhau4)
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_quyen, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenDangNhap)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txt_tendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_tennguoidung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatKhau)
                    .addComponent(txt_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReMatKhau1)
                    .addComponent(txt_diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReMatKhau4)
                    .addComponent(txt_dienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblReMatKhau3)
                    .addComponent(txt_quyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_huy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean validation() {
        if (txt_tendangnhap.getText().equals("") || txt_matkhau.getPassword().equals("")) {
            return false;
        }
        return true;
    }
    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        String tenDN = txt_tendangnhap.getText();
        String tenNV = txt_tennguoidung.getText();
        String matKhau = new String(txt_matkhau.getPassword());
        String diaChi = txt_diachi.getText();
        String dienThoai = txt_dienthoai.getText();
        String quyen = txt_quyen.getText();
        u = new User(tenDN, tenNV, matKhau, diaChi, dienThoai, quyen);
        if (validation()) {
            try {
                if (!rmi.user.KiemTraSo(dienThoai)) {
                    JOptionPane.showMessageDialog(null, "Số điện thoại phải là số!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    int res = rmi.user.DangKy(u);
                    if (res > 0) {
                        JOptionPane.showMessageDialog(null, "Đăng ký thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                        new frmMainLogin().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Đã tồn tại tên đăng nhập", "Warning", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (RemoteException ex) {
                Logger.getLogger(frmMainLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Bạn chưa điền đủ thông tin", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_huyActionPerformed
        new frmMainLogin().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_huyActionPerformed

    private void txt_matkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_matkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_matkhauActionPerformed

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
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_huy;
    private javax.swing.JButton btn_ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblReMatKhau1;
    private javax.swing.JLabel lblReMatKhau3;
    private javax.swing.JLabel lblReMatKhau4;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JTextField txt_diachi;
    private javax.swing.JTextField txt_dienthoai;
    private javax.swing.JPasswordField txt_matkhau;
    private javax.swing.JTextField txt_quyen;
    private javax.swing.JTextField txt_tendangnhap;
    private javax.swing.JTextField txt_tennguoidung;
    // End of variables declaration//GEN-END:variables
}
