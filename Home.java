
import javax.swing.JOptionPane;
/*
cd /usr/local/mysql-8.0.27-macos11-arm64
mysql -u root -p
show databases;
use bms;
table:buyer, product
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jagatnasakar
 */
public class Home extends javax.swing.JFrame {
    public int z=0;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        newBuyer.setVisible(false); 
        newProduct.setVisible(false);//setting all visible to the false, when we click on a buttion then visible
        productDetails.setVisible(false);
        
        updateProduct.setVisible(false);
        updateBuyer.setVisible(false);
        
        deleteBuyer.setVisible(true);
        deleteProduct.setVisible(false);
        billing.setVisible(false);
        logOut.setVisible(false);
        close.setVisible(false);
        
        
        BD.setVisible(false);
        NP.setVisible(false);
        PD.setVisible(false);
        PD.setVisible(false);
        UP.setVisible(false);
        UB.setVisible(false);
        DB.setVisible(true);
        DP.setVisible(false);
        B.setVisible(false);
        LO.setVisible(false);
        C.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        newBuyer = new javax.swing.JButton();
        updateBuyer = new javax.swing.JButton();
        newProduct = new javax.swing.JButton();
        updateProduct = new javax.swing.JButton();
        productDetails = new javax.swing.JButton();
        deleteProduct = new javax.swing.JButton();
        billing = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        close = new javax.swing.JButton();
        B = new javax.swing.JTextField();
        deleteBuyer = new javax.swing.JButton();
        PD = new javax.swing.JTextField();
        BD = new javax.swing.JTextField();
        DB = new javax.swing.JTextField();
        UB = new javax.swing.JTextField();
        NP = new javax.swing.JTextField();
        UP = new javax.swing.JTextField();
        LO = new javax.swing.JTextField();
        C = new javax.swing.JTextField();
        DP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-play-64.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 55));

        newBuyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEWBuyer-removebg-preview.png"))); // NOI18N
        newBuyer.setText("new Buyer");
        newBuyer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                newBuyerComponentShown(evt);
            }
        });
        newBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBuyerActionPerformed(evt);
            }
        });
        getContentPane().add(newBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 136, 100));

        updateBuyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UPDATEE.png"))); // NOI18N
        updateBuyer.setText("UpdateBuyer");
        updateBuyer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateBuyerComponentShown(evt);
            }
        });
        updateBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBuyerActionPerformed(evt);
            }
        });
        getContentPane().add(updateBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 140, 80));

        newProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEWproduct.jpeg"))); // NOI18N
        newProduct.setText("newProduct");
        newProduct.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                newProductComponentShown(evt);
            }
        });
        newProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProductActionPerformed(evt);
            }
        });
        getContentPane().add(newProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 136, 80));

        updateProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UpdateP.png"))); // NOI18N
        updateProduct.setText("updateProduct");
        updateProduct.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                updateProductComponentShown(evt);
            }
        });
        updateProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProductActionPerformed(evt);
            }
        });
        getContentPane().add(updateProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 120, 90));

        productDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRODUCT-removebg-preview.png"))); // NOI18N
        productDetails.setText("productDetails");
        productDetails.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                productDetailsComponentShown(evt);
            }
        });
        productDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(productDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 130, 90));

        deleteProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png"))); // NOI18N
        deleteProduct.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deleteProductComponentShown(evt);
            }
        });
        deleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductActionPerformed(evt);
            }
        });
        getContentPane().add(deleteProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 136, 80));

        billing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Billing.png"))); // NOI18N
        billing.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                billingComponentShown(evt);
            }
        });
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        getContentPane().add(billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 140, 70));

        logOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        logOut.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                logOutComponentShown(evt);
            }
        });
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 136, 70));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CLOSE.png"))); // NOI18N
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 130, -1));

        B.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        B.setText("Bill");
        getContentPane().add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, -1, -1));

        deleteBuyer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Delete.png"))); // NOI18N
        deleteBuyer.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                deleteBuyerComponentShown(evt);
            }
        });
        deleteBuyer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBuyerActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBuyer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 110, 90));

        PD.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        PD.setText("Product Details");
        getContentPane().add(PD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, 20));

        BD.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        BD.setText("Buyers Details");
        getContentPane().add(BD, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        DB.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        DB.setText("Delete Buyer");
        getContentPane().add(DB, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        UB.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        UB.setText("Update Buyer");
        getContentPane().add(UB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, -1, -1));

        NP.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        NP.setText("Add new Product");
        getContentPane().add(NP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        UP.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        UP.setText("Update Product");
        getContentPane().add(UP, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        LO.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        LO.setText("Log Out");
        getContentPane().add(LO, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, -1, -1));

        C.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        C.setText("Close");
        getContentPane().add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, -1));

        DP.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        DP.setText("Delete Product");
        getContentPane().add(DP, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Rockwell", 3, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Home");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sch.jpeg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 910, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProductActionPerformed
        new updateProduct().setVisible(true);
    }//GEN-LAST:event_updateProductActionPerformed

    private void deleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductActionPerformed
       setVisible(false);
       new deleteProduct().setVisible(true);
    }//GEN-LAST:event_deleteProductActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        int ext= JOptionPane.showConfirmDialog(null, "Do you want to Log Out?", "Select", JOptionPane.YES_NO_OPTION);
        if(ext == 0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logOutActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        int close= JOptionPane.showConfirmDialog(null, "Do you want to Close the applicaiton?", "Select", JOptionPane.YES_NO_OPTION);
        if(close == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_closeActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(z==0)
        {
            try
            {
                Thread.sleep(250);
                newBuyer.setVisible(true);
                BD.setVisible(true);
            }
            catch(Exception e){}
        }
        else{
        newBuyer.setVisible(false); 
        newProduct.setVisible(false);//setting all visible to the false, when we click on a buttion then visible
        productDetails.setVisible(false);
        updateProduct.setVisible(false);
        updateBuyer.setVisible(false);
//        deleteBuyer.setVisible(false);
        deleteProduct.setVisible(false);
        billing.setVisible(false);
        logOut.setVisible(false);
        close.setVisible(false);
        
        BD.setVisible(false);
        NP.setVisible(false);
        PD.setVisible(false);
        PD.setVisible(false);
        UP.setVisible(false);
        UB.setVisible(false);
        //DB.setVisible(false);
        DP.setVisible(false);
        B.setVisible(false);
        LO.setVisible(false);
        C.setVisible(false);
        z=0;     
                    
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void newBuyerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_newBuyerComponentShown
        try
            {
                Thread.sleep(250);
                productDetails.setVisible(true);
                PD.setVisible(true);
            }
            catch(Exception e){}
    }//GEN-LAST:event_newBuyerComponentShown

    private void productDetailsComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_productDetailsComponentShown
        try
            {
                Thread.sleep(250);
                newProduct.setVisible(true);
                NP.setVisible(true);
            }
            catch(Exception e){}
    }//GEN-LAST:event_productDetailsComponentShown

    private void newProductComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_newProductComponentShown
        try
            {
                Thread.sleep(250);
                updateProduct.setVisible(true);
                UP.setVisible(true);
            }
            catch(Exception e){}
    }//GEN-LAST:event_newProductComponentShown

    private void updateProductComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateProductComponentShown
        try
            {
                Thread.sleep(250);
                updateBuyer.setVisible(true);
                UB.setVisible(true);
            }
            catch(Exception e){}
    }//GEN-LAST:event_updateProductComponentShown

    private void updateBuyerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_updateBuyerComponentShown
        try
            {
                Thread.sleep(250);
                deleteProduct.setVisible(true);
                DP.setVisible(true);
            }
            catch(Exception e){}
    }//GEN-LAST:event_updateBuyerComponentShown

    private void deleteProductComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteProductComponentShown
         try
            {
                Thread.sleep(250);
                billing.setVisible(true);
                B.setVisible(true);
            }
            catch(Exception e){}
    }//GEN-LAST:event_deleteProductComponentShown

    private void billingComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_billingComponentShown
        try
            {
                Thread.sleep(250);
                logOut.setVisible(true);
                LO.setVisible(true);
            }
            catch(Exception e){}
    }//GEN-LAST:event_billingComponentShown

    private void logOutComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_logOutComponentShown
        try
            {
                Thread.sleep(250);
                close.setVisible(true);
                C.setVisible(true);
                z=1;
            }
            catch(Exception e){}
    }//GEN-LAST:event_logOutComponentShown

    private void productDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productDetailsActionPerformed
            setVisible(false);
            new productDetails().setVisible(true);
    }//GEN-LAST:event_productDetailsActionPerformed

    private void newBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBuyerActionPerformed
        new newBuyer().setVisible(true);
    }//GEN-LAST:event_newBuyerActionPerformed

    private void newProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductActionPerformed
        new newProduct().setVisible(true);
    }//GEN-LAST:event_newProductActionPerformed

    private void updateBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBuyerActionPerformed
        new updateBuyer().setVisible(true);
    }//GEN-LAST:event_updateBuyerActionPerformed
 
    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        new Billing().setVisible(true);
    }//GEN-LAST:event_billingActionPerformed

    private void deleteBuyerComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_deleteBuyerComponentShown
       try
            {
                Thread.sleep(250);
                deleteBuyer.setVisible(true);
                DB.setVisible(true);
            }
            catch(Exception e){}
    }//GEN-LAST:event_deleteBuyerComponentShown

    private void deleteBuyerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBuyerActionPerformed
        new deleteBuyer().setVisible(true);
    }//GEN-LAST:event_deleteBuyerActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B;
    private javax.swing.JTextField BD;
    private javax.swing.JTextField C;
    private javax.swing.JTextField DB;
    private javax.swing.JTextField DP;
    private javax.swing.JTextField LO;
    private javax.swing.JTextField NP;
    private javax.swing.JTextField PD;
    private javax.swing.JTextField UB;
    private javax.swing.JTextField UP;
    private javax.swing.JButton billing;
    private javax.swing.JButton close;
    private javax.swing.JButton deleteBuyer;
    private javax.swing.JButton deleteProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logOut;
    private javax.swing.JButton newBuyer;
    private javax.swing.JButton newProduct;
    private javax.swing.JButton productDetails;
    private javax.swing.JButton updateBuyer;
    private javax.swing.JButton updateProduct;
    // End of variables declaration//GEN-END:variables
}