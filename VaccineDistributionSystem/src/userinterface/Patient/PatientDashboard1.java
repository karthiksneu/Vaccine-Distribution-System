/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.Patient;


import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Dsouza
 */
public class PatientDashboard1 extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
  
    
    public PatientDashboard1() {
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
        workContainer = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mainMenu = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnviewadminvacc = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        workContainer.setBackground(new java.awt.Color(0, 204, 204));
        workContainer.setLayout(new java.awt.CardLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/patient.gif"))); // NOI18N
        workContainer.add(jLabel2, "card2");

        jSplitPane1.setRightComponent(workContainer);

        mainMenu.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Main Menu:");

        btnviewadminvacc.setBackground(new java.awt.Color(0, 0, 102));
        btnviewadminvacc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnviewadminvacc.setForeground(new java.awt.Color(255, 255, 255));
        btnviewadminvacc.setText("View Administered Vaccines");
        btnviewadminvacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewadminvaccActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PATIENT");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnviewadminvacc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(mainMenuLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel6)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addGap(54, 54, 54)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btnviewadminvacc)
                .addContainerGap(416, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(mainMenu);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewadminvaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewadminvaccActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnviewadminvaccActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnviewadminvacc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}