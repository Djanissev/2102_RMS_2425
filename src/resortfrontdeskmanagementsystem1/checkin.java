package resortfrontdeskmanagementsystem1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Maricris
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class checkin extends javax.swing.JFrame {


    /**
     * Creates new form checkin
     */
    public checkin() {
        initComponents();
        setTodaysDate();
        
        
    }
    private void setTodaysDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        jcheckindate.setText(sdf.format(Calendar.getInstance().getTime()));
    }
    String roomSize;
    String roomandcottageType;
    String roomandcottageNumber;
    String price;
    
    public void roomDetails() {
        jrctype.removeAllItems();
        jprice.setText("");
        roomSize = (String)jroomsize.getSelectedItem();
        roomandcottageType = (String)jrctype.getSelectedItem();
        try
        {
           ResultSet rs = Select.getData("select *from room where roomSize '"+roomSize+"' and roomandcottageType '"+roomandcottageType+"' and status 'Not Booked'");
           while (rs.next())
           {
               jrctype.addItem((String) rs.getString(1));
               
           }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
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
        jname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jmobilenumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jidproof = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcheckindate = new javax.swing.JTextField();
        jroomsize = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jrctype = new javax.swing.JComboBox<>();
        jrcnumber = new javax.swing.JComboBox<>();
        jBackButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setText("Customer CheckIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 450, 80));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 200, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Mobile Number:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        jmobilenumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jmobilenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 200, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jemail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 200, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("ID Proof:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 80, -1));

        jidproof.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jidproof, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 210, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Address:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, -1, -1));

        jaddress.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 210, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Check IN Date (Today):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Room Size:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 190, -1, -1));

        jcheckindate.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jcheckindate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 210, -1));

        jroomsize.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jroomsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "         ", "Single", "Double", "Family" }));
        jroomsize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jroomsizeActionPerformed(evt);
            }
        });
        getContentPane().add(jroomsize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, 190, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Room and Cottage Type:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 250, -1, -1));

        jprice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, 190, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Room and Cottage Number:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 330, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Price:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 400, -1, -1));

        jrctype.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "            ", "Room", "Cottage" }));
        jrctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrctypeActionPerformed(evt);
            }
        });
        getContentPane().add(jrctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 280, 190, -1));

        jrcnumber.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrcnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrcnumberActionPerformed(evt);
            }
        });
        getContentPane().add(jrcnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 360, 190, -1));

        jBackButton.setText("Home");
        jBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 40, -1, 20));

        jButton2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton2.setText("Allote Room");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 530, -1, -1));

        jButton3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 570, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/formsbg.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jname.setText("");
        jmobilenumber.setText("");
        jemail.setText("");
        jidproof.setText("");
        jaddress.setText("");
        jcheckindate.setText("");
        jprice.setText("");
        jroomsize.setSelectedIndex(0);
        jrctype.setSelectedIndex(0);
        jrcnumber.setSelectedIndex(0);        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackButtonActionPerformed
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
    }//GEN-LAST:event_jBackButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new room().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jroomsizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jroomsizeActionPerformed
        roomDetails();
    }//GEN-LAST:event_jroomsizeActionPerformed

    private void jrctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrctypeActionPerformed
        roomDetails();
    }//GEN-LAST:event_jrctypeActionPerformed

    private void jrcnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrcnumberActionPerformed
        roomandcottageNumber = (String)jrcnumber.getSelectedItem();
        try
        {
            ResultSet rs = Select.getData ("select *from room where, roomandcottageNumber = '"+roomandcottageNumber+"'");
            while(rs.next())
            {
                jprice.setText((String) rs.getString(4));
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jrcnumberActionPerformed

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
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Correctly instantiate and show the Checkin frame
                new checkin().setVisible(true); // Use Checkin with capital "C"
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBackButton;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jaddress;
    private javax.swing.JTextField jcheckindate;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jidproof;
    private javax.swing.JTextField jmobilenumber;
    private javax.swing.JTextField jname;
    private javax.swing.JTextField jprice;
    private javax.swing.JComboBox<String> jrcnumber;
    private javax.swing.JComboBox<String> jrctype;
    private javax.swing.JComboBox<String> jroomsize;
    // End of variables declaration//GEN-END:variables
}
