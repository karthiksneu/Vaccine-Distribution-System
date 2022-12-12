/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.CDC;

import TheBusiness.Ecosystems;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.WorkOrderQueue.ProviderOrderRequest;
import TheBusiness.WorkOrderQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik
 */
public class CDCOrderManagement extends javax.swing.JPanel {

    private JPanel workContainer;
    private UserAccount userAccount;
    private Ecosystems business;
    private CenterOfDiseaseControl cdcEnterprise;
    private CDCOrganization cdcOrg;
    
    
    public CDCOrderManagement(JPanel workContainer, UserAccount userAccount,Ecosystems business,CenterOfDiseaseControl cdcEnterprise,CDCOrganization cdcOrg  ) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise = cdcEnterprise;
        this.cdcOrg = cdcOrg;
        populateTable();
     
    }
    
    private void populateTable(){
        
        DefaultTableModel model = (DefaultTableModel) tblorder.getModel();
        model.setRowCount(0);
        
         CDCOrganization cOrg = null;
         
        for(Organization org : cdcEnterprise.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof CDCOrganization)
        {   cOrg = (CDCOrganization)org;
            for(WorkRequest workRequest : cOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof ProviderOrderRequest)
            {ProviderOrderRequest vaccineOrderWR = (ProviderOrderRequest)workRequest;
                
                Object[] row = new Object[6];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getEnterprise();
                row[2] = vaccineOrderWR.getreqState();
                row[3] = vaccineOrderWR.getSender();
                row[4] = vaccineOrderWR.getStatus();
                row[5] = vaccineOrderWR.getCdcApprovedBy();
                
                model.addRow(row);
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

        jToggleButton1 = new javax.swing.JToggleButton();
        lblTitle = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnViewDetailsAndApprove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblorder = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setBackground(new java.awt.Color(37, 161, 142));

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Vaccine Orders");

        btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnViewDetailsAndApprove.setBackground(new java.awt.Color(0, 0, 0));
        btnViewDetailsAndApprove.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnViewDetailsAndApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnViewDetailsAndApprove.setText("View Details & Approve");
        btnViewDetailsAndApprove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewDetailsAndApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsAndApproveActionPerformed(evt);
            }
        });

        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Provider", "State", "Sender", "Status", "Approved By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblorder);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/approve4_50x50.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRefresh)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewDetailsAndApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewDetailsAndApprove))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnViewDetailsAndApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsAndApproveActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblorder.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Kindly select an Order from table first !");
            return;
        }

        ProviderOrderRequest request = (ProviderOrderRequest)tblorder.getValueAt(selectedRow, 0);

        OrderApproval panel = new OrderApproval(workContainer, userAccount, cdcEnterprise,cdcOrg, business, request);
        workContainer.add("ApproveOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnViewDetailsAndApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnViewDetailsAndApprove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblorder;
    // End of variables declaration//GEN-END:variables
}