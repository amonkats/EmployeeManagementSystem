/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables.co.ug;

import connect.all.ug.ConnectDB;
import java.sql.*;
import javax.swing.*;
import manage.leave.attendance.finance.Manage_Attendance;
import net.proteanit.sql.DbUtils;
import javax.swing.table.TableModel;
import employee_Register.View_Personal_Registration;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amonkats
 */
public class Reg_Table extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public Reg_Table() {
        initComponents();
        setResizable(false);
        setTitle("Ministry Of Finance Attendance Management System (MOFAMS)");

        
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onWindowOpening(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(769, 380));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_ID", "First_Name", "Last_Name", "Username", "Password", "Gender", "Status", "Nationality", "DOB", "Job_Title", "Department", "Address", "City", "Mobile_No", "Email"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 770, 250));

        jButton2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 120, 30));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 200, 30));

        jLabel3.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee's Registration Details");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 370, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 50, 30));

        btnDelete.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 120, 30));

        jButton1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 130, 30));

        jButton3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton3.setText("Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 130, 30));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 40, 20));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, 50, 20));

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("amonkats94@gmail.com");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 160, 20));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("0774572835 / 0701215120");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 180, 20));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("© Copyright 2017");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 120, 20));

        jButton4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 473, 110, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/display.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1000, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onWindowOpening(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowOpening
        
        try{
            conn = new ConnectDB().getConnection();
            String sql = "SELECT * FROM Registry";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_onWindowOpening

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            conn = new ConnectDB().getConnection();
            pst = conn.prepareStatement("SELECT * FROM Registry");
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        try {
            conn = new ConnectDB().getConnection();
            String sql = "SELECT * FROM Registry WHERE First_Name LIKE '"+jTextField1.getText()+"%'"
                    + "OR Last_Name LIKE '"+jTextField1.getText()+"%'";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped

    }//GEN-LAST:event_jTextField1KeyTyped

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        int row = jTable1.getSelectedRow();

        if(row < 0)
        JOptionPane.showMessageDialog(null, "Select the row to Delete !", "Error",JOptionPane.ERROR_MESSAGE);

        else{

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String selected = model.getValueAt(row, 0).toString();

            int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this row?","Deletion in progress",JOptionPane.YES_NO_OPTION);

            try{
                conn = new ConnectDB().getConnection();
                String query = "DELETE from Registry where Emp_ID=?";
                pst = conn.prepareStatement(query);
                pst.setString(1, selected);

                if(row >= 0 ){
                    if(reply == JOptionPane.YES_OPTION){
                        pst.executeUpdate();                       
                        model.removeRow(row);
                        JOptionPane.showMessageDialog(null, "Row has been deleted Successfully !");
                    }
                    else{                       
                        pst.close();
                        conn.close();
                    }
                }else{
                    pst.close();
                    conn.close();
                }
            }catch(Exception e)  {
                JOptionPane.showMessageDialog(null, e);

            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        updateRank();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int row = jTable1.getSelectedRow();
        
        TableModel model = jTable1.getModel();
        if(row >= 0){
        String empId = model.getValueAt(row, 0).toString();
        String firstName = model.getValueAt(row, 1).toString();
        String lastName = model.getValueAt(row, 2).toString();
        String user = model.getValueAt(row, 3).toString();
        String password = model.getValueAt(row, 4).toString();
        String gender = model.getValueAt(row, 5).toString();
        String status = model.getValueAt(row, 6).toString();
        String nation = model.getValueAt(row, 7).toString();
        
        String jobTitle = model.getValueAt(row, 9).toString();
        String department = model.getValueAt(row, 10).toString();
        String addrss = model.getValueAt(row, 11).toString();
        String cityTxt = model.getValueAt(row, 12).toString();
        String mobileTxt = model.getValueAt(row, 13).toString();
        String emailTxt = model.getValueAt(row, 14).toString();
        
        View_Personal_Registration view = new View_Personal_Registration();
        view.setVisible(true);
        view.pack();
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        view.id.setText(empId);
        view.fname.setText(firstName);
        view.lname.setText(lastName);
        view.username.setText(user);
        view.pass.setText(password);
        view.status.setSelectedItem(status);
        view.dob.setDate((view).dob.getDate());
        view.job.setText(jobTitle);
        view.depart.setSelectedItem(department);
        view.address.setText(addrss);
        view.city.setText(cityTxt);
        view.mobile.setText(mobileTxt);
        view.email.setText(emailTxt);
        if(gender.equals("M"))
            view.radioMale.setSelected(true);
        else if(gender.equals("F"))
            view.radioFemale.setSelected(true);
        if(nation.equals("Ugandan"))
            view.radioUganda.setSelected(true);
        else if(nation.equals("Foreigner"))
            view.radioForeign.setSelected(true);
        try {
            Date jdate = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(row, 8).toString());
            view.dob.setDate(jdate);
        } catch (ParseException ex) {
            Logger.getLogger(Reg_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else
          JOptionPane.showMessageDialog(null, "Select the row to view details", "Error",JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        dispose();
        Manage_Attendance ma = new Manage_Attendance();
        ma.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    public void updateRank(){
        
        Connection conn = null;
        PreparedStatement pst = null;
        int rowSelected = jTable1.getSelectedRow();
        if(rowSelected < 0)
            JOptionPane.showMessageDialog(null, "Select the row to Update !", "Error",JOptionPane.ERROR_MESSAGE);
        
        else{
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        String fname = model.getValueAt(rowSelected, 1).toString();
        String lname = model.getValueAt(rowSelected, 2).toString();
        String user = model.getValueAt(rowSelected, 3).toString();
        String pass = model.getValueAt(rowSelected, 4).toString();
        String gender = model.getValueAt(rowSelected, 5).toString();
        String status = model.getValueAt(rowSelected, 6).toString();
        String nation = model.getValueAt(rowSelected, 7).toString();
        String dob = model.getValueAt(rowSelected, 8).toString();
        String job = model.getValueAt(rowSelected,9).toString();
        String depart = model.getValueAt(rowSelected, 10).toString(); 
        String address = model.getValueAt(rowSelected, 11).toString();
        String city = model.getValueAt(rowSelected, 12).toString();
        String mobile = model.getValueAt(rowSelected, 13).toString();
        String email = model.getValueAt(rowSelected, 14).toString();
        String id = model.getValueAt(rowSelected, 0).toString();
       
        String newId = JOptionPane.showInputDialog(null, "Enter new Emp_ID",id);
        String newFname = JOptionPane.showInputDialog(null, "Enter new First Name",fname);
        String newLname = JOptionPane.showInputDialog(null, "Enter new Last Name",lname);
        String newUser = JOptionPane.showInputDialog(null, "Enter new Username",user);
        String newPass = JOptionPane.showInputDialog(null, "Enter new Password",pass);
        String newGender = JOptionPane.showInputDialog(null, "Enter new Gender",gender);
        String newStatus = JOptionPane.showInputDialog(null, "Enter new Status",status);
        String newNation = JOptionPane.showInputDialog(null, "Enter new Nationality",nation);
        String newDob = JOptionPane.showInputDialog(null, "Enter new Date of Birth ",dob);
        String newJob = JOptionPane.showInputDialog(null, "Enter new Designation",job);
        String newDepart = JOptionPane.showInputDialog(null, "Enter new Department",depart);
        String newAddress = JOptionPane.showInputDialog(null, "Enter new Address",address);
        String newCity = JOptionPane.showInputDialog(null, "Enter new City ",city);
        String newMobile = JOptionPane.showInputDialog(null, "Enter new Mobile",mobile);
        String newEmail = JOptionPane.showInputDialog(null, "Enter new Email",email);
        
        
//        int convertoop = Integer.parseInt(newOop);
//        int convertweb = Integer.parseInt(newWeb);
//        int convertooad = Integer.parseInt(newOoad);
//        int convertis = Integer.parseInt(newIs);
//        int convertrm = Integer.parseInt(newRm);
//        int convertgd = Integer.parseInt(newGd);
//        int convertds = Integer.parseInt(newDs);
//        double convertgpa = Double.parseDouble(newGpa);
//        double convertcgpa = Double.parseDouble(newCgpa);
//        int convertserial = Integer.parseInt(newSerial);
        
        model.setValueAt(newFname, rowSelected, 1);
        model.setValueAt(newLname, rowSelected, 2);
        model.setValueAt(newUser, rowSelected, 3);
        model.setValueAt(newPass, rowSelected, 4);
        model.setValueAt(newGender, rowSelected, 5);
        model.setValueAt(newStatus, rowSelected, 6);
        model.setValueAt(newNation, rowSelected, 7);
        model.setValueAt(newDob, rowSelected, 8);
        model.setValueAt(newJob, rowSelected, 9);
        model.setValueAt(newDepart, rowSelected, 10);
        model.setValueAt(newAddress, rowSelected, 11);
        model.setValueAt(newCity, rowSelected, 12);
        model.setValueAt(newMobile, rowSelected, 13);
        model.setValueAt(newEmail, rowSelected, 14);
        model.setValueAt(newId, rowSelected, 0);
        
           
        try{
            conn = new ConnectDB().getConnection();
            String query = "UPDATE Registry set First_Name=?, Last_Name=?, Username=?, Password=?, "
                    + "Gender=?, Status=?, Nationality=?, DOB=?, Designation=?, Department=?,"
                    + "Address=?, City=?, Mobile_No=?, Email=? where Emp_ID=?";
            pst = conn.prepareStatement(query);
            pst.setString(1, newFname);
            pst.setString(2, newLname);
            pst.setString(3, newUser);
            pst.setString(4, newPass);
            pst.setString(5, newGender);
            pst.setString(6, newStatus);
            pst.setString(7, newNation);
            pst.setString(8, newDob);
            pst.setString(9, newJob);
            pst.setString(10, newDepart);
            pst.setString(11, newAddress);
            pst.setString(12, newCity);
            pst.setString(13, newMobile);
            pst.setString(14, newEmail);
            pst.setString(15, newId);
           
            int count = pst.executeUpdate();
            if(count >= 0)
               JOptionPane.showMessageDialog(null, "Row has been Updated");
             if(rowSelected > 0 && count < 0)
               JOptionPane.showMessageDialog(null, "Row wasn't update");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Reg_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reg_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reg_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reg_Table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reg_Table().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
