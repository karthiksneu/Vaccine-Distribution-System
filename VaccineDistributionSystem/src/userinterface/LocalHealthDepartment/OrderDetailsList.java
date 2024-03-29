/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.LocalHealthDepartment;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.LocalHealthDepartment;
import TheBusiness.Network.StateNetwork;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.Organization.LocalHealthDptImmuneOrganization;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.WorkOrderQueue.ProviderOrderRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dsouza
 */
public class OrderDetailsList extends javax.swing.JPanel {

    /**
     * Creates new form OrderDetailsList
     */
    private JPanel workContainer;
    private UserAccount userAccount;
    private LocalHealthDepartment enterprise;
    private LocalHealthDptImmuneOrganization lhdOrg;
    private Ecosystems business;
    private StateNetwork state;
    private ProviderOrderRequest request;
    
    public OrderDetailsList(JPanel workContainer, UserAccount userAccount, LocalHealthDepartment enterprise,LocalHealthDptImmuneOrganization lhdOrg, StateNetwork state,Ecosystems business, ProviderOrderRequest request) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.lhdOrg = lhdOrg;
        this.business = business;
        this.state = state;
        this.request = request;
        txtOrderNumber.setText(String.valueOf(request.getVaccineOrder().getOrderNumber()));
        displayContractDetails();
        populateTable();
        
    }
    
    private void displayContractDetails(){
        
        if(request.ishalfmonthContract())
            tctdetails1.setText("Half Monthly");
        if(request.isfullMonthContract())
            tctdetails1.setText("Monthly");
        if(request.isasReq())
            tctdetails1.setText("Adhoc");
        
    }
    
    private void populateTable(){
        
         int rowCount = tblvaccorder.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvaccorder.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        
        for(OrderItem oi: request.getVaccineOrder().getItemList())
        {
            Object[] row = new Object[8];
            
                row[0] = oi.getVaccineDetails();
                row[1] = oi;
                row[2] = oi.getVaccineDetails().getVaccineId();
                row[3] = oi.getVaccineDetails().getBatchId();
                row[4] = oi.getVaccineDetails().getVaccinePrice();
                row[5] = oi.getQuantity();
                row[6] = oi.getVaccineDetails().getManufactureDate();
                row[7] = oi.getVaccineDetails().getVaccinePrice()*oi.getQuantity();
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
        lblOrderNumber = new javax.swing.JLabel();
        txtOrderNumber = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblvaccorder = new javax.swing.JTable();
        btnApproveOrder = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblContactDetails = new javax.swing.JLabel();
        tctdetails1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Order Details");

        lblOrderNumber.setFont(new java.awt.Font("October Compressed Devanagari", 0, 14)); // NOI18N
        lblOrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderNumber.setText("Order Number:");

        txtOrderNumber.setEnabled(false);
        txtOrderNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderNumberActionPerformed(evt);
            }
        });

        tblvaccorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Code", "Vaccine Name", "Vaccine id", "Lot Number", "Price", "Quantity", "manufacture date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblvaccorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblvaccorder);

        btnApproveOrder.setBackground(new java.awt.Color(0, 0, 0));
        btnApproveOrder.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnApproveOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnApproveOrder.setText("Approve Order");
        btnApproveOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveOrderActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblContactDetails.setFont(new java.awt.Font("October Compressed Devanagari", 0, 14)); // NOI18N
        lblContactDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblContactDetails.setText("Contract Details:");

        tctdetails1.setEnabled(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/cart1_50x50.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/adminapproved.gif"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOrderNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblContactDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tctdetails1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnApproveOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(114, 114, 114)))
                        .addComponent(jLabel5)
                        .addGap(170, 170, 170)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderNumber)
                    .addComponent(txtOrderNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactDetails)
                    .addComponent(tctdetails1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnApproveOrder)
                            .addComponent(btnBack))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrderNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderNumberActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveOrderActionPerformed
        // TODO add your handling code here:
        //check if its already approved!
        if(request.getStatus().equalsIgnoreCase("LHD Approved") || request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("CDC Approved") )
        {
             JOptionPane.showMessageDialog(null, "Order already approved!");
             return;
        }
        
        //fetch the cdc org and insert the request into its workQueue
        
        CDCOrganization cdcOrg = null;
        for(Organization org: business.getCdc().getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof CDCOrganization)
            {
                org.getWorkQueue().addWorkRequest(request);
            }
        }

        request.setApprovedByLHD(true);
        request.setPhdApprovedBy(userAccount);
        request.setStatus("LHD Approved");
        request.setreqState(state);
        
        JOptionPane.showMessageDialog(null, "Order Sent to CDC!");
        
    }//GEN-LAST:event_btnApproveOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblContactDetails;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblvaccorder;
    private javax.swing.JTextField tctdetails1;
    private javax.swing.JTextField txtOrderNumber;
    // End of variables declaration//GEN-END:variables
}
