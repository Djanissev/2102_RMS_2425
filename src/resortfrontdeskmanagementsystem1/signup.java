package resortfrontdeskmanagementsystem1;

import Database.signuplogindb;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class signup extends javax.swing.JFrame {  
   
    public signup() {
        initComponents();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jfname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jlname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        juname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jaddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jpass = new javax.swing.JPasswordField();
        jsignupbutton = new javax.swing.JButton();
        jloginbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jshowpass = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("RECEPTIONIST ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, 30));

        jfname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 330, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Last Name:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, 30));

        jlname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 330, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, 30));

        juname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(juname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 330, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, 30));

        jemail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 330, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Address:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, 30));

        jaddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 330, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, 30));

        jpass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 560, 330, -1));

        jsignupbutton.setBackground(new java.awt.Color(153, 255, 153));
        jsignupbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jsignupbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-user_1.png"))); // NOI18N
        jsignupbutton.setText("Signup ");
        jsignupbutton.setBorder(null);
        jsignupbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsignupbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jsignupbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 630, 330, 38));

        jloginbutton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jloginbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key_1.png"))); // NOI18N
        jloginbutton.setText("Login ");
        jloginbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 204), 2));
        jloginbutton.setContentAreaFilled(false);
        jloginbutton.setFocusPainted(false);
        jloginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(jloginbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 680, 100, 38));

        jLabel6.setFont(new java.awt.Font("Microsoft PhagsPa", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("SIGNUP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recep.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));

        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 160, -1, -1));

        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 180, -1, -1));

        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 220, -1, -1));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, -1, -1));

        jshowpass.setText("Show password");
        jshowpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jshowpassActionPerformed(evt);
            }
        });
        getContentPane().add(jshowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signupbg.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsignupbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsignupbuttonActionPerformed

        String firstname = jfname.getText();
        String lastname = jlname.getText();
        String username = juname.getText();
        String email = jemail.getText();
        String address = jaddress.getText();
        String password = new String(jpass.getPassword());
        
        if (firstname.isEmpty() || lastname.isEmpty() || username.isEmpty() || email.isEmpty()|| address.isEmpty() || password.isEmpty()) {
                 JOptionPane.showMessageDialog(jLabel10, "Fill all fields", "ERROR", JOptionPane.ERROR_MESSAGE);
        }else{
            receptionistSignup(firstname,lastname,username,email,address,password);
        }
    }//GEN-LAST:event_jsignupbuttonActionPerformed

    private void jloginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginbuttonActionPerformed
        dispose();
        login l = new login();
        l.setLocationRelativeTo(null);//center the form
        l.setVisible(true);
    }//GEN-LAST:event_jloginbuttonActionPerformed

    private void jshowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jshowpassActionPerformed
         if (jshowpass.isSelected()) {
            jpass.setEchoChar((char) 0); // Show the password (no mask)
        } else {
            jpass.setEchoChar('*'); // Mask the password with '*'
        }
    }//GEN-LAST:event_jshowpassActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new signup().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jaddress;
    private javax.swing.JTextField jemail;
    private javax.swing.JTextField jfname;
    private javax.swing.JTextField jlname;
    private javax.swing.JButton jloginbutton;
    private javax.swing.JPasswordField jpass;
    private javax.swing.JCheckBox jshowpass;
    private javax.swing.JButton jsignupbutton;
    private javax.swing.JTextField juname;
    // End of variables declaration//GEN-END:variables

    private void receptionistSignup(String firstname, String lastname, String username, String email, String address, String password) {
        Connection dbconn = signuplogindb.connectDB();
        if(dbconn !=null){
        try {
            PreparedStatement st = (PreparedStatement)
                    dbconn.prepareStatement("INSERT INTO receptionist (firstname,lastname,username,email,address,password) VALUES (?,?,?,?,?,?)");
            
            st.setString(1, firstname);
            st.setString(2, lastname);
            st.setString(3, username);
            st.setString(4, email);
            st.setString(5, address);
            st.setString(6, password);
            
            int res = st.executeUpdate();
            JOptionPane.showMessageDialog(jLabel10, "Receptionist Data inserted", "ERROR", JOptionPane.INFORMATION_MESSAGE);
            
            jfname.setText("");
            jlname.setText("");
            juname.setText("");
            jemail.setText("");
            jaddress.setText("");
            jpass.setText("");
          
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        }else{
                System.out.println("The connection is not available");
                }
            
    }
} 
