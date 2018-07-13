/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manage.leave.attendance.finance;

import java.sql.*;
import connect.all.ug.ConnectDB;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;
import attendance.give.ug.ViewInfoForm;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.*;
import login.finance.go.ug.Admin_Login;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import tables.co.ug.Reg_Table;



public class Manage_Attendance extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs =  null;
    String id;
    DefaultTableModel dtm;
    
    public Manage_Attendance() {
        initComponents();
        setResizable(false);
        setLocation(5, 0);
        setTitle("Ministry Of Finance Attendance Management System (MOFAMS)");
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExport = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                onWindowOpening(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage Attendance");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 240, 30));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("(Please only change the Status)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 200, 20));

        jButton1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 120, 30));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee_ID", "Full_Names", "Designation", "Department", "Attendance_ID", "Attendance", "Date_Reported", "Time_reported", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 750, 270));

        jButton2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton2.setText("Approve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 120, 30));

        jButton3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton3.setText("Reject");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 120, 30));

        btnClear.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnClear.setText("Clear table");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 220, 130, 30));

        btnExport.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        btnExport.setText("Export to Excel");
        btnExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportActionPerformed(evt);
            }
        });
        jPanel1.add(btnExport, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 130, 30));

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
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 180, 30));

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Search: (IDNo)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 90, 30));

        jButton4.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton4.setText("Details");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 130, 30));

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 40, 20));

        jLabel9.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 50, 20));

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("amonkats94@gmail.com");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 160, 20));

        jLabel8.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("0774572835 / 0701215120");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 530, 180, -1));

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("© Copyright 2017");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 120, -1));

        jButton5.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jButton5.setText("Go to Registry");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, 130, 30));

        jButton6.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 100, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Piscs/display.jpg"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1000, 610));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        try {
            conn = new ConnectDB().getConnection();
            pst = conn.prepareStatement("SELECT * FROM attendance");
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
 

    }//GEN-LAST:event_jButton1ActionPerformed

    private void onWindowOpening(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_onWindowOpening
        
        try {
            conn = new ConnectDB().getConnection();
            pst = conn.prepareStatement("SELECT * FROM attendance");
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_onWindowOpening

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        String approve = "Approved";
        int singleRow = jTable1.getSelectedRow();
        if(singleRow < 0){
            JOptionPane.showMessageDialog(null, "Select atleast a row to approve");
        }else{
            
        int[] rowsSelected = jTable1.getSelectedRows();
        TableModel model = jTable1.getModel();
        Object [] row = new Object[6];
        for(int i = 0; i < rowsSelected.length; i++){
           row[0] = model.getValueAt(rowsSelected[i], 0);
           row[1] = model.getValueAt(rowsSelected[i], 1);
           row[2] = model.getValueAt(rowsSelected[i], 2);
           row[3] = model.getValueAt(rowsSelected[i], 3);
           row[4] = model.getValueAt(rowsSelected[i], 4);
           row[5] = model.getValueAt(rowsSelected[i], 5);
    
  
           String empId = model.getValueAt(rowsSelected[i], 0).toString();
           model.setValueAt(approve, rowsSelected[i], 5);
           //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            String selected = model.getValueAt(singleRow, 0).toString();
        
          try {
            
            conn = new ConnectDB().getConnection();
            pst = conn.prepareStatement("UPDATE Attendance SET Status = '"+approve+"' WHERE Serial_No = '"+selected+"'");

            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Attendance Approved !");
 
            pst = conn.prepareStatement("SELECT * FROM attendance");
            rs = pst.executeQuery(); 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        }  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        String reject = "Rejected";
        int singleRow = jTable1.getSelectedRow();
        if(singleRow < 0){
            JOptionPane.showMessageDialog(null, "Select atleast a row to reject");
        }else{
            
        int[] rowsSelected = jTable1.getSelectedRows();
        TableModel model = jTable1.getModel();
        Object [] row = new Object[6];
        for(int i = 0; i < rowsSelected.length; i++){
           row[0] = model.getValueAt(rowsSelected[i], 0);
           row[1] = model.getValueAt(rowsSelected[i], 1);
           row[2] = model.getValueAt(rowsSelected[i], 2);
           row[3] = model.getValueAt(rowsSelected[i], 3);
           row[4] = model.getValueAt(rowsSelected[i], 4);
           row[5] = model.getValueAt(rowsSelected[i], 5);

  
           String empId = model.getValueAt(rowsSelected[i], 0).toString();
           model.setValueAt(reject, rowsSelected[i], 5);
           String selected = model.getValueAt(singleRow, 0).toString();
          try {
             
            conn = new ConnectDB().getConnection();
            pst = conn.prepareStatement("UPDATE Attendance SET Status = '"+reject+"' WHERE Serial_No = '"+selected+"'");

            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Attendance Rejected !");

            pst = conn.prepareStatement("SELECT * FROM attendance");
                    
            rs = pst.executeQuery(); 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        }
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportActionPerformed
        
        writeToExcel();
        
    }//GEN-LAST:event_btnExportActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete data from the table?", "Deletion in Progress", JOptionPane.YES_NO_OPTION);
        try {
            conn = new ConnectDB().getConnection();
            pst = conn.prepareStatement("TRUNCATE Attendance");
            if(reply == JOptionPane.YES_OPTION){
            pst.executeUpdate(); 
            
            pst = conn.prepareStatement("SELECT * FROM Attendance");
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            JOptionPane.showMessageDialog(null, "Data has been deleted");
            
            }else{
               JOptionPane.showMessageDialog(null, "Deletion has been cancelled"); 
               pst.close();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
        try {
            conn = new ConnectDB().getConnection();
            String sql = "SELECT * FROM Attendance WHERE Status LIKE '"+jTextField1.getText()+"%'"
                    + "OR Employee_ID LIKE '"+jTextField1.getText()+"%'";
            pst = conn.prepareStatement(sql);
     
            rs = pst.executeQuery();
            
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        
         
        
        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        
        
       
        
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int row = jTable1.getSelectedRow();
         ViewInfoForm view = new ViewInfoForm();
        TableModel model = jTable1.getModel();
       if(row >= 0){
        String empId = model.getValueAt(row, 4).toString();
        String attId = model.getValueAt(row, 5).toString();
        String fname = model.getValueAt(row, 1).toString();
        //String lname = model.getValueAt(row, 3).toString();
        String jobTitle = model.getValueAt(row, 2).toString();
        String radio1 = model.getValueAt(row, 6).toString();
        String depart = model.getValueAt(row, 3).toString();
        String reportDate = model.getValueAt(row, 7).toString();
        String timeReport = model.getValueAt(row, 8).toString();
        String status = model.getValueAt(row, 9).toString();
           
        view.setVisible(true);
        view.pack();
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        view.fname.setText(fname);
       // view.lname.setText(lname);
        view.job.setText(jobTitle);
        view.depart.setSelectedItem(depart);
        view.id.setText(empId);
        view.att_Id.setText(attId);
        view.Reject.setSelectedItem(status);
        view.dateReport.setText(reportDate);
        view.timeReport.setText(timeReport);
        
        
        if(radio1.equals("Present"))
          view.confirmP.setSelected(true);
       else if(radio1.equals("Absent"))
          view.confirmA.setSelected(true);
      }
      else
          JOptionPane.showMessageDialog(null, "Select the row to view details", "Error",JOptionPane.ERROR_MESSAGE);
     
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        
        
                
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        Reg_Table reg = new Reg_Table();
        dispose();
        reg.setVisible(true);
//        reg.pack();
//        reg.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        dispose();
        Admin_Login log = new Admin_Login();
        log.setVisible(true);
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Manage_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manage_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manage_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manage_Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manage_Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

public void saveToExcelFile(){
    
    JFileChooser fc = new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Workbook", "xslx");
        fc.addChoosableFileFilter(filter);
        
        int result = fc.showSaveDialog(null);
        if(result == JFileChooser.SAVE_DIALOG){
            File fileSelected = fc.getSelectedFile();
            String path = fileSelected.getAbsolutePath();
            //str = path;
//            photo.setIcon(resizeImage(path));
        }
        else if (result == JFileChooser.CANCEL_OPTION)
            JOptionPane.showMessageDialog(null, "File not Selected !","Error",JOptionPane.ERROR_MESSAGE);
}

public String getCellValue(int x, int y){
        return dtm.getValueAt(x, y).toString();
    }

public void writeToExcel(){
    XSSFSheet ws;
    XSSFWorkbook wb = new XSSFWorkbook();
    ws = wb.createSheet();
    
    //Load data
    TreeMap<String, Object[]> data = new TreeMap<>();
    
    dtm = (DefaultTableModel)jTable1.getModel();
    
    //Add column labels
    data.put("-1", new Object[] {dtm.getColumnName(0), dtm.getColumnName(1), dtm.getColumnName(2),
    dtm.getColumnName(3), dtm.getColumnName(4), dtm.getColumnName(5), dtm.getColumnName(6),
    dtm.getColumnName(7), dtm.getColumnName(8), dtm.getColumnName(9)});
    
    //Add rows and cells
    for(int i = 0; i < dtm.getRowCount(); i++){
        data.put(Integer.toString(i), new Object[] {getCellValue(i, 0), getCellValue(i, 1), getCellValue(i, 2),
        getCellValue(i, 3), getCellValue(i, 4), getCellValue(i, 5), getCellValue(i, 6),
        getCellValue(i, 7), getCellValue(i, 8), getCellValue(i, 9)});
    }
    //Auto fit
    for(int i = 0; i < 10; i++){
        ws.autoSizeColumn(i);
    }
    //write to excel file
    Set<String> ids = data.keySet();
    XSSFRow row;
    int rowId = 0;
    for(String key : ids){
        row = ws.createRow(rowId++);
        //Get data per key
        Object[] values = data.get(key);
        int cellId = 0;
     for(Object obj : values){
         Cell cell = row.createCell(cellId++);
         cell.setCellValue(obj.toString());
     }
    }
      try {
        FileOutputStream fos = new FileOutputStream(new File("E:\\Excel\\Exported_One.xlsx"));
          wb.write(fos);
          fos.close();
          //saveToExcelFile();
          JOptionPane.showMessageDialog(null, "Data has been exported !");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
}

}
