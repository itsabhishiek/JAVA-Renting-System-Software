/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazyshop;

import static crazyshop.constants.myurl1;
import static crazyshop.constants.uname;
import static crazyshop.constants.upass;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhis
 */

public class addproduct extends javax.swing.JInternalFrame {

    /**
     * Creates new form addproduct
     */
    void clearfield(){
        jTextField1.setText(null);
                jTextField2.setText(null);

    }
    void fetchcatid(){
  try
    {
            Connection myconn = DriverManager.getConnection(myurl1, uname, upass);
        try
        {
            String q="select * from addproduct order by catid desc";
            PreparedStatement myst = myconn.prepareStatement(q);

            ResultSet myres = myst.executeQuery();
            //if(myres.last())
            if(myres.next())
            { 
                 int id = myres.getInt("catid");
                 id++;
                jLabel3.setText(String.valueOf(id));
            }
            else
            {
                jLabel3.setText("1000");
            }
         }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }
        finally
        {
            myconn.close();
        }
     }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
    }
}
   
    public addproduct() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel1.setText("Add Product Category");

        jLabel2.setText("Category Name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Category ID", "Name", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText(".......");

        jLabel4.setText("Current Stock");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(178, 178, 178)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
   
        try{
           Connection myconn=DriverManager.getConnection(myurl1,uname, upass);
           try{
               if(jTextField1.getText().length()>0){
                    String q="insert into addproduct (catname,stock) values (?,?)";
                    PreparedStatement myst=myconn.prepareStatement(q);
                    myst.setString(1,jTextField1.getText());
                    myst.setString(2,jTextField2.getText());
                    int count =myst.executeUpdate();
                    if(count==1){
                        JOptionPane.showMessageDialog(rootPane, "Product added  Succesfully");
                        clearfield();
                        fetchcatid();
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "Product not added");
                    }}
              
           }
           catch(Exception e){
               JOptionPane.showMessageDialog(rootPane,"error "+e.getMessage());
           }
           finally{
                myconn.close();
           }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(rootPane, "Error in connection "+e.getMessage());
           
       }
                       try
    {
        Connection myconn = DriverManager.getConnection(myurl1, uname, upass);
        try
            {
                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                String q="select * from addproduct ";
                PreparedStatement myst1 = myconn.prepareStatement(q);
              
                ResultSet myres1 = myst1.executeQuery();
                mymodel.setRowCount(0);
   
                if(myres1.next()==true)
                {
                    do
                    {
                        String id,name,st;
                        id=myres1.getString("catid");
                        name=myres1.getString("catname");
                        st="";
                        Object myrow[] = {id,name,st};
                        mymodel.addRow(myrow);
                    }
                    while(myres1.next());

                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "No records found");
                    mymodel.setRowCount(0);
                }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }
        finally
        {
             myconn.close();
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        fetchcatid();
             try
    {
        Connection myconn = DriverManager.getConnection(myurl1, uname, upass);
        try
            {
                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                String q="select * from addproduct ";
                PreparedStatement myst = myconn.prepareStatement(q);
              
                ResultSet myres = myst.executeQuery();
                mymodel.setRowCount(0);
   
                if(myres.next()==true)
                {
                    do
                    {
                        String id,name,st;
                        id=myres.getString("catid");
                        name=myres.getString("catname");
                        st=myres.getString("stock");
                        Object myrow[] = {id,name,st};
                        mymodel.addRow(myrow);
                    }
                    while(myres.next());

                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "No records found");
                    mymodel.setRowCount(0);
                }

        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error " + e.getMessage());
        }
        finally
        {
             myconn.close();
        }
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(rootPane, "Error in connection " + e.getMessage());
    }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // TODO add your handling code here:
//              char c=evt.getKeyChar();
//        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )))
//        evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
              char c=evt.getKeyChar();
if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)|| c==KeyEvent.VK_MINUS))
evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
