/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.Manufacture;

import TheBusiness.Ecosystems;
import TheBusiness.NationalEnterprise.Manufacturer;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Organization.ManufactureOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.WorkOrderQueue.OrderVaccineWorkRequest;
import TheBusiness.WorkOrderQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dsouza
 */
public class ManufacturerOrderManagement extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerOrderManagement
     */
    
    private JPanel workContainer;
    private Manufacturer manufacturer;
    private UserAccount userAccount;
    private Ecosystems business;
    
    public ManufacturerOrderManagement(JPanel workContainer, Manufacturer manufacturer, UserAccount userAccount, Ecosystems business) {
        initComponents();
        this.workContainer = workContainer;
        this.manufacturer = manufacturer;
        this.userAccount = userAccount;
        this.business = business;
        populateOrderTable();
        populateProcessedOrderTable();
    }
    
    private void populateOrderTable(){
        
         DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblorder.getModel();
        defaulttabelmodel.setRowCount(0);
         ManufactureOrganization manufacureOrg = null;
         
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(WorkRequest workRequest : manufacureOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof OrderVaccineWorkRequest)
            {OrderVaccineWorkRequest vaccineOrderWR = (OrderVaccineWorkRequest)workRequest;
                
                Object[] row = new Object[4];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getSender();
                row[2] = vaccineOrderWR.getReceiver();
                row[3] = vaccineOrderWR.getStatus();
                
                defaulttabelmodel.addRow(row);
            }
            }
        }
 
    }
        
    }
    
    
    private void populateProcessedOrderTable(){
        
        DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblorderdone.getModel();
        defaulttabelmodel.setRowCount(0);
         ManufactureOrganization manufacureOrg = null;
         
        for(Organization org : manufacturer.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof ManufactureOrganization)
        {   manufacureOrg = (ManufactureOrganization)org;
            for(WorkRequest workRequest : manufacureOrg.getWorkQueue().getWorkRequestList())
            {   if(workRequest instanceof OrderVaccineWorkRequest)
            {OrderVaccineWorkRequest vaccineOrderWR = (OrderVaccineWorkRequest)workRequest;
                if(vaccineOrderWR.getStatus().equals("Shipped"))
                {Object[] row = new Object[5];
            
                row[0] = vaccineOrderWR;
                row[1] = vaccineOrderWR.getSender();
                row[2] = vaccineOrderWR.getReceiver();
                row[3] = vaccineOrderWR.getStatus();
                row[4] = vaccineOrderWR.getShipdate();
                
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
        tblorder = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnProcessOrders = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        lblOrdersFromDistributor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblorderdone = new javax.swing.JTable();
        lblProcessedOrders = new javax.swing.JLabel();
        btnRefresh1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(37, 161, 142));

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Orders");

        tblorder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Sender", "Receiver", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblorder);

        btnAssignToMe.setBackground(new java.awt.Color(0, 0, 0));
        btnAssignToMe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAssignToMe.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignToMe.setText("Assign to Me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnProcessOrders.setBackground(new java.awt.Color(0, 0, 0));
        btnProcessOrders.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProcessOrders.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessOrders.setText("Process order");
        btnProcessOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessOrdersActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        lblOrdersFromDistributor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblOrdersFromDistributor.setForeground(new java.awt.Color(255, 255, 255));
        lblOrdersFromDistributor.setText("Orders From Distributor:");

        tblorderdone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "OrderId", "Sender", "Receiver", "Status", "Ship Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblorderdone.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblorderdone);

        lblProcessedOrders.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProcessedOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblProcessedOrders.setText("Processed Orders:");

        btnRefresh1.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRefresh1.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/ICONS/11122021icons/MicrosoftTeams-image (2).png"))); // NOI18N
        btnRefresh1.setText("Refresh");
        btnRefresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefresh1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssignToMe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcessOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblOrdersFromDistributor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProcessedOrders)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh1)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefresh)
                    .addComponent(lblOrdersFromDistributor))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignToMe)
                    .addComponent(btnProcessOrders))
                .addGap(42, 42, 42)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProcessedOrders)
                    .addComponent(btnRefresh1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblorder.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        WorkRequest request = (WorkRequest)tblorder.getValueAt(selectedRow, 0);
        
        if(request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("Stored"))
         {
             JOptionPane.showMessageDialog(null, "Order already shipped!");
             return;
         }
        request.setReceiver(userAccount);
        request.setStatus("Assigned");
        populateOrderTable();
        
        
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnProcessOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessOrdersActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblorder.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select an Order from table");
            return;
        }
        
        
         OrderVaccineWorkRequest request = (OrderVaccineWorkRequest)tblorder.getValueAt(selectedRow, 0);
         
         if(request.getStatus().equalsIgnoreCase("Shipped") || request.getStatus().equalsIgnoreCase("Stored"))
         {
             JOptionPane.showMessageDialog(null, "Order already shipped!");
             return;
         }
         
         if(request.getReceiver() == null)
         {
             JOptionPane.showMessageDialog(null, "Please assign the work request first");
            return;
             
         }
        
         OrderProcessing panel = new OrderProcessing(workContainer, request,manufacturer, business );
        workContainer.add("ProcessOrdersJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
        
        
    }//GEN-LAST:event_btnProcessOrdersActionPerformed

    private void btnRefresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefresh1ActionPerformed
        // TODO add your handling code here:
        populateProcessedOrderTable();
    }//GEN-LAST:event_btnRefresh1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnProcessOrders;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRefresh1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblOrdersFromDistributor;
    private javax.swing.JLabel lblProcessedOrders;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblorder;
    private javax.swing.JTable tblorderdone;
    // End of variables declaration//GEN-END:variables
}
