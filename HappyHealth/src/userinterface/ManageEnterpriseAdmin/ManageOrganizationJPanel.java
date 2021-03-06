/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ManageEnterpriseAdmin;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mounica Dantuluri
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private String value;
    private OrganizationDirectory organizationDirectory;

    ManageOrganizationJPanel(JPanel userProcessContainer, String value, OrganizationDirectory organizationDirectory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.value=value;
        this.organizationDirectory=organizationDirectory;
        
        populateTable();
        populateCombo();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        organizationJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        btnCreateOrganization = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Manage Organization");
        add(jLabel1);
        jLabel1.setBounds(578, 13, 380, 47);

        jScrollPane1.setForeground(new java.awt.Color(0, 102, 102));

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Organization"
            }
        ));
        jScrollPane1.setViewportView(organizationJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(200, 168, 442, 277);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Organization Type");
        add(jLabel2);
        jLabel2.setBounds(200, 473, 154, 29);

        organizationJComboBox.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        organizationJComboBox.setForeground(new java.awt.Color(0, 102, 102));
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox);
        organizationJComboBox.setBounds(395, 476, 154, 27);

        btnCreateOrganization.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnCreateOrganization.setForeground(new java.awt.Color(0, 102, 102));
        btnCreateOrganization.setText("Create Organization");
        btnCreateOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrganizationActionPerformed(evt);
            }
        });
        add(btnCreateOrganization);
        btnCreateOrganization.setBounds(170, 550, 171, 25);

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Back.PNG"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(12, 13, 68, 60);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Delete Organization");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(410, 550, 194, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Health Services.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 1600, 1200);
    }// </editor-fold>//GEN-END:initComponents

    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        if((value.equalsIgnoreCase("Hospital"))){
            
           for (Organization.Type type : Organization.Type.values()){
            if ((type.getValue().equals(Organization.Type.Doctor.getValue())) || (type.getValue().equals(Organization.Type.CareTaker.getValue())) || (type.getValue().equals(Organization.Type.Staff.getValue()))){
                organizationJComboBox.addItem(type); 
        }
        }
            }
            
        else if((value.equalsIgnoreCase("Pharmacy"))){
           for (Organization.Type type : Organization.Type.values()){
            if ((type.getValue().equals(Organization.Type.Delivery.getValue())) || (type.getValue().equals(Organization.Type.Pharmacist.getValue())) ){
                organizationJComboBox.addItem(type); 
            }
        }
        }
      
    }
    
    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : organizationDirectory.getOrganizationList()){
            Object[] row = new Object[1];
            //row[0] = organization.getOrganizationID();
            row[0] = organization;
            
            model.addRow(row);
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrganizationActionPerformed
        // TODO add your handling code here:
        Organization.Type type = (Organization.Type) organizationJComboBox.getSelectedItem();
        int rowCount = organizationJTable.getRowCount();
        int colCount = organizationJTable.getColumnCount();
        List <String> OrgList= new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++){
                OrgList.add(organizationJTable.getValueAt(i, j).toString());
                }
        }
        if (OrgList.contains(type.toString()+" Organization")) {
                JOptionPane.showMessageDialog(null,"Organization type already added !");
                return;
            }
        else{
            organizationDirectory.createOrganization(type);
            populateTable();
        }
        
    }//GEN-LAST:event_btnCreateOrganizationActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        Organization organization = (Organization) organizationJTable.getValueAt(selectedRow,0);
        organizationDirectory.getOrganizationList().remove(organization);
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateOrganization;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
