/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.CDC;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.Organization.HospitalOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.VaccineManagement.AdministeredVaccineDetails;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik
 */
public class ProviderAdmin extends javax.swing.JPanel {

    private JPanel workContainer;
    private Enterprise enterprise;
    private Ecosystems business;
    private UserAccount userAccount;
    
    
    public ProviderAdmin(JPanel workContainer, Enterprise enterprise, Ecosystems business, UserAccount userAccount ) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        this.business = business;
        this.userAccount = userAccount;
        populateTable();
    }
    
    private void populateTable()
    {
        
         int rowCount = tblvaccine.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvaccine.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        if(enterprise instanceof HospitalEnterprise)
        {
            HospitalEnterprise hospEnterprise = (HospitalEnterprise)enterprise;
        
        for(Organization org: hospEnterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospOrg = (HospitalOrganization)org;
                for(AdministeredVaccineDetails vaccine: hospOrg.getClinic().getAdministeredVaccineList())
                {   
                    if(!(vaccine.getVaccineProduct()== null) && !(vaccine.getPatient()==null))
                    {Object[] row = new Object[10];
                    row[0]=vaccine.getVaccineProduct();
                    row[1]=vaccine;
                    row[2]=vaccine.getVaccineProduct().getManufacturerName();
                    row[3]=vaccine.getVaccineProduct().getBatchId();
                    row[4]=vaccine.getVaccineProduct().getVaccineId();
                    row[5]=vaccine.getPatient().getFirstName()+" "+vaccine.getPatient().getLastName();
                    row[6]=vaccine.getDate();
                    row[7]=vaccine.getSiteRoute();
                    row[8]=vaccine.getDoseNumber();
                    row[9]=vaccine.getshotstatus();
                    defaulttabelmodel.addRow(row);
                    
                    }
        
                    
                }
            }
        }
        }

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblvaccine = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(37, 161, 142));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Administered Vaccine List");

        tblvaccine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Brand", "Batch Number", "Vaccine Id", "Patient", "Date", "SiteRoute", "Dose Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblvaccine.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblvaccine);

        btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/approvelist_100x100.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresh)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblvaccine;
    // End of variables declaration//GEN-END:variables
}