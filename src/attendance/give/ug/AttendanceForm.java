
package attendance.give.ug;

import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import static java.lang.Thread.sleep;
import java.sql.*;
import connect.all.ug.ConnectDB;
import javax.swing.*;
import login.finance.go.ug.Main_Login;


import manage.leave.attendance.finance.Manage_Attendance;

import static java.lang.Thread.sleep;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import static java.lang.Thread.sleep;
import static java.lang.Thread.sleep;
import static manage.leave.attendance.finance.Manage_Attendance.jTable1;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author amonkats
 */
public class AttendanceForm extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    private String status;
    ButtonGroup group;
    SimpleDateFormat tTime;
    Calendar timer;
    String timing;
    private String presence;
    
    
    public AttendanceForm() {
        initComponents();
        setResizable(false);
        currentDateTime();
        setTitle("Ministry Of Finance Attendance Management System (MOFAMS)");
        
        group = new ButtonGroup();
        group.add(present);
        group.add(absent);
        
        currentId();
        
//        java.util.Date d = new java.util.Date();
//        SimpleDateFormat sdf  = new SimpleDateFormat("mmss");
//        attId.setText(sdf.format(d));
       
    }

    public void currentDateTime(){
       Thread thread = new Thread(){
           
           public void run(){
        
        try{
            
        for(;;){
           timer = Calendar.getInstance();
           timer.getTime();
           tTime = new SimpleDateFormat("HH  :  mm  :  ss  a");
           jlbTime.setText(tTime.format(timer.getTime()));
           SimpleDateFormat tDate = new SimpleDateFormat("EEEE, dd / MM / yyyy");
           jlbDate.setText(tDate.format(timer.getTime()));
        
            sleep(1000);
        }
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
           
       };
               thread.start();
        
    }
    
     public void currentId(){
       Thread thread = new Thread(){
           
           public void run(){
        
        try{
            
        for(;;){
           Calendar timer = Calendar.getInstance();
           timer.getTime();
           SimpleDateFormat tTime = new SimpleDateFormat("mmss");
           attId.setText(tTime.format(timer.getTime()));
          
            sleep(1000);
        }
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }
           
       };
               thread.start();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        timelbl = new javax.swing.JLabel();
        jlbTime = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        attId = new javax.swing.JTextField();
        jComboDepart = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        present = new javax.swing.JRadioButton();
        absent = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        title = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jlbDate = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(720, 361));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Give Your Attendance here ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 310, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/attend3.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 310, 200));

        timelbl.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        timelbl.setForeground(new java.awt.Color(255, 255, 255));
        timelbl.setText("Time:");
        jPanel1.add(timelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 70, 20));

        jlbTime.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jlbTime.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jlbTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 180, 30));

        date.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date:");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 70, 20));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("(Only enter Employee ID and Attendance)*");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 270, 20));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 50, 20));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("amonkats94@gmail.com");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 160, 20));

        jLabel10.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("0774572835 / 0701215120");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 550, 180, 20));

        jLabel11.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("© Copyright 2017");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 570, 120, 20));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/flat4.jpg"))); // NOI18N
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 500, 130));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/arms.jpg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 220, 160));

        jLabel15.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Email:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 40, 20));

        jLabel19.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Attendance ID*");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 90, 30));

        attId.setEditable(false);
        attId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(attId, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 150, 30));

        jComboDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose One...", "F&A" }));
        jPanel1.add(jComboDepart, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 150, 40));

        jLabel23.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Attendance*");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 70, 20));

        present.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        present.setForeground(new java.awt.Color(255, 255, 255));
        present.setText("Present");
        present.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentActionPerformed(evt);
            }
        });
        jPanel1.add(present, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 80, -1));

        absent.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        absent.setForeground(new java.awt.Color(255, 255, 255));
        absent.setText("Absent");
        absent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentActionPerformed(evt);
            }
        });
        jPanel1.add(absent, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, -1));

        jButton3.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 100, 30));

        jButton4.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton4.setText("Check In");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 130, 30));
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 150, 30));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 150, 30));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 150, 30));

        jLabel4.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Employee IDNo*");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 90, 30));

        jLabel5.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Names*");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 50, 30));

        jLabel38.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Designation*");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 70, 30));

        jLabel39.setFont(new java.awt.Font("Cambria", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Department*");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 70, 30));

        jlbDate.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        jlbDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jlbDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 230, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/display.jpg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 1000, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1003, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        try{
        conn = new ConnectDB().getConnection();
        String query = "INSERT INTO attendance(Employee_ID,Attendance_ID,Department,Names,Designation,Attendance,Date_Reported,Time_Reported) VALUES(?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(query);
        pst.setString(1, id.getText());
        pst.setString(2, attId.getText());
        pst.setString(3, jComboDepart.getSelectedItem().toString());
        pst.setString(4, name.getText());
        pst.setString(5, title.getText());
        pst.setString(6, presence);
        pst.setString(7, jlbDate.getText());
        pst.setString(8, jlbTime.getText());
       
        pst.execute();
        
        WelcomeForm wel = new WelcomeForm();
        wel.setVisible(true);
        WelcomeForm.labelTime.setText(jlbTime.getText());
        WelcomeForm.idAtt.setText(attId.getText());
        
    }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void absentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentActionPerformed
        presence = "Absent";
    }//GEN-LAST:event_absentActionPerformed

    private void presentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentActionPerformed
        presence = "Present";
    }//GEN-LAST:event_presentActionPerformed

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
            java.util.logging.Logger.getLogger(AttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton absent;
    public static javax.swing.JTextField attId;
    private javax.swing.JLabel date;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboDepart;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel jlbDate;
    public static javax.swing.JLabel jlbTime;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton present;
    private javax.swing.JLabel timelbl;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
