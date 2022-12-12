/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.Provider;

import TheBusiness.Ecosystems;
import TheBusiness.Enterprise.HospitalEnterprise;
import TheBusiness.Network.StateNetwork;
import TheBusiness.Organization.HospitalOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.WorkOrderQueue.ProviderOrderRequest;
import TheBusiness.WorkOrderQueue.ShippingOrderWorkRequest;
import TheBusiness.WorkOrderQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soham
 */
public class OrdersManagement extends javax.swing.JPanel {

    /**
     * Creates new form OrdersManagement
     */
    private JPanel workContainer;

    private HospitalEnterprise hospital;
    private UserAccount userAccount;
    private HospitalOrganization hospitalOrg;
    private Ecosystems business;
    private StateNetwork state;
    
    public OrdersManagement(JPanel workContainer, HospitalEnterprise hospital,HospitalOrganization hospitalOrg,UserAccount userAccount , Ecosystems business, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.userAccount = userAccount;
        this.hospital = hospital;
        this.business = business;
        this.state = state;
        populateOrderTable();
        populateShipTable();
        
        
    }
    
    private void populateOrderTable(){
        
        int rowCount = tblrorder.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblrorder.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospitalOrg = (HospitalOrganization)org;
        
        for(WorkRequest wr: hospitalOrg.getWorkQueue().getWorkRequestList())
        {   
            if( wr instanceof ProviderOrderRequest)
            {
              ProviderOrderRequest request = (ProviderOrderRequest)wr  ;
               Object[] row = new Object[5];
               row[0] = request;
               row[1] = getContractDetails(request);
               row[2] = request.getSender();
               row[3] = request.getStatus();
               row[4] = request.getResolveDate();
               defaulttabelmodel.addRow(row);
              
            }
        }
        
            } 
    }
    }
    
    private String getContractDetails(ProviderOrderRequest request){
        
        if(request.ishalfmonthContract())
            return "Half Monthly";
        else if(request.isfullMonthContract())
            return "Monthly";
        else
           return "Ad-hoc";
        
    }
    
    
    private void populateShipTable(){
        int rowCount = tblship.getRowCount();
        DefaultTableModel defaulttabelmodel = (DefaultTableModel)tblship.getModel();
        
        for(int i=rowCount-1 ; i>=0; i--){
            defaulttabelmodel.removeRow(i);
        }
        for(Organization org: hospital.getOrganizationDirectory().getOrganizationList())
        {
            if(org instanceof HospitalOrganization)
            {
                HospitalOrganization hospitalOrg = (HospitalOrganization)org;
        
        for(WorkRequest wr: hospitalOrg.getWorkQueue().getWorkRequestList())
        { 
        
        
        
            if( wr instanceof ShippingOrderWorkRequest)
            {
              ShippingOrderWorkRequest request = (ShippingOrderWorkRequest)wr  ;
               Object[] row = new Object[4];
               row[0] = request;
               row[1] = request.getStatus();
               row[2] = request.getSender();
               row[3] = request.getShippingDate();
               
               defaulttabelmodel.addRow(row);
              
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblrorder = new javax.swing.JTable();
        btnview1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblship = new javax.swing.JTable();
        btnviewinven = new javax.swing.JButton();
        btnref2 = new javax.swing.JButton();
        btnref = new javax.swing.JButton();

        setBackground(new java.awt.Color(70, 130, 180));

        jLabel1.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Orders");

        jLabel2.setFont(new java.awt.Font("October Compressed Devanagari", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Order Status:");

        tblrorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Contract?", "Sender", "Status", "Last Shipping date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblrorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblrorder);

        btnview1.setBackground(new java.awt.Color(0, 0, 0));
        btnview1.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnview1.setForeground(new java.awt.Color(255, 255, 255));
        btnview1.setText("View Details");
        btnview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnview1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("October Compressed Devanagari", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Shipped Orders:");

        tblship.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Number", "Status", "Sender", "Shipping Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblship.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblship);

        btnviewinven.setBackground(new java.awt.Color(0, 0, 0));
        btnviewinven.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnviewinven.setForeground(new java.awt.Color(255, 255, 255));
        btnviewinven.setText("View and add to Inventory");
        btnviewinven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewinvenActionPerformed(evt);
            }
        });

        btnref2.setBackground(new java.awt.Color(0, 0, 0));
        btnref2.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnref2.setForeground(new java.awt.Color(255, 255, 255));
        btnref2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnref2.setText("Refresh");
        btnref2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnref2ActionPerformed(evt);
            }
        });

        btnref.setBackground(new java.awt.Color(0, 0, 0));
        btnref.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnref.setForeground(new java.awt.Color(255, 255, 255));
        btnref.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnref.setText("Refresh");
        btnref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnref))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnref2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnview1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnviewinven, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(btnref))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnview1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnref2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnviewinven)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_btnrefActionPerformed

    private void btnref2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnref2ActionPerformed
        // TODO add your handling code here:
        populateShipTable();
    }//GEN-LAST:event_btnref2ActionPerformed

    private void btnview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnview1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblrorder.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        ProviderOrderRequest request = (ProviderOrderRequest)tblrorder.getValueAt(selectedRow, 0);
        
        ViewPlacedOrders panel = new ViewPlacedOrders(workContainer, request);
        workContainer.add("ViewDetailsOfPlacedOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
        
    }//GEN-LAST:event_btnview1ActionPerformed

    private void btnviewinvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewinvenActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblship.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        ShippingOrderWorkRequest request = (ShippingOrderWorkRequest)tblship.getValueAt(selectedRow, 0);
        
        
        ViewShippedOrders panel = new ViewShippedOrders(workContainer, business , hospital, hospitalOrg, request);
        workContainer.add("ViewDetailsOfShippedOrderJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnviewinvenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnref;
    private javax.swing.JButton btnref2;
    private javax.swing.JButton btnview1;
    private javax.swing.JButton btnviewinven;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblrorder;
    private javax.swing.JTable tblship;
    // End of variables declaration//GEN-END:variables
}
