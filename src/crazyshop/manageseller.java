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
public class manageseller extends javax.swing.JInternalFrame {

    /**
     * Creates new form manageseller
     */
    public manageseller() {
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
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
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

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setText("Seller");

        jLabel2.setText("Seller id");

        jLabel4.setText("Seller name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel5.setText("Phone no.");

        jLabel6.setText("Address");

        jLabel7.setText("Account no.");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField3KeyTyped(evt);
            }
        });

        jLabel8.setText("Gst no.");

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name ", "Phone", "Address", "account no", "id"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable1.getColumnModel().getColumn(4).setMinWidth(20);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        jLabel3.setText(".......");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            
           Connection myconn=DriverManager.getConnection(myurl1,uname, upass);
           try{
               if(validation()==true){
                      DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                               mymodel.setRowCount(0);
                    String q="update  manageseller set name=?,phone=?,address=?,account=?,gst=? where id =?";
                    PreparedStatement myst=myconn.prepareStatement(q);
                    myst.setString(1,jTextField1.getText());
                    myst.setString(2,jTextField2.getText());
                    myst.setString(3, jTextArea1.getText());
                    myst.setString(4,jTextField3.getText());
                    myst.setString(5,jTextField4.getText());
                     myst.setString(6,jLabel3.getText());
                    int count =myst.executeUpdate();
                    if(count==1){
                        JOptionPane.showMessageDialog(rootPane, "Seller info updated Succesfully");
                        clearfield();
                        fetchsellerid();
                        jButton2.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "seller not added succesfully");
                    }
               }
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
    {
        Connection myconn = DriverManager.getConnection(myurl1, uname, upass);
        try
            {
                DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                String q="select * from manageseller where name like ?";
                PreparedStatement myst = myconn.prepareStatement(q);
                myst.setString(1, jTextField1.getText() + "%");
                ResultSet myres = myst.executeQuery();
                while(mymodel.getRowCount()>0){
                    mymodel.removeRow(mymodel.getRowCount()-1);
                }
                if(myres.next()==true)
                {
                    do
                    {
                        String n,ph,ad,ac,id;
                        n=myres.getString("name");
                        ph=myres.getString("phone");
                        ad=myres.getString("address");
                        ac=myres.getString("account"); 
                        id=myres.getString("id");
                        Object myrow[] = {n,ph,ad,ac,id};

                        mymodel.addRow(myrow);
                    }
                    while(myres.next());

                }
                else
                {
                    JOptionPane.showMessageDialog(rootPane, "No records found");
                    
                    jButton2.setEnabled(false);
               
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
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           Connection myconn=DriverManager.getConnection(myurl1,uname, upass);
           try{
               String q="insert into manageseller(name,phone,address ,account,gst,id) values (?,?,?,?,?,?)";
               if(validation()==true){
                    PreparedStatement myst=myconn.prepareStatement(q);
                    myst.setString(1,jTextField1.getText());
                    myst.setString(2,jTextField2.getText());
                    myst.setString(3, jTextArea1.getText());
                    myst.setString(4,jTextField3.getText());
                    myst.setString(5,jTextField4.getText());
                    myst.setString(6,jLabel3.getText());
                    int count =myst.executeUpdate();
                    if(count==1){
                        JOptionPane.showMessageDialog(rootPane, "Seller info added  Succesfully");
                        clearfield();
                        fetchsellerid();
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "seller not added");
                    }
              }
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
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        fetchsellerid();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String id = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
 

    try
    {
        Connection myconn = DriverManager.getConnection(myurl1, uname, upass);
        try
        {
            String q="select * from manageseller where id=?";
            PreparedStatement myst = myconn.prepareStatement(q);
            myst.setString(1, id);
            ResultSet myres = myst.executeQuery();
            if(myres.next()==true)
            {
                jLabel3.setText(id);
                jTextField1.setText(myres.getString("name"));
                jTextField2.setText(myres.getString("phone"));
                jTextArea1.setText(myres.getString("address"));
                jTextField3.setText(myres.getString("account"));
                jTextField4.setText(myres.getString("gst"));
                jButton2.setEnabled(true);
           }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "id Invalid");
                jButton2.setEnabled(false);
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
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)))
        evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )))
        evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)))
evt.consume();
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)))
evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped
void fetchsellerid(){
    try
    {
            Connection myconn = DriverManager.getConnection(myurl1, uname, upass);
        try
        {
            //String q="select * from manageprod";
            String q="select * from manageseller order by id desc";
            PreparedStatement myst = myconn.prepareStatement(q);

            ResultSet myres = myst.executeQuery();
            //if(myres.last())
            if(myres.next())
            { 
                 int id = myres.getInt("id");
                 id++;
                jLabel3.setText(String.valueOf(id));
            }
            else
            {
                jLabel3.setText("3000");
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
void  clearfield(){
    fetchsellerid();
    jTextField1.setText("");
     jTextField2.setText("");
      jTextField3.setText("");
       jTextField4.setText("");
        jTextArea1.setText("");
     
 }

boolean validation(){
    if( (jTextField1.getText().length()<3 ) || !jTextField1.getText().matches("[a-zA-z ]+" )){
   
        JOptionPane.showMessageDialog(rootPane, "Please enter proper name");
        return false;
    }
   
    else if(jTextField2.getText().length()!=10){
        JOptionPane.showMessageDialog(rootPane, "Please enter proper number");
        return false;
    }
    else if((jTextArea1.getText().length()<8 )){
        JOptionPane.showMessageDialog(rootPane, "Please enter proper Address");
        return false;
    }
   else if( (jTextField3.getText().length()<10 )|| (jTextField3.getText().length()>18 ) ){
        JOptionPane.showMessageDialog(rootPane, "Please enter proper Account no. ");
        return false;
    }
    else if( (jTextField4.getText().length()!=15 )   ){
        JOptionPane.showMessageDialog(rootPane, "Please enter proper Gst no.");
        return false;
    }
    else
        return true;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
