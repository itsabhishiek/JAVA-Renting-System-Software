/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazyshop;
import java.awt.Image;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import static crazyshop.constants.myurl1;
import static crazyshop.constants.uname;
import static crazyshop.constants.upass;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhis
 */
public class manageemployee extends javax.swing.JInternalFrame {
File myfile;
String oldfilename;
void fetchempid(){
    try
    {
            Connection myconn = DriverManager.getConnection(myurl1, uname, upass);
        try
        {
            //String q="select * from manageprod";
            String q="select * from manageemployee order by empid desc";
            PreparedStatement myst = myconn.prepareStatement(q);

            ResultSet myres = myst.executeQuery();
            //if(myres.last())
            if(myres.next())
            { 
                 int id = myres.getInt("empid");
                 id++;
                jLabel14.setText(String.valueOf(id));
            }
            else
            {
                jLabel14.setText("1");
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
   fetchempid();
    jTextField1.setText("");
     jTextField2.setText("");
      jTextField3.setText("");
       jTextField4.setText("");
        jTextField6.setText("");
        try{
        String myfile="default.png";
        
  Image simg = ImageIO.read( new File("image//" + myfile)).getScaledInstance( jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT);
                        jLabel13.setIcon(new ImageIcon(simg));    }
        catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());

        }
                        jPasswordField1.setText("");
        Date obj =new Date();
        obj.setYear(0000);
        obj.setDate(0);
        obj.setMonth(00);
        jDateChooser1.setDate(obj);
      jComboBox1.setSelectedIndex(0);
      buttonGroup1.clearSelection();
        jTextArea1.setText("");
     
 }

boolean validation(){
//    Date d1=new Date();
//    Date d3=new Date();
//    Date d2=new Date();
//    d1=   jDateChooser1.getDate();
//    d2= jDateChooser2.getDate();
    if( (jTextField1.getText().length()<3 )  ){
   
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
    else if( (jRadioButton1.isSelected()==false)&&(jRadioButton2.isSelected( )==false  )){
        JOptionPane.showMessageDialog(rootPane, "Please Select gender");
        return false;
    }
//    else if(d1.getYear()>d2.getYear()-16){
//        JOptionPane.showMessageDialog(rootPane, "only 16+ employee allowed");
//        return false;
//    }
//     else if(d1.getYear()>d2.getYear()-90){
//        JOptionPane.showMessageDialog(rootPane, "Enter correct date of birth");
//        return false;
//    }
    else if( jComboBox1.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(rootPane, "Please choose position of employee");
        return false;
    }
       else if( (jTextField3.getText().length()!=12 ) ){
        JOptionPane.showMessageDialog(rootPane, "Please enter proper Adhaar no. ");
        return false;
    }
    else if( (jTextField4.getText().length()==0 )   ){
        JOptionPane.showMessageDialog(rootPane, "Please input Salary");
        return false;
    }
//  else if((d2.getYear()>d3.getYear()) || (d2.getYear())<d3.getYear()+5) {
//    JOptionPane.showMessageDialog(rootPane, "Enter correct Date of Joining");
//    return false;
//}
    else
        return true;
}
    public manageemployee() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

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

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setText("Employee Details");

        jLabel4.setText("Name");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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

        jLabel5.setText("Phone no.");

        jLabel6.setText("Address");

        jLabel7.setText("Adhaar  no.");

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

        jLabel8.setText("Gender");

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
                "id", "name ", "Phone", "Salary"
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
            jTable1.getColumnModel().getColumn(0).setMinWidth(20);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel9.setText("Date of birth");

        jLabel10.setText("Salary");

        jLabel2.setText("Username");

        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField4KeyTyped(evt);
            }
        });

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyTyped(evt);
            }
        });

        jLabel3.setText("Password");

        jLabel11.setText("Date of Joining");

        jLabel12.setText("Position");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Employee", "Manager", "Admin" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setText("Choose photo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel14.setText("jLabel14");

        jButton5.setText("Delete Pic");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1)
                        .addContainerGap(534, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(111, 111, 111)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(88, 88, 88)
                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(jButton1)
                                                                    .addGap(18, 18, 18)
                                                                    .addComponent(jButton2))
                                                                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                                                .addComponent(jPasswordField1)
                                                                .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                                .addGap(2, 2, 2)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addComponent(jLabel12))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String filename;
            if(myfile!=null)
            {
                filename = new java.util.Date().getTime() + myfile.getName();//Date.getTime() added for unique file name.
                int i;
                FileInputStream rd = null;
                FileOutputStream outs = null;
                try {
                    rd = new FileInputStream(myfile);
                    outs = new FileOutputStream("image\\"+filename);//writing the new file in 'Images' folder, in the project
                    byte[] b = new byte[2048];
                    while ((i = rd.read(b)) !=-1) {
                         outs.write(b, 0, i); //copying from pictures to empimages byte by byte
                     }
                } 
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
                } 
                finally {
                    try {
                        rd.close();
                        outs.close();
                    } 
                    catch (Exception e) {
                          JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
                    }
                }
                File oldimage=new File("image\\" + oldfilename);
                if(!oldimage.getName().equals("default.png"))
                    oldimage.delete();
            }
            else 
                     filename=oldfilename;
        try{
           Connection myconn=DriverManager.getConnection(myurl1,uname, upass);
           try{
               if(validation()==true){
                    DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
                    mymodel.setRowCount(0);
                    String q="update  manageemployee set name=?,phone=?,address=?,gender=?,dob=?,adhaar=?,position=?,salary=?,password=?,joining=? ,image=? where username=? ";
                    PreparedStatement myst=myconn.prepareStatement(q);
                    myst.setString(1,jTextField1.getText());
                    myst.setString(2,jTextField2.getText());
                    myst.setString(3,jTextArea1.getText());
                    if(jRadioButton1.isSelected()==true)
                        myst.setString(4,"Male");
                    else
                        myst.setString(4,"Female");
                    Date dob = jDateChooser1.getDate();
                    SimpleDateFormat obj1 = new SimpleDateFormat("yyyy-MM-dd");
                    String db = obj1.format(dob);
                    myst.setString(5, db);
                    myst.setString(6,jTextField3.getText());
                    myst.setString(7,jComboBox1.getSelectedItem().toString());
                    myst.setString(8,jTextField4.getText());
                    myst.setString(9,jPasswordField1.getText());
                    Date doj = jDateChooser2.getDate();
                    SimpleDateFormat obj2 = new SimpleDateFormat("yyyy-MM-dd");
                    String dj = obj2.format(doj);
                    myst.setString(10, dj);
                    myst.setString(12,jTextField6.getText());
                    myst.setString(11, filename);
                    int count =myst.executeUpdate();
                    if(count==1){
                        JOptionPane.showMessageDialog(rootPane, "employee info updated Succesfully");
                        clearfield();

                        jButton2.setEnabled(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "employee info not updated");
                        jButton2.setEnabled(false);
                        
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
                String q="select * from manageemployee where name like ?";
                PreparedStatement myst = myconn.prepareStatement(q);
                myst.setString(1, jTextField1.getText() + "%");
                ResultSet myres = myst.executeQuery();
                mymodel.setRowCount(0);
   
                if(myres.next()==true)
                {
                    do
                    {
                        String n,ph,sa,id;
                        n=myres.getString("name");
                        ph=myres.getString("phone");
                        sa=myres.getString("salary");
                        id=myres.getString("empid"); 
                        Object myrow[] = {id,n,ph,sa};
                        mymodel.addRow(myrow);
                        String myfile=myres.getString("image");
                        oldfilename=myfile;
                        Image simg = ImageIO.read( new File("image//" + myfile)).getScaledInstance( jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT);
                        jLabel13.setIcon(new ImageIcon(simg));
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
        String filename="";
                if(myfile!=null)
                {
                        filename = new java.util.Date().getTime() + myfile.getName();//Date.getTime() in illiseconds from 1jan 1972 added for unique file name.
                        int i;
                        FileInputStream rd = null;
                        FileOutputStream outs = null;
                        try {
                            rd = new FileInputStream(myfile);
                            outs = new FileOutputStream("image\\"+filename);//writing the new file in 'Images' folder, in the project
                            byte[] b = new byte[2048];
                            while ((i = rd.read(b)) !=-1) {
                                 outs.write(b, 0, i); //copying from pictures to image byte by byte
                             }
                        } 
                        catch (Exception e) 
                        {
                                 JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
                        } 
                        finally {
                            try {
                                rd.close();
                                outs.close();
                            } 
                            catch (Exception e) {
                                JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
                            }
                        }
               }     
            else
                 filename="default.png";
        
        try{
           
           Connection myconn=DriverManager.getConnection(myurl1,uname, upass);
           try{
               String q="insert into manageemployee values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
               if(validation()==true){
                    PreparedStatement myst=myconn.prepareStatement(q);
                    myst.setString(1,jTextField1.getText());
                    myst.setString(2,jTextField2.getText());
                    myst.setString(3, jTextArea1.getText());
                    if(jRadioButton1.isSelected())
                        myst.setString(4, "Male");
                    else
                        myst.setString(4,"Female");
                    Date dob = jDateChooser1.getDate();
                    SimpleDateFormat obj = new SimpleDateFormat("yyyy-MM-dd");
                    String db = obj.format(dob);
                    myst.setString(5, db);
                    myst.setString(6, jTextField3.getText());
                    myst.setString(7, jComboBox1.getSelectedItem().toString());
                    myst.setString(8, jTextField4.getText());
                    myst.setString(9, jTextField6.getText());
                    myst.setString(10, jPasswordField1.getText());
                    Date doj = jDateChooser2.getDate();
                    SimpleDateFormat obj1 = new SimpleDateFormat("yyyy-MM-dd");
                    myst.setString(11, obj1.format(doj));
                    myst.setString(12,filename);
                    myst.setString(13,jLabel14.getText());
                    int count =myst.executeUpdate();
                    if(count==1){
                        JOptionPane.showMessageDialog(rootPane, "Seller info added  Succesfully");
                        clearfield();

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
        fetchempid();
        Date obj=new Date();
        jDateChooser2.setDate(obj);
        String myfile="default.png";
        try{
                        Image simg = ImageIO.read( new File("image//" + myfile)).getScaledInstance( jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT);
                        jLabel13.setIcon(new ImageIcon(simg));}
        catch(Exception e){
            
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String id= jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
     try
    {
        Connection myconn = DriverManager.getConnection(myurl1, uname, upass);
        try
        {
            String q="select * from manageemployee where empid=?";
            PreparedStatement myst = myconn.prepareStatement(q);
            myst.setString(1, id);
            ResultSet myres = myst.executeQuery();
            if(myres.next()==true)
            {
               
                jTextField1.setText(myres.getString("name"));
                jTextField2.setText(myres.getString("phone"));
                jTextArea1.setText(myres.getString("address"));
                jTextField3.setText(myres.getString("adhaar"));
                jTextField4.setText(myres.getString("salary"));
                jTextField6.setText(myres.getString("username"));
                jLabel14.setText(myres.getString("empid"));
                jPasswordField1.setText(myres.getString("password"));
                if(myres.getString("gender").equalsIgnoreCase("male"))
                      jRadioButton1.setSelected(true);
               else if(myres.getString("gender").equalsIgnoreCase("female"))
                       jRadioButton2.setSelected(true);
                jComboBox1.setSelectedItem(myres.getString("position"));
                jDateChooser1.setDate(myres.getDate("dob"));
                jDateChooser2.setDate(myres.getDate("joining"));
                jLabel14.setText(id);
                jButton2.setEnabled(true);
                jButton5.setEnabled(true);
                
                        String myfile=myres.getString("image");
                        oldfilename=myfile;
                        Image simg = ImageIO.read( new File("image//" + myfile)).getScaledInstance( jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT);
                        jLabel13.setIcon(new ImageIcon(simg));
           }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "username Invalid");
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

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c=evt.getKeyChar();
if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE || c==KeyEvent.VK_SPACE )))
evt.consume();
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)))
evt.consume();
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)))
evt.consume();
    }//GEN-LAST:event_jTextField3KeyTyped

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jPasswordField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPasswordField1KeyTyped

    private void jTextField4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE|| c==KeyEvent.VK_DELETE)||c==KeyEvent.VK_DECIMAL))
evt.consume();
    }//GEN-LAST:event_jTextField4KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser myfilechooser=new JFileChooser();
        myfilechooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                    if(f.isDirectory()) 
                         return true;
                    String extension=f.getName().substring(f.getName().lastIndexOf(".")+1);
                    String allowed[]={"jpg","png","gif","jpeg","bmp"};
                    for(String a:allowed)
                    {
                         if(a.equals(extension))
                        {
                            return true;
                        }
                        else
                        {
                            return false;
                        }
                    }
                    return false;
            }
        @Override
        public String getDescription() {
             return "All Picture Files";
          }
           
        });


        if(myfilechooser.showOpenDialog(rootPane)==JFileChooser.APPROVE_OPTION)
        {
            myfile=myfilechooser.getSelectedFile();
            try
            { 
                Image simg = ImageIO.read( new File(myfile.getAbsolutePath())).getScaledInstance( jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_AREA_AVERAGING);
                jLabel13.setIcon(new ImageIcon(simg));
            }
            catch(Exception e)
            {
                  JOptionPane.showMessageDialog(rootPane, "Cannot read image");
            }
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         String myfile="default.png";
        try{
                        Image simg = ImageIO.read( new File("image//" + myfile)).getScaledInstance( jLabel13.getWidth(), jLabel13.getHeight(), Image.SCALE_DEFAULT);
                        jLabel13.setIcon(new ImageIcon(simg));}
        catch(Exception e){
            
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
