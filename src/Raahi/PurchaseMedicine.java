/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Raahi;
import java.awt.Color;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USER;
 */
public class PurchaseMedicine extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseMedicine
     */
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    Statement stmt;
    public PurchaseMedicine() {
        initComponents();
        myconnection();
        getsum();
         this.getContentPane().setBackground(Color.decode("#E27C64"));
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addtocartbttn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        totalbox = new javax.swing.JTextField();
        paybttn = new javax.swing.JButton();
        txtmedicineid = new javax.swing.JTextField();
        txtproductname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Medinfo = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Print = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("MedicineID");

        jLabel4.setText("ProductName");

        jLabel5.setText("Quantity");

        addtocartbttn.setText("Add to Cart");
        addtocartbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartbttnActionPerformed(evt);
            }
        });

        jLabel6.setText("Total");

        totalbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalboxActionPerformed(evt);
            }
        });

        paybttn.setText("Pay");
        paybttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybttnActionPerformed(evt);
            }
        });

        txtmedicineid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmedicineidActionPerformed(evt);
            }
        });

        jLabel9.setText("Price");

        jButton1.setText("Display All");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Medinfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine ID", "Name", "Price", "Quantity", "Totals"
            }
        ));
        Medinfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MedinfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Medinfo);

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Print.setText("Print");
        Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Print, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(addtocartbttn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(totalbox, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Back, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtmedicineid)
                                    .addComponent(txtproductname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtquantity)
                                    .addComponent(txtprice, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(paybttn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(99, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(Print))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txtmedicineid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txtproductname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGap(36, 36, 36)
                            .addComponent(addtocartbttn)
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(totalbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(paybttn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Back))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addtocartbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartbttnActionPerformed
insertrecord();        // TODO add your handling code here:
    }//GEN-LAST:event_addtocartbttnActionPerformed

    private void paybttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybttnActionPerformed
    new PaymentReceived().setVisible(true);
    dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_paybttnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
displayall();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void totalboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalboxActionPerformed
       getsum(); // TODO add your handling code here:
    }//GEN-LAST:event_totalboxActionPerformed

    private void txtmedicineidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedicineidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedicineidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      delete();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void MedinfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MedinfoMouseClicked
      DefaultTableModel model=(DefaultTableModel) Medinfo.getModel();
      int n=Medinfo.getSelectedRow();
      txtmedicineid.setText(model.getValueAt(n, 0).toString());
      txtproductname.setText(model.getValueAt(n, 1).toString());
      txtquantity.setText(model.getValueAt(n, 2).toString());
      txtprice.setText(model.getValueAt(n, 3).toString());
      totalbox.setText(model.getValueAt(n, 4).toString());
              // TODO add your handling code here:
    }//GEN-LAST:event_MedinfoMouseClicked

    private void PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintActionPerformed
        // TODO add your handling code here:
                                            
    // Create a PrinterJob
    PrinterJob printerJob = PrinterJob.getPrinterJob();

    // Set the Printable object to be printed
    PurchaseMedicinePrintable printable = new PurchaseMedicinePrintable(this);
    printerJob.setPrintable((Printable) printable);

    // Show the Print Dialog
    if (printerJob.printDialog()) {
        try {
            printerJob.print();
        } catch (PrinterException ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_PrintActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        new AddndPurchase().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseMedicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseMedicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable Medinfo;
    private javax.swing.JButton Print;
    private javax.swing.JButton addtocartbttn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton paybttn;
    private javax.swing.JTextField totalbox;
    private javax.swing.JTextField txtmedicineid;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproductname;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables
private void myconnection() {
        
        try{
            cn=DriverManager.getConnection("jdbc:mysql://localhost/medicine", "root" , null);
            
            pst=cn.prepareStatement("SELECT * FROM `medicinepurchase`");
            rs=pst.executeQuery();
            
            stmt=cn.prepareStatement("UPDATE medicinepurchase SET Totals = Price * Quantity;");
            
            JOptionPane.showMessageDialog(null,"Successfully Connected");
            
            
            
        }
       catch(Exception e)
       {
           
           System.out.print(e);
       }
   }

private void insertrecord() {
    try {
        pst = cn.prepareStatement("INSERT INTO medicinepurchase VALUES (?, ?, ?, ?, ?)");
        pst.setString(1, txtmedicineid.getText());
        pst.setString(2, txtproductname.getText());
        pst.setString(3, txtquantity.getText());
        pst.setString(4, txtprice.getText());

        // Compute the value of the "Totals" column for the new record
        double price = Double.parseDouble(txtprice.getText());
        int quantity = Integer.parseInt(txtquantity.getText());
        double totals = price * quantity;
        pst.setDouble(5, totals);

        pst.executeUpdate();
        clearrecord();
        JOptionPane.showMessageDialog(null, "Record Successfully added");

        // Update the total sum
        getsum();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    private void clearrecord() {
       txtmedicineid.setText(null);
       txtprice.setText(null);
       txtproductname.setText(null);
       txtquantity.setText(null);
       
    }

private void displayall() {
    try {
        DefaultTableModel model = (DefaultTableModel) Medinfo.getModel();
        if (model.getRowCount() > 0) {
            model.setRowCount(0);
        } else {
            // Execute the SELECT query to get the latest data
            pst = cn.prepareStatement("SELECT * FROM medicinepurchase");
            rs = pst.executeQuery();
            while (rs.next()) {
                String mydata[] = { rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5) };
                model.addRow(mydata);
            }
        }
        getsum();
    } catch (Exception e) {
        System.out.print(e);
    }
}
    
    private void getsum()
    {
        double sum=0;
        double i;
        
        for(i=0; i<Medinfo.getRowCount();i++)
        {
            sum=(double)(sum+Double.parseDouble(Medinfo.getValueAt((int)i,4).toString()));
        }
        
        totalbox.setText(Double.toString((double)sum));
    }

    private void delete() {
         try{
            // TODO add your handling code here:
            String medicineid=txtmedicineid.getText();
            String productname=txtproductname.getText();
            String Quantity=txtquantity.getText();
            String price=txtprice.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/medicine","root","");
            PreparedStatement ps=con.prepareStatement("DELETE FROM medicinepurchase WHERE `medicinepurchase`.`Medicine ID` =?");
            ps.setString(1,medicineid);
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Delete Successfully");
       }catch (Exception ex){
        Logger.getLogger(PurchaseMedicine.class.getName()).log(Level.SEVERE, null, ex);
}
    }

    
}
    

    
  
    

