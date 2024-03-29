/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.EnterpriseAdmin;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.Enterprise.LocalHealthDepartment;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.NationalEnterprise.Distributor;
import TheBusiness.NationalEnterprise.Manufacturer;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.Organization.DistributorOrganization;
import TheBusiness.Organization.HospitalOrganization;
import TheBusiness.Organization.ManufactureOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.Organization.LocalHealthDptImmuneOrganization;
import TheBusiness.Organization.PatientOrganization;
import TheBusiness.Organization.ClinicOrganization;
import TheBusiness.Organization.MedicalOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soham
 */
public class ManageDepartment extends javax.swing.JPanel {

   
    private JPanel workContainer;
    private Enterprise enterprise;
            
    public ManageDepartment(JPanel workContainer, Enterprise enterprise ) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        populateTable();
        populateCombo();
        txtClinicName.setVisible(false);
            lblClinicName.setVisible(false);
        if(enterprise instanceof HospitalEnterprise)
        {
            txtClinicName.setVisible(true);
            lblClinicName.setVisible(true);
                
        }
        
    }
    
    private void populateCombo(){
        cborglist.removeAllItems();
        if(enterprise instanceof CenterOfDiseaseControl)
        {   
            cborglist.addItem(Organization.OrganizationType.CDCOrg);
            cborglist.addItem(Organization.OrganizationType.MedicalOrganization);
        }
        if(enterprise instanceof Manufacturer)
        {
            cborglist.addItem(Organization.OrganizationType.ManufactureOrg);
        }
        if(enterprise instanceof Distributor)
        {
            cborglist.addItem(Organization.OrganizationType.DistributorOrg);
            
        }
        if( enterprise instanceof LocalHealthDepartment)
        {
            cborglist.addItem(Organization.OrganizationType.LocalHealthDepartmentOrg);
        }
        
        if( enterprise instanceof HospitalEnterprise)
        {
            cborglist.addItem(Organization.OrganizationType.HospitalOrg);
            cborglist.addItem(Organization.OrganizationType.PatientOrganization);
            cborglist.addItem(Organization.OrganizationType.ClinicOrganization);
        }
        
       
    }
    
    private void populateTable(){
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblorg.getModel();
        
        defaulttabelmodel.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList())
        {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            if(organization instanceof ClinicOrganization)
            {
                ClinicOrganization satOrg =(ClinicOrganization)organization;
                row[1] = satOrg.getClincName()+"Clinic";
            }
            else
            row[1] = organization.getName();
            
            defaulttabelmodel.addRow(row);
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
        tblorg = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        lblOrganizationType = new javax.swing.JLabel();
        cborglist = new javax.swing.JComboBox();
        btnAddOrganization = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblAddOrganization = new javax.swing.JLabel();
        lblClinicName = new javax.swing.JLabel();
        txtClinicName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(70, 130, 180));

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Organization");

        tblorg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Organization Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorg.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblorg);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblOrganizationType.setFont(new java.awt.Font("October Compressed Devanagari", 0, 14)); // NOI18N
        lblOrganizationType.setForeground(new java.awt.Color(255, 255, 255));
        lblOrganizationType.setText("Organization Type ");

        cborglist.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAddOrganization.setBackground(new java.awt.Color(0, 0, 0));
        btnAddOrganization.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnAddOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });

        lblAddOrganization.setFont(new java.awt.Font("October Compressed Devanagari", 1, 14)); // NOI18N
        lblAddOrganization.setForeground(new java.awt.Color(255, 255, 255));
        lblAddOrganization.setText("Add Organization:");

        lblClinicName.setFont(new java.awt.Font("October Compressed Devanagari", 0, 14)); // NOI18N
        lblClinicName.setForeground(new java.awt.Color(255, 255, 255));
        lblClinicName.setText(" Clinic Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblAddOrganization))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAddOrganization)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblClinicName)
                                            .addComponent(lblOrganizationType))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cborglist, 0, 144, Short.MAX_VALUE)
                                            .addComponent(txtClinicName))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle)
                    .addComponent(btnBack))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddOrganization)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrganizationType)
                    .addComponent(cborglist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClinicName)
                    .addComponent(txtClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddOrganization)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed
        // TODO add your handling code here:
        
        
        Organization.OrganizationType type = (Organization.OrganizationType) cborglist.getSelectedItem();
        //check if organization exists
        
        //
        boolean corg =false;
        boolean morg =false;
        
        if( enterprise instanceof CenterOfDiseaseControl)
            {

            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
            if(org instanceof CDCOrganization)
            {
            corg=true;
            }
            if(org instanceof MedicalOrganization)
            {
            morg=true;
            }

            }
            if(corg==true && type.equals(Organization.OrganizationType.CDCOrg))
            {
            JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
            }
            else if(morg==true && type.equals(Organization.OrganizationType.MedicalOrganization)){
            JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
            }



            }
                    //
        
        if(enterprise instanceof Manufacturer)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof ManufactureOrganization)
                {
                     JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
                }
            }
        }
        if(enterprise instanceof Distributor)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof DistributorOrganization)
                {
                     JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
                }
            }
            
        }
        if( enterprise instanceof LocalHealthDepartment)
        {
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof LocalHealthDptImmuneOrganization)
                {
                     JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
                }
            }
        }
         boolean hospOrg=false;
            boolean patientOrg=false;
        if( enterprise instanceof HospitalEnterprise)
        {
            String satClinicName = txtClinicName.getText();
           
            for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof HospitalOrganization)
                {
                     hospOrg=true;
                }
                 if(org instanceof PatientOrganization)
                {
                     patientOrg=true;
                }
               
            }
            if(hospOrg==true && type.equals(Organization.OrganizationType.HospitalOrg))
            {
                  JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
            }
            else if(patientOrg==true && type.equals(Organization.OrganizationType.PatientOrganization)){
                JOptionPane.showMessageDialog(null, "Department Exists!");
            return;
            }
            else if(type.equals(Organization.OrganizationType.ClinicOrganization))
            {
                ClinicOrganization satOrg = (ClinicOrganization)enterprise.getOrganizationDirectory().createOrganization(type);
                satOrg.setClincName(satClinicName);
                populateTable();
                return;
            }
            
            
        }
        
        enterprise.getOrganizationDirectory().createOrganization(type);
        populateTable();
    
    }//GEN-LAST:event_btnAddOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cborglist;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddOrganization;
    private javax.swing.JLabel lblClinicName;
    private javax.swing.JLabel lblOrganizationType;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblorg;
    private javax.swing.JTextField txtClinicName;
    // End of variables declaration//GEN-END:variables
}
