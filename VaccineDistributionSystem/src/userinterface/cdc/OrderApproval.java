/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.CDC;

import TheBusiness.Ecosystems;
import TheBusiness.NationalEnterprise.CenterOfDiseaseControl;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Organization.CDCOrganization;
import TheBusiness.Organization.DistributorOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.WorkOrderQueue.ProviderOrderRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author karthik
 */
public class OrderApproval extends javax.swing.JPanel {

    /**
     * Creates new form ApproveOrdersJPanel
     */
     private JPanel workContainer;
    private UserAccount userAccount;
    private Ecosystems business;
    private CenterOfDiseaseControl cdcEnterprise;
    private CDCOrganization cdcOrg;
    private ProviderOrderRequest request;
    
    public OrderApproval(JPanel workContainer, UserAccount userAccount,CenterOfDiseaseControl cdcEnterprise,CDCOrganization cdcOrg,Ecosystems business,ProviderOrderRequest request ) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.cdcEnterprise =cdcEnterprise;
        this.request =request;
        this.cdcOrg = cdcOrg;
        txtState.setText(String.valueOf(request.getreqState()));
        txtStatePopulation.setText(String.valueOf(request.getreqState().getStatePopulation()));
        txtVaccineLeftForState.setText(String.valueOf(request.getreqState().getVaccinesLeftForState()));
        txtOrderNumber.setText(String.valueOf(request.getVaccineOrder().getOrderNumber()));
        displayContractDetails();
        populateTable();

    }
    
    private void displayContractDetails(){
        
        if(request.ishalfmonthContract())
            txtOrderType.setText("Half Monthly");
        if(request.isfullMonthContract())
            txtOrderType.setText("Monthly");
        if(request.isasReq())
            txtOrderType.setText("As Required");
        
    }
    
    private void populateTable(){
        
         int rowCount = tblvacciine.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblvacciine.getModel();
        
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
                row[4] = oi.getVaccineDetails().getVaccinePrice();row[5] = oi.getQuantity();
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
        lblStatePopulation = new javax.swing.JLabel();
        txtStatePopulation = new javax.swing.JTextField();
        lblVaccinesLeftForState = new javax.swing.JLabel();
        txtVaccineLeftForState = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblvacciine = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        txtOrderType = new javax.swing.JTextField();
        lblOrderType = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        Separator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(37, 161, 142));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Approve Orders");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 673, -1));

        lblOrderNumber.setFont(new java.awt.Font("October Compressed Devanagari", 1, 12)); // NOI18N
        lblOrderNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderNumber.setText("Order Number:");
        add(lblOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        txtOrderNumber.setEnabled(false);
        add(txtOrderNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 64, -1));

        lblStatePopulation.setFont(new java.awt.Font("October Compressed Devanagari", 1, 12)); // NOI18N
        lblStatePopulation.setForeground(new java.awt.Color(255, 255, 255));
        lblStatePopulation.setText("State Population:");
        add(lblStatePopulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, 20));

        txtStatePopulation.setEnabled(false);
        add(txtStatePopulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 84, -1));

        lblVaccinesLeftForState.setFont(new java.awt.Font("October Compressed Devanagari", 1, 12)); // NOI18N
        lblVaccinesLeftForState.setForeground(new java.awt.Color(255, 255, 255));
        lblVaccinesLeftForState.setText("Vaccines left for State:");
        add(lblVaccinesLeftForState, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        txtVaccineLeftForState.setEnabled(false);
        add(txtVaccineLeftForState, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 127, -1));

        tblvacciine.setModel(new javax.swing.table.DefaultTableModel(
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
        tblvacciine.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblvacciine);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 673, 207));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/MicrosoftTeams-image (1).png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));

        btnApprove.setBackground(new java.awt.Color(0, 0, 0));
        btnApprove.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 80, -1));

        txtOrderType.setEnabled(false);
        add(txtOrderType, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 116, -1));

        lblOrderType.setFont(new java.awt.Font("October Compressed Devanagari", 1, 12)); // NOI18N
        lblOrderType.setForeground(new java.awt.Color(255, 255, 255));
        lblOrderType.setText("Order type:");
        add(lblOrderType, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        lblState.setFont(new java.awt.Font("October Compressed Devanagari", 1, 12)); // NOI18N
        lblState.setForeground(new java.awt.Color(255, 255, 255));
        lblState.setText("State:");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txtState.setEnabled(false);
        add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 115, -1));
        add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 673, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/approved.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 800, 195));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workContainer.remove(this);
        CardLayout layout = (CardLayout) workContainer.getLayout();
        layout.previous(workContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        
        if(request.getStatus().equalsIgnoreCase("CDC Approved") ||request.getStatus().equalsIgnoreCase("Rejected")|| request.getStatus().equalsIgnoreCase("Shipped") )
        {
            JOptionPane.showMessageDialog(null, "Order has already been processed!");
             return;
        }
        
        int totalOrderedQuantity =0;
        for(OrderItem oi : request.getVaccineOrder().getItemList())
        {
            totalOrderedQuantity = totalOrderedQuantity + oi.getQuantity();
        }
        
        
        if(totalOrderedQuantity > request.getreqState().getVaccinesLeftForState())
        {
            JOptionPane.showMessageDialog(null, "Order has reached maximum value available vaccines for state");
            request.setStatus("Rejected");
            return;
            
        }
        
        
        DistributorOrganization distOrg = null;
        for(Organization org: business.getDistributor().getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof DistributorOrganization)
            {
                org.getWorkQueue().addWorkRequest(request);
            }
        }
        
  
        request.setApprovedByCDC(true);
        request.setCdcApprovedBy(userAccount);
        request.setStatus("CDC Approved");
        
        int countLeft = request.getreqState().getVaccinesLeftForState();
        request.getreqState().setVaccinesLeftForState(countLeft-totalOrderedQuantity);
        
        JOptionPane.showMessageDialog(null, "Order passed to Distributor!");

    }//GEN-LAST:event_btnApproveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Separator1;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOrderNumber;
    private javax.swing.JLabel lblOrderType;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStatePopulation;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVaccinesLeftForState;
    private javax.swing.JTable tblvacciine;
    private javax.swing.JTextField txtOrderNumber;
    private javax.swing.JTextField txtOrderType;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStatePopulation;
    private javax.swing.JTextField txtVaccineLeftForState;
    // End of variables declaration//GEN-END:variables
}
