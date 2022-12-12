/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.Distributor;

import TheBusiness.Enterprise.Enterprise;
import TheBusiness.Organization.DistributorOrganization;
import TheBusiness.Organization.Organization;
import TheBusiness.WorkOrderQueue.OrderVaccineWorkRequest;
import TheBusiness.WorkOrderQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author soham
 */
public class OrderManagementFromManufacturer extends javax.swing.JPanel {

     private JPanel workContainer;
    private Enterprise enterprise;
    private DistributorOrganization distributorOrganization;
    
    public OrderManagementFromManufacturer(JPanel workContainer,Enterprise enterprise, DistributorOrganization distributorOrganization) {
        initComponents();
        this.workContainer = workContainer;
        this.enterprise = enterprise;
        this.distributorOrganization = distributorOrganization;
        populateOrderTable();
        
    }
    
    private void populateOrderTable(){
        
         DefaultTableModel defaulttabelmodel = (DefaultTableModel) tblmanorder.getModel();
        defaulttabelmodel.setRowCount(0);
         
         DistributorOrganization distOrg = null;
        for(Organization org : enterprise.getOrganizationDirectory().getOrganizationList())
        {   if(org instanceof DistributorOrganization)
        {   distOrg = (DistributorOrganization)org;
            for(WorkRequest workRequest : distOrg.getWorkQueue().getWorkRequestList())
            {   
                if(workRequest instanceof OrderVaccineWorkRequest)
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblReceivedShipments = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblmanorder = new javax.swing.JTable();
        btnStoreVaccine = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(70, 130, 180));

        lblTitle.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Orders from Manufacturers");

        lblReceivedShipments.setFont(new java.awt.Font("October Compressed Devanagari", 0, 14)); // NOI18N
        lblReceivedShipments.setForeground(new java.awt.Color(255, 255, 255));
        lblReceivedShipments.setText("Received Shipments:");

        tblmanorder.setModel(new javax.swing.table.DefaultTableModel(
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
        tblmanorder.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblmanorder);

        btnStoreVaccine.setBackground(new java.awt.Color(0, 0, 0));
        btnStoreVaccine.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnStoreVaccine.setForeground(new java.awt.Color(255, 255, 255));
        btnStoreVaccine.setText("Store Vaccines");
        btnStoreVaccine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStoreVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreVaccineActionPerformed(evt);
            }
        });

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/003.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblReceivedShipments)
                            .addComponent(btnStoreVaccine))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRefresh)
                        .addGap(18, 18, 18)))
                .addComponent(lblReceivedShipments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStoreVaccine)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStoreVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreVaccineActionPerformed
        // TODO add your handling code here:
        
        int row = tblmanorder.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Kindly select a Order from table");
            return;
        }
        
        OrderVaccineWorkRequest wr = (OrderVaccineWorkRequest)tblmanorder.getValueAt(row, 0);
        if(wr.getStatus().equalsIgnoreCase("Order Stored")) {
            JOptionPane.showMessageDialog(null, "Order already Stored");
            return;
        }

        VaccineStorage panel = new VaccineStorage(workContainer, enterprise, distributorOrganization, wr);
        workContainer.add("ManageOrdersfromManufacturerJPanel", panel);
        CardLayout layout = (CardLayout)workContainer.getLayout();
        layout.next(workContainer);
    }//GEN-LAST:event_btnStoreVaccineActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateOrderTable();
        
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnStoreVaccine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblReceivedShipments;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblmanorder;
    // End of variables declaration//GEN-END:variables
}
