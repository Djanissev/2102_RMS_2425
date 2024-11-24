/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resortfrontdeskmanagementsystem1;

/**
 *
 * @author djani
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
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

        jcheckin = new javax.swing.JButton();
        jcheckout = new javax.swing.JButton();
        jpayment = new javax.swing.JButton();
        jbooking = new javax.swing.JButton();
        jcancelb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jrooms = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jlogoutbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcheckin.setBackground(new java.awt.Color(204, 255, 204));
        jcheckin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcheckin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkin.png"))); // NOI18N
        jcheckin.setText("CHECK IN");
        jcheckin.setBorder(null);
        jcheckin.setFocusable(false);
        jcheckin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jcheckin.setIconTextGap(-5);
        jcheckin.setPreferredSize(new java.awt.Dimension(127, 81));
        jcheckin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jcheckin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jcheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckinActionPerformed(evt);
            }
        });
        getContentPane().add(jcheckin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 140, 70));

        jcheckout.setBackground(new java.awt.Color(204, 255, 204));
        jcheckout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcheckout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkout.png"))); // NOI18N
        jcheckout.setText("CHECK OUT");
        jcheckout.setBorder(null);
        jcheckout.setFocusPainted(false);
        jcheckout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jcheckout.setIconTextGap(-5);
        jcheckout.setPreferredSize(new java.awt.Dimension(127, 81));
        jcheckout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jcheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckoutActionPerformed(evt);
            }
        });
        getContentPane().add(jcheckout, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 140, 70));

        jpayment.setBackground(new java.awt.Color(204, 255, 204));
        jpayment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jpayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pay.png"))); // NOI18N
        jpayment.setText("PAYMENT");
        jpayment.setBorder(null);
        jpayment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpayment.setIconTextGap(-5);
        jpayment.setPreferredSize(new java.awt.Dimension(127, 81));
        jpayment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpaymentActionPerformed(evt);
            }
        });
        getContentPane().add(jpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 140, 70));

        jbooking.setBackground(new java.awt.Color(204, 255, 204));
        jbooking.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        jbooking.setText("BOOKING");
        jbooking.setBorder(null);
        jbooking.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbooking.setIconTextGap(-5);
        jbooking.setPreferredSize(new java.awt.Dimension(127, 81));
        jbooking.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbookingActionPerformed(evt);
            }
        });
        getContentPane().add(jbooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 140, 70));

        jcancelb.setBackground(new java.awt.Color(204, 255, 204));
        jcancelb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcancelb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/xbook.png"))); // NOI18N
        jcancelb.setText("CANCEL BOOK");
        jcancelb.setBorder(null);
        jcancelb.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jcancelb.setIconTextGap(-5);
        jcancelb.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jcancelb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcancelbActionPerformed(evt);
            }
        });
        getContentPane().add(jcancelb, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 140, 70));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Creating Memories, One Sunset at a Time");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 350, -1, -1));

        jrooms.setBackground(new java.awt.Color(204, 255, 204));
        jrooms.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jrooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room.png"))); // NOI18N
        jrooms.setText("ROOMS");
        jrooms.setBorder(null);
        jrooms.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jrooms.setIconTextGap(-5);
        jrooms.setPreferredSize(new java.awt.Dimension(127, 81));
        jrooms.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jrooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jroomsActionPerformed(evt);
            }
        });
        getContentPane().add(jrooms, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 140, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/resortname.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, 150));

        jlogoutbutton.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jlogoutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key_1.png"))); // NOI18N
        jlogoutbutton.setText("LOGOUT");
        jlogoutbutton.setContentAreaFilled(false);
        jlogoutbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlogoutbutton.setFocusPainted(false);
        jlogoutbutton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlogoutbutton.setIconTextGap(1);
        jlogoutbutton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jlogoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogoutbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jlogoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 120, 50));

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 64)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("WELCOME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainbuttonbg.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/main_1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckinActionPerformed
        // TODO add your handling code here:
        new checkin().setVisible(true);
    }//GEN-LAST:event_jcheckinActionPerformed

    private void jcheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckoutActionPerformed
        // TODO add your handling code here:
        new checkout().setVisible(true);
    }//GEN-LAST:event_jcheckoutActionPerformed

    private void jroomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jroomsActionPerformed

        new room().setVisible(true);
    }//GEN-LAST:event_jroomsActionPerformed

    private void jlogoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogoutbuttonActionPerformed
        dispose();
        login l = new login();
        l.setLocationRelativeTo(null);//center the form
        l.setVisible(true);
        
    }//GEN-LAST:event_jlogoutbuttonActionPerformed

    private void jpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpaymentActionPerformed
        // TODO add your handling code here:
        new guestdetailsbills().setVisible(true);
    }//GEN-LAST:event_jpaymentActionPerformed

    private void jbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbookingActionPerformed
       new booking().setVisible(true);
    }//GEN-LAST:event_jbookingActionPerformed

    private void jcancelbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcancelbActionPerformed
        new cancelbooking().setVisible(true);
    }//GEN-LAST:event_jcancelbActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbooking;
    private javax.swing.JButton jcancelb;
    private javax.swing.JButton jcheckin;
    private javax.swing.JButton jcheckout;
    private javax.swing.JButton jlogoutbutton;
    private javax.swing.JButton jpayment;
    private javax.swing.JButton jrooms;
    // End of variables declaration//GEN-END:variables
}
