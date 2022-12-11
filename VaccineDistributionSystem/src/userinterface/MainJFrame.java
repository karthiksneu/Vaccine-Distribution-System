/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package userinterface;


import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;




/**
 *
 * @author karthik
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        projecttitle = new javax.swing.JLabel();
        lbusername = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        lbpassword = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(135, 174, 115));

        controlPanel.setBackground(new java.awt.Color(237, 201, 227));
        controlPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        projecttitle.setFont(new java.awt.Font("Monotype Corsiva", 1, 36)); // NOI18N
        projecttitle.setForeground(new java.awt.Color(255, 255, 255));
        projecttitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        projecttitle.setText("LOGIN ");
        controlPanel.add(projecttitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 237, 46));

        lbusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbusername.setForeground(new java.awt.Color(255, 255, 255));
        lbusername.setText("Username:");
        controlPanel.add(lbusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 163, -1, -1));

        txtusername.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 197, 225, 40));

        lbpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbpassword.setForeground(new java.awt.Color(255, 255, 255));
        lbpassword.setText("Password :");
        controlPanel.add(lbpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 243, -1, 26));

        txtpassword.setBackground(new java.awt.Color(255, 255, 255));
        controlPanel.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 275, 225, 38));

        btnlogin.setBackground(new java.awt.Color(95, 69, 216));
        btnlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOGIN");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        controlPanel.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 331, 225, 50));

        btnlogout.setBackground(new java.awt.Color(95, 69, 216));
        btnlogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 255));
        btnlogout.setText("LOGOUT");
        btnlogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        controlPanel.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 406, 225, 41));

        jSplitPane1.setLeftComponent(controlPanel);

        workArea.setBackground(new java.awt.Color(170, 183, 233));
        workArea.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setLabelFor(workArea);
        lblTitle.setText("Vaccine Distribution System");
        workArea.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 760, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/106824234-1610588757413-gettyimages-1221622538-a_ac_42eps.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        workArea.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 690, 420));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Created by Karthik Sunil, Freya Dsouza, Soham Shah");
        workArea.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 630, 760, -1));

        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:

       

    }//GEN-LAST:event_btnloginActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnlogout;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbpassword;
    private javax.swing.JLabel lbusername;
    private javax.swing.JLabel projecttitle;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}