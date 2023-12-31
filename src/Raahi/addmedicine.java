/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Raahi;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 
import static java.util.logging.Level.SEVERE;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import loginform.LoginFrame;

/**
 *
 * @author Raahi
 */
public class addmedicine extends javax.swing.JFrame {

    /**
     * Creates new form addmedicine
     */
    Object status;
    Object type;
    ResultSet rs;
    
    public addmedicine() {
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

        jLabel2 = new javax.swing.JLabel();
        txtmedicineid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtbrandname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtproductname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbstatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbtype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicinetable = new javax.swing.JTable();
        displayallrecords = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Medicine ID :");

        jLabel3.setText("Brand Name:");

        jLabel4.setText("Product Name:");

        jLabel5.setText("Price:");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Status:");

        cmbstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unavailable", "Available" }));
        cmbstatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbstatusItemStateChanged(evt);
            }
        });
        cmbstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstatusActionPerformed(evt);
            }
        });

        jLabel7.setText("Type:");

        cmbtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antibiotics", "Metformin", "Hydrocodone", "Losartan", "Albuterol" }));
        cmbtype.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbtypeItemStateChanged(evt);
            }
        });

        medicinetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine ID", "Brand Name", "Product Name", "Price($)", "Status", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicinetable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinetableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(medicinetable);

        displayallrecords.setText("Display");
        displayallrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayallrecordsActionPerformed(evt);
            }
        });

        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmedicineid)
                            .addComponent(txtbrandname)
                            .addComponent(txtproductname)
                            .addComponent(cmbtype, 0, 146, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtprice)
                                    .addComponent(cmbstatus, 0, 146, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clear))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(25, 25, 25)))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayallrecords)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmedicineid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbrandname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(clear))
                .addGap(18, 18, 18)
                .addComponent(displayallrecords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
            // TODO add your handling code here:
            String medicineid=txtmedicineid.getText();
            String brandname=txtbrandname.getText();
            String productname=txtproductname.getText();
            String price=txtprice.getText();
            status=cmbstatus.getSelectedItem();
            type=cmbtype.getSelectedItem();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/medicine","root","");
            PreparedStatement ps=con.prepareStatement("insert into medicineinfo(medicineid,brandname,productname,price,status,type)values(?,?,?,?,?,?)");
            ps.setString(1,medicineid);
            ps.setString(2,brandname);
            ps.setString(3,productname);
            ps.setString(4,price);
            ps.setString(5, (String) status);
            ps.setString(6, (String) type);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Insert Successfully");
       }catch (Exception ex){
        Logger.getLogger(addmedicine.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

try {
    // TODO add your handling code here:
    String medicineid = txtmedicineid.getText();
    String brandname = txtbrandname.getText();
    String productname = txtproductname.getText();
    String price = txtprice.getText();
    status = cmbstatus.getSelectedItem();
    type = cmbtype.getSelectedItem();
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medicine", "root", "");
    PreparedStatement ps = con.prepareStatement("UPDATE medicineinfo SET brandname=?, productname=?, price=?, status=?, type=? WHERE medicineid=?");
    ps.setString(1, brandname);
    ps.setString(2, productname);
    ps.setString(3, price);
    ps.setString(4, (String) status);
    ps.setString(5, (String) type);
    ps.setString(6, medicineid);

    ps.executeUpdate();
    JOptionPane.showMessageDialog(this, "Update Successfully");
} catch (Exception ex) {
    Logger.getLogger(addmedicine.class.getName()).log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{
            // TODO add your handling code here:
            String medicineid=txtmedicineid.getText();
            String brandname=txtbrandname.getText();
            String productname=txtproductname.getText();
            String price=txtprice.getText();
            status=cmbstatus.getSelectedItem();
            type=cmbtype.getSelectedItem();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/medicine","root","");
            PreparedStatement ps=con.prepareStatement("delete from medicineinfo where medicineid=?");
            ps.setString(1,medicineid);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Delete Successfully");
       }catch (Exception ex){
        Logger.getLogger(addmedicine.class.getName()).log(Level.SEVERE, null, ex);
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cmbstatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbstatusItemStateChanged
        // TODO add your handling code here:
        status = cmbstatus.getSelectedItem();
    }//GEN-LAST:event_cmbstatusItemStateChanged

    private void cmbstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstatusActionPerformed

    private void cmbtypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbtypeItemStateChanged
        // TODO add your handling code here:
       type = cmbtype.getSelectedItem();
    }//GEN-LAST:event_cmbtypeItemStateChanged

    private void medicinetableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinetableMouseClicked
        // TODO add your handling code here:
      DefaultTableModel model=(DefaultTableModel) medicinetable.getModel();
      int n=medicinetable.getSelectedRow();
      txtmedicineid.setText(model.getValueAt(n, 0).toString());
      txtbrandname.setText(model.getValueAt(n, 1).toString());
      txtproductname.setText(model.getValueAt(n, 2).toString());
      cmbtype.setSelectedItem(model.getValueAt(n, 3).toString());
      txtprice.setText(model.getValueAt(n, 4).toString());
      cmbstatus.setSelectedItem(model.getValueAt(n, 5).toString());
    }//GEN-LAST:event_medicinetableMouseClicked

    private void displayallrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayallrecordsActionPerformed
        // TODO add your handling code here:
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/medicine","root","");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM medicineinfo"); 
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model=(DefaultTableModel) medicinetable.getModel();
        model.setRowCount(0); // clear existing data

        while (rs.next()) { 
            String mydata[] = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)};
            model.addRow(mydata);
        }

    } catch (ClassNotFoundException ex) {
        JOptionPane.showMessageDialog(this, "Error: Class not found - " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_displayallrecordsActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    {
        txtmedicineid.setText(null);
        txtbrandname.setText(null);
        txtprice.setText(null);
        txtproductname.setText(null);
        cmbstatus.setSelectedItem(null);
        cmbtype.setSelectedItem(null);
    }
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
            java.util.logging.Logger.getLogger(addmedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addmedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addmedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addmedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addmedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> cmbstatus;
    private javax.swing.JComboBox<String> cmbtype;
    private javax.swing.JButton displayallrecords;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicinetable;
    private javax.swing.JTextField txtbrandname;
    private javax.swing.JTextField txtmedicineid;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproductname;
    // End of variables declaration//GEN-END:variables


}
