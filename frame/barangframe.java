/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frame;

import javax.swing.JTable;
import javax.swing.JTextField;
import controller.databarangcontroller;
import javax.swing.JOptionPane;

/**
 *
 * @author MSI GF63
 */
public class barangframe extends javax.swing.JFrame {

    /**
     * Creates new form barangframe
     */
    databarangcontroller dc;
    public barangframe() {
        initComponents();
        dc = new databarangcontroller(this);
        dc.isitabel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldatabarang = new javax.swing.JTable();
        id_barangtxt = new javax.swing.JTextField();
        nama_barangtxt = new javax.swing.JTextField();
        harga_barangtxt = new javax.swing.JTextField();
        jumlah_stoktxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        insertbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabeldatabarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabeldatabarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldatabarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldatabarang);

        id_barangtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_barangtxtActionPerformed(evt);
            }
        });

        nama_barangtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_barangtxtActionPerformed(evt);
            }
        });

        harga_barangtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_barangtxtActionPerformed(evt);
            }
        });

        jumlah_stoktxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_stoktxtActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nama Barang");

        jLabel3.setText("Harga Barang");

        jLabel4.setText("Stok");

        insertbtn.setText("Tambah");
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id_barangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama_barangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harga_barangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertbtn)
                    .addComponent(updatebtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(deletebtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(back))
                        .addComponent(jumlah_stoktxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_barangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama_barangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga_barangtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlah_stoktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(insertbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn)
                    .addComponent(back))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_barangtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_barangtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_barangtxtActionPerformed

    private void nama_barangtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_barangtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_barangtxtActionPerformed

    private void harga_barangtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_barangtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_barangtxtActionPerformed

    private void jumlah_stoktxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_stoktxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_stoktxtActionPerformed

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
        // TODO add your handling code here:
        if(id_barangtxt.getText().equals("") || nama_barangtxt.getText().equals("")||harga_barangtxt.getText().equals("")||jumlah_stoktxt.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Data tidak valid");
        }
        else{
        dc.insert();
        dc.isitabel();
        }
        dc.clear();
        
    }//GEN-LAST:event_insertbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        if(id_barangtxt.getText().equals("") || nama_barangtxt.getText().equals("")||harga_barangtxt.getText().equals("")||jumlah_stoktxt.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Data tidak valid");
        }
        else{
        dc.update();
        dc.isitabel();}
        dc.clear();
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        dc.delete();
        dc.isitabel();
        dc.clear();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void tabeldatabarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldatabarangMouseClicked
int baris = tabeldatabarang.getSelectedRow();
        id_barangtxt.setText(tabeldatabarang.getValueAt(baris, 0).toString());
        nama_barangtxt.setText(tabeldatabarang.getValueAt(baris, 1).toString());
        harga_barangtxt.setText(tabeldatabarang.getValueAt(baris, 2).toString());
        jumlah_stoktxt.setText(tabeldatabarang.getValueAt(baris, 3).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_tabeldatabarangMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new mainv().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    public JTextField getHarga_barangtxt() {
        return harga_barangtxt;
    }

    public void setHarga_barangtxt(JTextField harga_barangtxt) {
        this.harga_barangtxt = harga_barangtxt;
    }

    public JTextField getId_barangtxt() {
        return id_barangtxt;
    }

    public void setId_barangtxt(JTextField id_barangtxt) {
        this.id_barangtxt = id_barangtxt;
    }

    public JTextField getJumlah_stoktxt() {
        return jumlah_stoktxt;
    }

    public void setJumlah_stoktxt(JTextField jumlah_stoktxt) {
        this.jumlah_stoktxt = jumlah_stoktxt;
    }

    public JTextField getNama_barangtxt() {
        return nama_barangtxt;
    }

    public void setNama_barangtxt(JTextField nama_barangtxt) {
        this.nama_barangtxt = nama_barangtxt;
    }

    public JTable getTabeldatabarang() {
        return tabeldatabarang;
    }

    public void setTabeldatabarang(JTable tabeldatabarang) {
        this.tabeldatabarang = tabeldatabarang;
    }

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
            java.util.logging.Logger.getLogger(barangframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barangframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barangframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barangframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barangframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextField harga_barangtxt;
    private javax.swing.JTextField id_barangtxt;
    private javax.swing.JButton insertbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah_stoktxt;
    private javax.swing.JTextField nama_barangtxt;
    private javax.swing.JTable tabeldatabarang;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}