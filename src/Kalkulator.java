/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AfnonymOus
 */
public class Kalkulator extends javax.swing.JFrame {

    String angka="";
    
    public Kalkulator() {
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

        no4 = new javax.swing.JButton();
        tampilan = new javax.swing.JTextField();
        no7 = new javax.swing.JButton();
        no8 = new javax.swing.JButton();
        hasil = new javax.swing.JButton();
        no6 = new javax.swing.JButton();
        no9 = new javax.swing.JButton();
        no5 = new javax.swing.JButton();
        no1 = new javax.swing.JButton();
        no2 = new javax.swing.JButton();
        koma = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        no3 = new javax.swing.JButton();
        del = new javax.swing.JButton();
        no0 = new javax.swing.JButton();
        tambah = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        no4.setBackground(new java.awt.Color(200, 200, 200));
        no4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no4.setText("4");
        no4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no4ActionPerformed(evt);
            }
        });
        getContentPane().add(no4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 40));

        tampilan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tampilan.setForeground(new java.awt.Color(0, 0, 0));
        tampilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilanActionPerformed(evt);
            }
        });
        getContentPane().add(tampilan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 80));

        no7.setBackground(new java.awt.Color(200, 200, 200));
        no7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no7.setText("7");
        no7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no7ActionPerformed(evt);
            }
        });
        getContentPane().add(no7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 50, 40));

        no8.setBackground(new java.awt.Color(200, 200, 200));
        no8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no8.setText("8");
        no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no8ActionPerformed(evt);
            }
        });
        getContentPane().add(no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 50, 40));

        hasil.setBackground(new java.awt.Color(200, 200, 200));
        hasil.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        hasil.setText("=");
        getContentPane().add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 110, 40));

        no6.setBackground(new java.awt.Color(200, 200, 200));
        no6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no6.setText("6");
        no6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no6ActionPerformed(evt);
            }
        });
        getContentPane().add(no6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 50, 40));

        no9.setBackground(new java.awt.Color(200, 200, 200));
        no9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no9.setText("9");
        no9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no9ActionPerformed(evt);
            }
        });
        getContentPane().add(no9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 50, 40));

        no5.setBackground(new java.awt.Color(200, 200, 200));
        no5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no5.setText("5");
        no5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no5ActionPerformed(evt);
            }
        });
        getContentPane().add(no5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 50, 40));

        no1.setBackground(new java.awt.Color(200, 200, 200));
        no1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no1.setText("1");
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });
        getContentPane().add(no1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 40));

        no2.setBackground(new java.awt.Color(200, 200, 200));
        no2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no2.setText("2");
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });
        getContentPane().add(no2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 50, 40));

        koma.setBackground(new java.awt.Color(200, 200, 200));
        koma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        koma.setText(",");
        koma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                komaActionPerformed(evt);
            }
        });
        getContentPane().add(koma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 50, 40));

        bagi.setBackground(new java.awt.Color(200, 200, 200));
        bagi.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        getContentPane().add(bagi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 50, 40));

        kali.setBackground(new java.awt.Color(200, 200, 200));
        kali.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        getContentPane().add(kali, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 50, 40));

        kurang.setBackground(new java.awt.Color(200, 200, 200));
        kurang.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        kurang.setText("-");
        getContentPane().add(kurang, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 50, 40));

        clear.setBackground(new java.awt.Color(200, 200, 200));
        clear.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 50, 90));

        no3.setBackground(new java.awt.Color(200, 200, 200));
        no3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        no3.setText("3");
        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });
        getContentPane().add(no3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 50, 40));

        del.setBackground(new java.awt.Color(200, 200, 200));
        del.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        del.setText("Del");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        getContentPane().add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 50, 40));

        no0.setBackground(new java.awt.Color(200, 200, 200));
        no0.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        no0.setText("0");
        no0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no0ActionPerformed(evt);
            }
        });
        getContentPane().add(no0, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 50, 40));

        tambah.setBackground(new java.awt.Color(200, 200, 200));
        tambah.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tambah.setText("+");
        getContentPane().add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 50, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void komaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_komaActionPerformed
        angka += ",";
        tampilan.setText(angka);
    }//GEN-LAST:event_komaActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kaliActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bagiActionPerformed

    private void no0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no0ActionPerformed
        angka += "0";
        tampilan.setText(angka);
    }//GEN-LAST:event_no0ActionPerformed

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        angka += "1";
        tampilan.setText(angka);
    }//GEN-LAST:event_no1ActionPerformed

    private void tampilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilanActionPerformed

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        angka += "2";
        tampilan.setText(angka);
    }//GEN-LAST:event_no2ActionPerformed

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no3ActionPerformed
        angka += "3";
        tampilan.setText(angka);
    }//GEN-LAST:event_no3ActionPerformed

    private void no4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no4ActionPerformed
        angka += "4";
        tampilan.setText(angka);
    }//GEN-LAST:event_no4ActionPerformed

    private void no5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no5ActionPerformed
        angka += "5";
        tampilan.setText(angka);
    }//GEN-LAST:event_no5ActionPerformed

    private void no6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no6ActionPerformed
        angka += "6";
        tampilan.setText(angka);
    }//GEN-LAST:event_no6ActionPerformed

    private void no7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no7ActionPerformed
        angka += "7";
        tampilan.setText(angka);
    }//GEN-LAST:event_no7ActionPerformed

    private void no8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no8ActionPerformed
       angka += "8";
       tampilan.setText(angka);
    }//GEN-LAST:event_no8ActionPerformed

    private void no9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no9ActionPerformed
        angka += "9";
        tampilan.setText(angka);
    }//GEN-LAST:event_no9ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        tampilan.setText("");
        no1=0.0;
        no2=0.0;
        hasil=0.0;
        angka="";
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JButton clear;
    private javax.swing.JButton del;
    private javax.swing.JButton hasil;
    private javax.swing.JButton kali;
    private javax.swing.JButton koma;
    private javax.swing.JButton kurang;
    private javax.swing.JButton no0;
    private javax.swing.JButton no1;
    private javax.swing.JButton no2;
    private javax.swing.JButton no3;
    private javax.swing.JButton no4;
    private javax.swing.JButton no5;
    private javax.swing.JButton no6;
    private javax.swing.JButton no7;
    private javax.swing.JButton no8;
    private javax.swing.JButton no9;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tampilan;
    // End of variables declaration//GEN-END:variables
}
