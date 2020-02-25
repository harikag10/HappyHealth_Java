/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManageEnterpriseAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.StaffWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ikyathvarmadantuluri
 */
public class ViewStaffRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewStaffRequestsJPanel
     */
    private EcoSystem system;
    private Network network;
    private JPanel userProcessContainer;
    ViewStaffRequestsJPanel(JPanel userProcessContainer, Enterprise enterprise, Network network, UserAccount userAccount, EcoSystem system) {
         initComponents();
         this.system=system;
         this.network=network;
         this.userProcessContainer=userProcessContainer;
         populateRequestTable();
         
    }
    
    public void populateRequestTable() {
        //System.out.println("Testing123");
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {
            if (request instanceof PharmacyWorkRequest && request.getActiveLead().equalsIgnoreCase("Staff")) {
                Object[] row = new Object[8];
                row[0] = ((PharmacyWorkRequest) request).getDrugName();
                row[1] = ((PharmacyWorkRequest) request).getDrugQuantity();
                row[2] = ((PharmacyWorkRequest) request).getSender();
                row[3] = ((PharmacyWorkRequest) request).getReceiver();
                row[4] = ((PharmacyWorkRequest) request).getRequestDate();
                row[5] = ((PharmacyWorkRequest) request).getResolveDate();
                row[6] = ((PharmacyWorkRequest) request).getStatus();
                /* String result = ((StaffWorkRequest) request).getTestResult();
                 row[3] = result == null ? "Waiting" : result;
                 */
                
                model.addRow(row);
            }
        
    }}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(null);

        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 102, 102));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Back.PNG"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(12, 13, 67, 60);

        enterpriseLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel1.setText("Request for Medicines by Hospital Staff");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(290, 240, 780, 80);

        workRequestJTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Drug Name", "Drug Quantity", "Sender", "Receiver", "Requested Date", "Accepted Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(131, 378, 980, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Health Services.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(0, -10, 1600, 1220);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
