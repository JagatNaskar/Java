import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;
/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jagatnasakar
 */
public class updateBuyer extends javax.swing.JFrame {

    /**
     * Creates new form updateBuyer
     */
    public updateBuyer() {
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

        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        contactVar = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        Name = new javax.swing.JLabel();
        Phone = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        close = new javax.swing.JButton();
        Address = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(390, 160));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(0, 102, 153));
        jTextField1.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Update Buyer");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 24, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-update-user-48.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 12, -1, 69));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-update-user-48.png"))); // NOI18N
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 12, -1, 69));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 600, 10));

        contactVar.setFont(new java.awt.Font("Malayalam MN", 1, 14)); // NOI18N
        contactVar.setText("Contact Number :  ");
        getContentPane().add(contactVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 189, -1));

        search.setFont(new java.awt.Font("Gujarati Sangam MN", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-64.png"))); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, 40));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 167, 588, 10));

        Name.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Name.setText("Name : ");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 187, -1, -1));

        Phone.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Phone.setText("Contact : ");
        getContentPane().add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 232, -1, -1));

        Email.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Email.setText("Email  : ");
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 278, -1, -1));

        Gender.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Gender.setText("Gender : ");
        getContentPane().add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 321, -1, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 183, 188, -1));
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 188, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 274, 188, -1));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 317, 188, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 588, -1));

        reset.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/reset.png"))); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, 43));

        update.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/updateBuyer.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, 38));

        close.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close1.png"))); // NOI18N
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, 43));

        Address.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Address.setText("Adress :");
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 190, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fire-frame-1382784.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, 740, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        setVisible(false);
        new updateBuyer().setVisible(true);
    }//GEN-LAST:event_resetActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        String contactNo1 = contact.getText();  
        String Name = name.getText();
        String Email = email.getText();
        String Adress = address.getText();
        String Gender = gender.getText();
        String cont = phone.getText();
        
        try{         //update these data in database
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update buyer set name='"+Name+"',gender='"+Gender+"',email='"+Email+"',contactNo='"+cont+"',address='"+Adress+"' where contactNo='"+contactNo1+"'");
            JOptionPane.showMessageDialog(null, "Updated Successfully");
            setVisible(false);
            new updateBuyer().setVisible(true);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_updateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String contactNoo = contact.getText();
        try{
        Connection con = ConnectionProvider.getCon();   //to establish a connection
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select *from buyer where contactNo = '"+contactNoo+"'"); //database contact == search contact
        if(rs.next()) //shifts the cursor to the next row of the result set from the database and returns true if there is any row, otherwise false 
        {
            name.setText(rs.getString(1));  //column 1
            phone.setText(rs.getString(2));
            email.setText(rs.getString(3));
            gender.setText(rs.getString(4));
            address.setText(rs.getString(5));
            contact.setEditable(false);  //we cannot edit searched contact
        }
        else //if contact Number does not exist
            JOptionPane.showMessageDialog(null, "Contact number does not exist in our database.");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

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
            java.util.logging.Logger.getLogger(updateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateBuyer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateBuyer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Phone;
    private javax.swing.JTextField address;
    private javax.swing.JLabel background;
    private javax.swing.JButton close;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel contactVar;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}