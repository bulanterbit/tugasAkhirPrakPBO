/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

/**
 *
 * @author MSI GF63
 */
public class mainv extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public mainv() {
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

        stokbtn = new javax.swing.JButton();
        pembelianbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        stokbtn.setText("STOK BARANG");
        stokbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stokbtnActionPerformed(evt);
            }
        });

        pembelianbtn.setText("PEMBELIAN");
        pembelianbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembelianbtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("TOSERBA JEK");

        back.setText("Logout");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stokbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pembelianbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel1)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stokbtn)
                .addGap(18, 18, 18)
                .addComponent(pembelianbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stokbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stokbtnActionPerformed
        // TODO add your handling code here:
        new barangframe().setVisible(true);
        dispose();
    }//GEN-LAST:event_stokbtnActionPerformed

    private void pembelianbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembelianbtnActionPerformed
       new PembelianFrame().setVisible(true);
       this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_pembelianbtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(mainv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pembelianbtn;
    private javax.swing.JButton stokbtn;
    // End of variables declaration//GEN-END:variables
}
