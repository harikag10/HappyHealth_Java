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
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author ikyathvarmadantuluri
 */
public class EnterpriseAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form MainAdminWorkArea
     */
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Enterprise enterprise;
    Network network;
    public EnterpriseAdminWorkAreaPanel(JPanel userProcessContainer, Enterprise enterprise, Network network,UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.network=network;
        //loginNode.setText(account.toString());
        //dateNode.setText("" + new Date());
        //populateTree();
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
        btnManageServices = new javax.swing.JButton();
        btnManageOrganizations = new javax.swing.JButton();
        btnManageEmployees = new javax.swing.JButton();
        btnManageRequests = new javax.swing.JButton();
        btnManageCredentials = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Admin Work Area");
        add(jLabel1);
        jLabel1.setBounds(690, 40, 380, 50);

        btnManageServices.setBackground(new java.awt.Color(0, 102, 102));
        btnManageServices.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageServices.setForeground(new java.awt.Color(0, 102, 102));
        btnManageServices.setText("Analysis");
        btnManageServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageServicesActionPerformed(evt);
            }
        });
        add(btnManageServices);
        btnManageServices.setBounds(580, 380, 220, 130);

        btnManageOrganizations.setBackground(new java.awt.Color(0, 102, 102));
        btnManageOrganizations.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageOrganizations.setForeground(new java.awt.Color(0, 102, 102));
        btnManageOrganizations.setText("Manage Organizations");
        btnManageOrganizations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationsActionPerformed(evt);
            }
        });
        add(btnManageOrganizations);
        btnManageOrganizations.setBounds(120, 190, 220, 130);

        btnManageEmployees.setBackground(new java.awt.Color(0, 102, 102));
        btnManageEmployees.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageEmployees.setForeground(new java.awt.Color(0, 102, 102));
        btnManageEmployees.setText("Manage Employees");
        btnManageEmployees.setPreferredSize(new java.awt.Dimension(185, 25));
        btnManageEmployees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeesActionPerformed(evt);
            }
        });
        add(btnManageEmployees);
        btnManageEmployees.setBounds(410, 190, 230, 130);

        btnManageRequests.setBackground(new java.awt.Color(0, 102, 102));
        btnManageRequests.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageRequests.setForeground(new java.awt.Color(0, 102, 102));
        btnManageRequests.setText("Manage Requests");
        btnManageRequests.setMaximumSize(new java.awt.Dimension(185, 25));
        btnManageRequests.setMinimumSize(new java.awt.Dimension(185, 25));
        btnManageRequests.setPreferredSize(new java.awt.Dimension(185, 25));
        btnManageRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequestsActionPerformed(evt);
            }
        });
        add(btnManageRequests);
        btnManageRequests.setBounds(700, 190, 220, 130);

        btnManageCredentials.setBackground(new java.awt.Color(0, 102, 102));
        btnManageCredentials.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnManageCredentials.setForeground(new java.awt.Color(0, 102, 102));
        btnManageCredentials.setText("Manage Credentials");
        btnManageCredentials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCredentialsActionPerformed(evt);
            }
        });
        add(btnManageCredentials);
        btnManageCredentials.setBounds(260, 380, 220, 130);
        add(jLabel2);
        jLabel2.setBounds(540, 170, 130, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Health Services.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1600, 1200);
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageServicesActionPerformed
        // TODO add your handling code here:
        ManageRequestServicesJPanel manageRequestServicesJPanel = new ManageRequestServicesJPanel(userProcessContainer, enterprise, network, userAccount, ecosystem);
        userProcessContainer.add("RequestServicesJPanel", manageRequestServicesJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageServicesActionPerformed

    private void btnManageEmployeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeesActionPerformed
        // TODO add your handling code here:
        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmployeesActionPerformed

    private void btnManageRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequestsActionPerformed
        // TODO add your handling code here:
        if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Hospital")){
            
            
        HospitalViewServicesJPanel viewservicesJPanel = new HospitalViewServicesJPanel( userProcessContainer,  enterprise,  network, userAccount, ecosystem);
        userProcessContainer.add("manageServicesReceived", viewservicesJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
        else if(enterprise.getEnterpriseType().getValue().equalsIgnoreCase("Pharmacy")){
            
            
        PharmacyViewServicesJPanel viewservicesJPanel = new PharmacyViewServicesJPanel( userProcessContainer,  enterprise,  network, userAccount, ecosystem);
        userProcessContainer.add("manageServicesReceived", viewservicesJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        
        
    }//GEN-LAST:event_btnManageRequestsActionPerformed

    private void btnManageCredentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCredentialsActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel manageUserAccountJPanel = new ManageUserAccountJPanel(userProcessContainer, enterprise, userAccount);
        userProcessContainer.add("ManageUserAccountJPanel", manageUserAccountJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManageCredentialsActionPerformed

    private void btnManageOrganizationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationsActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer,enterprise.getEnterpriseType().getValue(), enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCredentials;
    private javax.swing.JButton btnManageEmployees;
    private javax.swing.JButton btnManageOrganizations;
    private javax.swing.JButton btnManageRequests;
    private javax.swing.JButton btnManageServices;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
