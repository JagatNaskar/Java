
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jagatnasakar
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        PasswordAns = new javax.swing.JPasswordField();
        UserAns = new javax.swing.JTextField();
        checkBox = new javax.swing.JCheckBox();
        CloseButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        LoginLogo = new javax.swing.JLabel();
        LoginBackgound = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Username.setFont(new java.awt.Font("ITF Devanagari", 3, 18)); // NOI18N
        Username.setText("Username:");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 404, -1, -1));

        Password.setFont(new java.awt.Font("ITF Devanagari", 3, 18)); // NOI18N
        Password.setText("Password:");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 455, 84, -1));

        PasswordAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordAnsActionPerformed(evt);
            }
        });
        getContentPane().add(PasswordAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 456, 167, -1));

        UserAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAnsActionPerformed(evt);
            }
        });
        getContentPane().add(UserAns, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 405, 167, -1));

        checkBox.setFont(new java.awt.Font("Kailasa", 3, 14)); // NOI18N
        checkBox.setText("show password");
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 509, -1, -1));

        CloseButton.setFont(new java.awt.Font("ITF Devanagari", 3, 18)); // NOI18N
        CloseButton.setText("Close");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CloseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 583, -1, -1));

        LoginButton.setFont(new java.awt.Font("ITF Devanagari", 3, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 583, -1, -1));

        LoginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login11.png"))); // NOI18N
        getContentPane().add(LoginLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 225, -1, -1));

        LoginBackgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backg.jpeg"))); // NOI18N
        getContentPane().add(LoginBackgound, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 530, 510));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgroundd.jpeg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 1640, 990));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if(UserAns.getText().equals("admin") && PasswordAns.getText().equals("admin"))   //setting user and password
        {
            setVisible(false);   // if (username == password) then login screen closes
            new Home().setVisible(true);
        }
        else   // if user name or password is incorrect.
            JOptionPane.showMessageDialog(null, "Incorrect Username or password");
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        int close = JOptionPane.showConfirmDialog(null, "Do you want to close?", "Select", JOptionPane.YES_NO_OPTION);
        if(close == 0) //if user selected yes, then close == 0
            System.exit(0); // width = 0
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void UserAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserAnsActionPerformed

    private void PasswordAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordAnsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordAnsActionPerformed

    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
        if(checkBox.isSelected())           //Setting a value of 0 indicates that you wish to see the text as it is typed
            PasswordAns.setEchoChar((char)0);  // if sheck box is clicked show character
        else {
            PasswordAns.setEchoChar('*'); // else show astrix(*) sign
        }
    }//GEN-LAST:event_checkBoxActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CloseButton;
    private javax.swing.JLabel LoginBackgound;
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel LoginLogo;
    private javax.swing.JLabel Password;
    private javax.swing.JPasswordField PasswordAns;
    private javax.swing.JTextField UserAns;
    private javax.swing.JLabel Username;
    private javax.swing.JCheckBox checkBox;
    // End of variables declaration//GEN-END:variables
}
