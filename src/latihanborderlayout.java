/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ding
 */
public class latihanborderlayout extends javax.swing.JFrame {

    /**
     * Creates new form latihanborderlayout
     */
    public latihanborderlayout() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        damn = new javax.swing.JPanel();
        box1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        box2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        profil = new javax.swing.JButton();
        galeri = new javax.swing.JButton();
        about = new javax.swing.JButton();
        home = new javax.swing.JButton();
        informasi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        box3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        damn.setBackground(new java.awt.Color(153, 153, 255));
        damn.setLayout(new java.awt.BorderLayout());

        box1.setBackground(new java.awt.Color(0, 204, 204));
        box1.setPreferredSize(new java.awt.Dimension(514, 200));
        box1.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ding\\Pictures\\gambarrrrrrr1.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setPreferredSize(new java.awt.Dimension(537, 256));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        box1.add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        box1.add(jPanel2, "card3");

        jPanel3.setBackground(new java.awt.Color(51, 0, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        box1.add(jPanel3, "card4");

        jPanel4.setBackground(new java.awt.Color(51, 51, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        box1.add(jPanel4, "card5");

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        box1.add(jPanel5, "card6");

        damn.add(box1, java.awt.BorderLayout.CENTER);

        box2.setBackground(new java.awt.Color(0, 51, 153));
        box2.setPreferredSize(new java.awt.Dimension(534, 140));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ding\\Pictures\\logo_unmul.png")); // NOI18N
        jLabel2.setText("jLabel2");

        profil.setText("Profil");
        profil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilActionPerformed(evt);
            }
        });

        galeri.setText("Galeri");
        galeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galeriActionPerformed(evt);
            }
        });

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        home.setText("Home");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        informasi.setText("Informasi");
        informasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informasiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("UNIVERSITAS MULAWARMAN");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("KOMPUTER & TEKNOLOGI INFORMASI");

        javax.swing.GroupLayout box2Layout = new javax.swing.GroupLayout(box2);
        box2.setLayout(box2Layout);
        box2Layout.setHorizontalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addGroup(box2Layout.createSequentialGroup()
                        .addComponent(home)
                        .addGap(26, 26, 26)
                        .addComponent(profil)
                        .addGap(18, 18, 18)
                        .addComponent(galeri)
                        .addGap(18, 18, 18)
                        .addComponent(informasi)
                        .addGap(18, 18, 18)
                        .addComponent(about)))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        box2Layout.setVerticalGroup(
            box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(box2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(home)
                    .addComponent(profil)
                    .addComponent(galeri)
                    .addComponent(informasi)
                    .addComponent(about))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        damn.add(box2, java.awt.BorderLayout.PAGE_START);

        box3.setBackground(new java.awt.Color(255, 153, 102));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("MODUL PRAKTIKUM PEMROGRAMAN VISUAL");

        jLabel4.setText("Copyright @2015");

        javax.swing.GroupLayout box3Layout = new javax.swing.GroupLayout(box3);
        box3.setLayout(box3Layout);
        box3Layout.setHorizontalGroup(
            box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box3Layout.createSequentialGroup()
                .addGroup(box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(box3Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel3))
                    .addGroup(box3Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel4)))
                .addContainerGap(325, Short.MAX_VALUE))
        );
        box3Layout.setVerticalGroup(
            box3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(box3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        damn.add(box3, java.awt.BorderLayout.PAGE_END);

        jMenu1.setText("data");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("laporan");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("keluar");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(damn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(damn, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void profilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_profilActionPerformed

    private void galeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galeriActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_galeriActionPerformed

    private void informasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informasiActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_informasiActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

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
            java.util.logging.Logger.getLogger(latihanborderlayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihanborderlayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihanborderlayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihanborderlayout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihanborderlayout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JPanel box1;
    private javax.swing.JPanel box2;
    private javax.swing.JPanel box3;
    private javax.swing.JPanel damn;
    private javax.swing.JButton galeri;
    private javax.swing.JButton home;
    private javax.swing.JButton informasi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton profil;
    // End of variables declaration//GEN-END:variables
}
