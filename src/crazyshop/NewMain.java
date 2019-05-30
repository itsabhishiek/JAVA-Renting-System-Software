/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crazyshop;

import static crazyshop.constants.myurl1;
import static crazyshop.constants.uname;
import static crazyshop.constants.upass;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author abhis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     try {
 for (javax.swing.UIManager.LookAndFeelInfo info : 
 javax.swing.UIManager.getInstalledLookAndFeels()) {
 if ("Nimbus".equals(info.getName())) {
 javax.swing.UIManager.setLookAndFeel(info.getClassName());
 break;
 }
 }
 } catch (Exception ex) {
 JOptionPane.showMessageDialog(null, "Cannot apply nimbus theme");
 }
 
 
 try
 {
 Connection myconnection = DriverManager.getConnection(myurl1,uname,upass); 
 
 try
 {
 String myquery="select * from manageemployee";
 PreparedStatement mystatement = myconnection.prepareStatement(myquery);
 
 ResultSet myresult=mystatement.executeQuery();
 
 if(myresult.next())
 { 
 login obj=new login();
 obj.setVisible(true); 
 
 }
 else
 {
 JOptionPane.showMessageDialog(null, "Running software first time, please create admin account");
 createadmin obj=new createadmin();
 obj.setVisible(true);
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(null, "Error in Query due to " + e.getMessage());
 }
 finally
 {
 myconnection.close();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(null, "Error in Connection due to " + e.getMessage());
 }
 
    }
}