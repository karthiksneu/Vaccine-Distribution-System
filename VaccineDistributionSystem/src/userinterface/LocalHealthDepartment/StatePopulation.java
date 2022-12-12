/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userinterface.LocalHealthDepartment;

import TheBusiness.Network.StateNetwork;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dsouza
 */
public class StatePopulation extends javax.swing.JPanel {

  
    private JPanel workContainer;
    private StateNetwork state;
    
    public StatePopulation(JPanel workContainer, StateNetwork state) {
        initComponents();
        this.workContainer = workContainer;
        this.state = state;
        
        txtCurrentPopulation.setText(String.valueOf(state.getStatePopulation()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStatePopulation = new javax.swing.JLabel();
        lblCurrentPopulation = new javax.swing.JLabel();
        txtCurrentPopulation = new javax.swing.JTextField();
        lblUpdatePopulation = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCurrentPopulation2 = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        lblStatePopulation.setFont(new java.awt.Font("October Compressed Devanagari", 1, 24)); // NOI18N
        lblStatePopulation.setForeground(new java.awt.Color(255, 255, 255));
        lblStatePopulation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatePopulation.setText("State Population");

        lblCurrentPopulation.setFont(new java.awt.Font("October Compressed Devanagari", 1, 14)); // NOI18N
        lblCurrentPopulation.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentPopulation.setText("Current Population :");

        txtCurrentPopulation.setEnabled(false);
        txtCurrentPopulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurrentPopulationActionPerformed(evt);
            }
        });

        lblUpdatePopulation.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        lblUpdatePopulation.setForeground(new java.awt.Color(255, 255, 255));
        lblUpdatePopulation.setText("Update Population:");

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setFont(new java.awt.Font("October Compressed Devanagari", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/ICONS/11122021icons/population_900x350.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatePopulation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCurrentPopulation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCurrentPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblUpdatePopulation)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCurrentPopulation2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdate)))
                        .addGap(0, 636, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 984, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatePopulation)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPopulation)
                    .addComponent(txtCurrentPopulation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUpdatePopulation)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurrentPopulation2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCurrentPopulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurrentPopulationActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_txtCurrentPopulationActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
            int oldPopulation = state.getStatePopulation();
            int oldVaccineLeft = state.getVaccinesLeftForState();
           
        int population = Integer.parseInt(txtCurrentPopulation2.getText());
        state.setStatePopulation(population);
        
        int populationChange = oldPopulation - population;
        if(populationChange>=0)
        {
            state.setVaccinesLeftForState(oldVaccineLeft+populationChange);
        }
        else
        {
            state.setVaccinesLeftForState(population-oldPopulation+oldVaccineLeft);
        }
        
        
        txtCurrentPopulation.setText(String.valueOf(state.getStatePopulation()));
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please enter numeric Value");
            return;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblCurrentPopulation;
    private javax.swing.JLabel lblStatePopulation;
    private javax.swing.JLabel lblUpdatePopulation;
    private javax.swing.JTextField txtCurrentPopulation;
    private javax.swing.JTextField txtCurrentPopulation2;
    // End of variables declaration//GEN-END:variables
}