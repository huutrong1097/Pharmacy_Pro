/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;
import javax.swing.JOptionPane;

/**
 *
 * @author Thomas Nguyen
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain1
     */
    public frmMain() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menu_dangxuat = new javax.swing.JMenuItem();
        menu_thoat = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menu_ncc = new javax.swing.JMenuItem();
        menu_nhanvien = new javax.swing.JMenuItem();
        menu_khachhang = new javax.swing.JMenuItem();
        menu_thuoc = new javax.swing.JMenuItem();
        menu_loaithuoc = new javax.swing.JMenuItem();
        menu_kho = new javax.swing.JMenuItem();
        menu_lothuoc = new javax.swing.JMenuItem();
        menu_dvtinh = new javax.swing.JMenuItem();
        menu_loaikh = new javax.swing.JMenuItem();
        menu_diadan = new javax.swing.JMenuItem();
        menu_pcdiaban = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        menu_phieunhanhang = new javax.swing.JMenuItem();
        menu_phieunhaphang = new javax.swing.JMenuItem();
        menu_phieuxuathang = new javax.swing.JMenuItem();
        menu_muathuoc = new javax.swing.JMenuItem();
        menu_thanhli = new javax.swing.JMenuItem();
        menu_dathang = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý nhà thuốc tư nhân");
        setMinimumSize(new java.awt.Dimension(848, 560));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        jMenuBar1.setAlignmentX(0.1F);
        jMenuBar1.setAlignmentY(0.1F);
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jMenu3.setText("Hệ thống");

        menu_dangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        menu_dangxuat.setText("Đăng xuất");
        menu_dangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_dangxuatActionPerformed(evt);
            }
        });
        jMenu3.add(menu_dangxuat);

        menu_thoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Button-Close-icon.png"))); // NOI18N
        menu_thoat.setText("Thoát");
        menu_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_thoatActionPerformed(evt);
            }
        });
        jMenu3.add(menu_thoat);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Quản lý");
        jMenu4.setAlignmentX(1.0F);

        menu_ncc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Office-Customer-Male-Light-icon.png"))); // NOI18N
        menu_ncc.setText("Nhà cung cấp");
        menu_ncc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nccActionPerformed(evt);
            }
        });
        jMenu4.add(menu_ncc);

        menu_nhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Preppy-icon.png"))); // NOI18N
        menu_nhanvien.setText("Nhân viên cửa hàng");
        menu_nhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nhanvienActionPerformed(evt);
            }
        });
        jMenu4.add(menu_nhanvien);

        menu_khachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.png"))); // NOI18N
        menu_khachhang.setText("Khách hàng");
        menu_khachhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_khachhangActionPerformed(evt);
            }
        });
        jMenu4.add(menu_khachhang);

        menu_thuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pill-icon.png"))); // NOI18N
        menu_thuoc.setText("Thuốc");
        menu_thuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_thuocActionPerformed(evt);
            }
        });
        jMenu4.add(menu_thuoc);

        menu_loaithuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pill-icon.png"))); // NOI18N
        menu_loaithuoc.setText("Loại thuốc");
        menu_loaithuoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_loaithuocActionPerformed(evt);
            }
        });
        jMenu4.add(menu_loaithuoc);

        menu_kho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/City-Warehouse-icon.png"))); // NOI18N
        menu_kho.setText("Kho");
        jMenu4.add(menu_kho);

        menu_lothuoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Parcel-icon.png"))); // NOI18N
        menu_lothuoc.setText("Lô thuốc");
        jMenu4.add(menu_lothuoc);

        menu_dvtinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/unit-icon.png"))); // NOI18N
        menu_dvtinh.setText("Đơn vị tính");
        menu_dvtinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_dvtinhActionPerformed(evt);
            }
        });
        jMenu4.add(menu_dvtinh);

        menu_loaikh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/username.png"))); // NOI18N
        menu_loaikh.setText("Loại khách hàng");
        menu_loaikh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_loaikhActionPerformed(evt);
            }
        });
        jMenu4.add(menu_loaikh);

        menu_diadan.setText("Địa bàn");
        jMenu4.add(menu_diadan);

        menu_pcdiaban.setText("Phân công địa bàn");
        jMenu4.add(menu_pcdiaban);

        jMenuBar1.add(jMenu4);

        jMenu10.setText("Nghiệp vụ");

        menu_phieunhanhang.setText("Lập phiếu nhận hàng");
        jMenu10.add(menu_phieunhanhang);

        menu_phieunhaphang.setText("Lập phiếu nhập hàng");
        jMenu10.add(menu_phieunhaphang);

        menu_phieuxuathang.setText("Lập phiếu xuất hàng");
        jMenu10.add(menu_phieuxuathang);

        menu_muathuoc.setText("Lập hợp đồng mua thuốc");
        jMenu10.add(menu_muathuoc);

        menu_thanhli.setText("Lập phiếu thanh lí");
        jMenu10.add(menu_thanhli);

        menu_dathang.setText("Lập phiếu đặt hàng");
        menu_dathang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_dathangActionPerformed(evt);
            }
        });
        jMenu10.add(menu_dathang);

        jMenuBar1.add(jMenu10);

        jMenu11.setText("Tìm kiếm");

        jMenuItem25.setText("Khách hàng");
        jMenu11.add(jMenuItem25);

        jMenuItem26.setText("Nhà cung cấp");
        jMenu11.add(jMenuItem26);

        jMenuItem27.setText("Nhân viên");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem27);

        jMenuItem28.setText("Thuốc");
        jMenu11.add(jMenuItem28);

        jMenuItem29.setText("Trình dược viên");
        jMenu11.add(jMenuItem29);

        jMenuItem30.setText("Phiếu nhận hàng");
        jMenu11.add(jMenuItem30);

        jMenuItem31.setText("Phiếu nhập kho");
        jMenu11.add(jMenuItem31);

        jMenuItem32.setText("Phiếu xuất kho");
        jMenu11.add(jMenuItem32);

        jMenuItem33.setText("Hợp đồng mua thuốc");
        jMenu11.add(jMenuItem33);

        jMenuItem34.setText("Phiếu thanh lí");
        jMenu11.add(jMenuItem34);

        jMenuItem35.setText("Phiếu đặt hàng");
        jMenu11.add(jMenuItem35);

        jMenuBar1.add(jMenu11);

        jMenu12.setText("Giúp đỡ");
        jMenu12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuItem36.setText("Hướng dẫn sử dụng");
        jMenuItem36.setAlignmentY(1.0F);
        jMenu12.add(jMenuItem36);

        jMenuItem37.setText("Thông tin người thiết kế");
        jMenuItem37.setAlignmentY(1.0F);
        jMenu12.add(jMenuItem37);

        jMenuBar1.add(jMenu12);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_dangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_dangxuatActionPerformed
        int kq = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn đăng xuất không ?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (kq == 0) {
            this.dispose();
            new frmMainLogin().setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_dangxuatActionPerformed

    private void menu_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_thoatActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_thoatActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void menu_nhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nhanvienActionPerformed
        frmNhanVien fNV;
        fNV = new frmNhanVien();
        fNV.setVisible(true);
    }//GEN-LAST:event_menu_nhanvienActionPerformed

    private void menu_nccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nccActionPerformed
        new frmNhaCungCap().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_nccActionPerformed

    private void menu_khachhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_khachhangActionPerformed
        new frmKhachHang().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_khachhangActionPerformed

    private void menu_dathangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_dathangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_dathangActionPerformed

    private void menu_thuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_thuocActionPerformed
        new frmThuoc().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_thuocActionPerformed

    private void menu_loaikhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_loaikhActionPerformed
        new frmLoaiKhachHang().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_loaikhActionPerformed

    private void menu_loaithuocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_loaithuocActionPerformed
        new frmLoaiThuoc().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_loaithuocActionPerformed

    private void menu_dvtinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_dvtinhActionPerformed
        new frmDonViTinh().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_menu_dvtinhActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem menu_dangxuat;
    private javax.swing.JMenuItem menu_dathang;
    private javax.swing.JMenuItem menu_diadan;
    private javax.swing.JMenuItem menu_dvtinh;
    private javax.swing.JMenuItem menu_khachhang;
    private javax.swing.JMenuItem menu_kho;
    private javax.swing.JMenuItem menu_loaikh;
    private javax.swing.JMenuItem menu_loaithuoc;
    private javax.swing.JMenuItem menu_lothuoc;
    private javax.swing.JMenuItem menu_muathuoc;
    private javax.swing.JMenuItem menu_ncc;
    private javax.swing.JMenuItem menu_nhanvien;
    private javax.swing.JMenuItem menu_pcdiaban;
    private javax.swing.JMenuItem menu_phieunhanhang;
    private javax.swing.JMenuItem menu_phieunhaphang;
    private javax.swing.JMenuItem menu_phieuxuathang;
    private javax.swing.JMenuItem menu_thanhli;
    private javax.swing.JMenuItem menu_thoat;
    private javax.swing.JMenuItem menu_thuoc;
    // End of variables declaration//GEN-END:variables
}
