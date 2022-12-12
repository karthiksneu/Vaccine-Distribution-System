/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CDC;

import TheBusiness.Ecosystems;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.Organization.MedicalOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author karthik
 */
public class CDCMedicalOfficer extends javax.swing.JPanel {

    /**
     * Creates new form CDCMedicalOfficer
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Ecosystems business;
    private CenterOfDiseaseControl cdcEnterprise;
    private MedicalOrganization mo;
    private CenterOfDiseaseControl cdc;
    private CDCOrganization cdcOrg;
    
    public CDCMedicalOfficer(JPanel userProcessContainer, UserAccount userAccount,Ecosystems business,CenterOfDiseaseControl cdcEnterprise,MedicalOrganization mo ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.mo = mo;
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
        mainMenu = new javax.swing.JPanel();
        btnViewVaccineData = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(170);

        workContainer.setBackground(new java.awt.Color(37, 161, 142));
        workContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(workContainer);

        mainMenu.setBackground(new java.awt.Color(37, 161, 142));

        btnViewVaccineData.setBackground(new java.awt.Color(0, 0, 0));
        btnViewVaccineData.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnViewVaccineData.setForeground(new java.awt.Color(255, 255, 255));
        btnViewVaccineData.setText("View vaccine data");
        btnViewVaccineData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewVaccineData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVaccineDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addComponent(btnViewVaccineData))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(btnViewVaccineData)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        jSplitPane1.setTopComponent(mainMenu);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewVaccineDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVaccineDataActionPerformed
        // TODO add your handling code here:
        VaccineDistributeState panel = new VaccineDistributeState(workContainer,userAccount, business, cdc, cdcOrg);
        workContainer.add("VaccineStateDistributionJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnViewVaccineDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnViewVaccineData;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JPanel workContainer;
    // End of variables declaration//GEN-END:variables
}