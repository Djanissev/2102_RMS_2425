package resortfrontdeskmanagementsystem1;

import java.awt.HeadlessException;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;



public class guestdetailsbills extends javax.swing.JFrame {

    /**
     * Creates new form guestdetailsbills
     */
    public guestdetailsbills() {
        initComponents();
        SimpleDateFormat myFormat= new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal=Calendar.getInstance();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtextsearch = new javax.swing.JTextField();
        jsearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jbackbutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setText("CLICK ON TABLE ROW TO OPEN BILL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 700, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Search By Check Out Date");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, 20));
        getContentPane().add(jtextsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, 350, -1));

        jsearch.setText("Search");
        jsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsearchActionPerformed(evt);
            }
        });
        getContentPane().add(jsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mobile Number", "Email", "Id Proof", "Address", "Check In Date", "Room/Cottage Type", "Room/Cottage Number", "Price Per Day", "Number Of Days Stay", "Total Amount", "Check Out"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 950, 420));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel3.setText("Guest Details Bills");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jbackbutton.setText("Home");
        jbackbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jbackbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 40, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/formsbg.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
       ResultSet rs = Select.getData("SELECT * FROM customer WHERE checkOut IS NOT NULL");

       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

       try {
      
        rs = Select.getData("SELECT * FROM customer WHERE checkOut IS NOT NULL");
    
        if (rs != null) {
            
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14),
                    rs.getString(15),
                    rs.getString(16)
                });
            }
        }
        } 
       catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
       } finally {
        try {
            
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error closing ResultSet: " + e.getMessage());
        }
    }
       
    }//GEN-LAST:event_jTable1ComponentShown

    private void jbackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackbuttonActionPerformed
        int response = JOptionPane.showConfirmDialog(this,
                "Do you want really to go back?",
                "Confirm",
                JOptionPane.YES_NO_OPTION);
        
        if (response == JOptionPane.YES_OPTION) {
            dispose();
            main m = new main ();
            m.setTitle("Go back to main");
            m.setLocationRelativeTo(null);
            m.setVisible(true);   
        } else {
            System.out.println ("User chose to stay on the current page.");
        }
        
    }//GEN-LAST:event_jbackbuttonActionPerformed

    private void jsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsearchActionPerformed
       String checkoutDate=jtextsearch.getText();
        ResultSet rs =Select.getData("select *from customer where checkOut'" +checkoutDate+"'");
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

       try {
      
        rs = Select.getData("SELECT * FROM customer WHERE checkOut IS NOT NULL");
       
        if (rs != null) {
            
            model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14),
                    rs.getString(15),
                    rs.getString(16)
                });
            }
        }
        } 
       catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
       } finally {
        try {
            
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error closing ResultSet: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_jsearchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int index=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id=model.getValueAt(index, 0).toString();
     try {
         String filePath = "E:\\" + id + ".pdf";  

    
         if ((new File(filePath)).exists()) {
        } 
        else {
     
            JOptionPane.showMessageDialog(null, "File does not exist");
    }
}       catch (HeadlessException e) {
          JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
}

    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(guestdetailsbills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guestdetailsbills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guestdetailsbills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guestdetailsbills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new guestdetailsbills().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbackbutton;
    private javax.swing.JButton jsearch;
    private javax.swing.JTextField jtextsearch;
    // End of variables declaration//GEN-END:variables
}
