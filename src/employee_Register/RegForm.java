/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_Register;

import java.sql.*;
import javax.swing.*;
import tables.co.ug.Reg_Table;
import connect.all.ug.ConnectDB;


public class RegForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ButtonGroup group;
    ButtonGroup group2;
    
    private String gender;
    private String nationality;
    
    public RegForm() {
        initComponents();
        setResizable(false);
        setTitle("Ministry Of Finance Attendance Management System (MOFAMS)");
        group = new ButtonGroup();
        group.add(radioMale);
        group.add(radioFemale);
        
        group2 = new ButtonGroup();
        group2.add(radioUganda);
        group2.add(radioForeign);
    }

 
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioForeign = new javax.swing.JRadioButton();
        radioUganda = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        job = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dob = new com.toedter.calendar.JDateChooser();
        rePass = new javax.swing.JPasswordField();
        pass = new javax.swing.JPasswordField();
        depart = new javax.swing.JComboBox<>();
        city = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setPreferredSize(new java.awt.Dimension(840, 500));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/arms.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 220, 160));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 70, 30));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 60, 30));
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 170, 30));

        radioMale.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        radioMale.setForeground(new java.awt.Color(255, 255, 255));
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });
        jPanel3.add(radioMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 70, -1));

        radioFemale.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        radioFemale.setForeground(new java.awt.Color(255, 255, 255));
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });
        jPanel3.add(radioFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 70, -1));

        radioForeign.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        radioForeign.setForeground(new java.awt.Color(255, 255, 255));
        radioForeign.setText("Foreigner");
        radioForeign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioForeignActionPerformed(evt);
            }
        });
        jPanel3.add(radioForeign, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 90, -1));

        radioUganda.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        radioUganda.setForeground(new java.awt.Color(255, 255, 255));
        radioUganda.setText("Ugandan");
        radioUganda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioUgandaActionPerformed(evt);
            }
        });
        jPanel3.add(radioUganda, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 90, 20));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sex");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 40, 30));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Nationality");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 70, 30));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Re_enter Password");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 110, 30));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Status");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, 50, 30));

        jLabel15.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Date of Birth");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 80, 30));

        jLabel16.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Job Title");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 60, 30));

        jLabel17.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Address");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 50, 30));
        jPanel3.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, 170, 30));
        jPanel3.add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 170, 30));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/flat4.jpg"))); // NOI18N
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 500, 110));

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 70, 30));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 490, 140, 30));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 70, 30));
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 170, 30));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Department");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 70, 30));
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 180, 30));

        jLabel20.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Username");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 70, 30));
        jPanel3.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 170, 30));

        jLabel21.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Mobile_No");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 60, 30));

        jLabel22.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Please kindly register with us");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 340, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One...", "Married", "Single" }));
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 170, 30));

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Email");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, 60, 30));
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 170, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/reg3.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 240, 270));

        dob.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 170, 30));
        jPanel3.add(rePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 180, 30));
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 180, 30));

        depart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select One...", "Treasury", "IT", "Procurement", "Debt", "Human Resource", "Tax Policy", " " }));
        jPanel3.add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 330, 170, 30));
        jPanel3.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 180, 30));

        jLabel24.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("City");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 40, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/display.jpg"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 980, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 982, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(id.getText().equals("") && fname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your data first", "Error", JOptionPane.ERROR_MESSAGE);
            id.requestFocus();
        }
        else if(id.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Employee IDNo", "Error", JOptionPane.ERROR_MESSAGE);
            id.requestFocus();
        }
         else if(fname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your First Name", "Error", JOptionPane.ERROR_MESSAGE);
            fname.requestFocus();
        }
         else if(lname.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Last Name", "Error", JOptionPane.ERROR_MESSAGE);
            lname.requestFocus();
        }
         else if(username.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Username", "Error", JOptionPane.ERROR_MESSAGE);
            username.requestFocus();
        }
         else if(pass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Password", "Error", JOptionPane.ERROR_MESSAGE);
            pass.requestFocus();
        }
         else if(rePass.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please Re-enter your Password", "Error", JOptionPane.ERROR_MESSAGE);
            rePass.requestFocus();
        }
         else if(!(radioMale.isSelected() || radioFemale.isSelected())){
            JOptionPane.showMessageDialog(null, "Please confirm your Gender", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
         else if(!(radioUganda.isSelected() || radioForeign.isSelected())){
            JOptionPane.showMessageDialog(null, "Please confirm your Nationality", "Error", JOptionPane.ERROR_MESSAGE);
           
        }
         else if(dob.getDateEditor().equals("")){
            JOptionPane.showMessageDialog(null, "Please confirm your date of birth", "Error", JOptionPane.ERROR_MESSAGE);
            dob.requestFocus();
         }
        else if(job.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Job Title", "Error", JOptionPane.ERROR_MESSAGE);
            job.requestFocus();
         }
        else if(depart.getSelectedItem().equals("Select One...")){
            JOptionPane.showMessageDialog(null, "Please enter your Department", "Error", JOptionPane.ERROR_MESSAGE);
            depart.requestFocus();
         }
        else if(address.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Address", "Error", JOptionPane.ERROR_MESSAGE);
            address.requestFocus();
         }
        else if(city.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your City", "Error", JOptionPane.ERROR_MESSAGE);
            city.requestFocus();
         }
        else if(mobile.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Mobile Number", "Error", JOptionPane.ERROR_MESSAGE);
            mobile.requestFocus();
         }
        else if(email.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter your Email", "Error", JOptionPane.ERROR_MESSAGE);
            email.requestFocus();
         }
        
        else{
            
    try{
       conn = new ConnectDB().getConnection();
       String query = "INSERT INTO Registry VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
       pst = conn.prepareStatement(query);
       pst.setString(1, id.getText());
       pst.setString(2, fname.getText());
       pst.setString(3, lname.getText());
       pst.setString(4, username.getText());
       pst.setString(5, pass.getText());
       pst.setString(6, gender);
       pst.setString(7, status.getSelectedItem().toString());
       pst.setString(8, nationality);
       pst.setString(9, ((JTextField) dob.getDateEditor().getUiComponent()).getText());
       pst.setString(10, job.getText());
       pst.setString(11, depart.getSelectedItem().toString());
       pst.setString(12, address.getText());
       pst.setString(13, city.getText());
       pst.setString(14, mobile.getText());
       pst.setString(15, email.getText());
       
       pst.executeUpdate();
       JOptionPane.showMessageDialog(null, "You Personal data has just been sent" + "\n" + "Thank you for registering with us. ");

            
    }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        
        gender = "M";
        
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        
        gender = "F";
        
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void radioUgandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioUgandaActionPerformed
        
        nationality = "Ugandan";
        
        if(radioUganda.isSelected()){
            city.setText("Kampala");
        }
        
    }//GEN-LAST:event_radioUgandaActionPerformed

    private void radioForeignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioForeignActionPerformed
        
        nationality = "Foreigner";
        
    }//GEN-LAST:event_radioForeignActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        
        char keyChar = evt.getKeyChar();
        if(Character.isLowerCase(keyChar));
        evt.setKeyChar(Character.toUpperCase(keyChar));
        
    }//GEN-LAST:event_idKeyTyped

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
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> depart;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField job;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mobile;
    private javax.swing.JPasswordField pass;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioForeign;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioUganda;
    private javax.swing.JPasswordField rePass;
    private javax.swing.JComboBox<String> status;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
