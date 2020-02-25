/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.InHomePatient.InHomePatient;
import Business.Network.Network;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DeliveryWorkRequest;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Harika
 */
public class DeliveryWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private DeliveryOrganization organization;
    private String drugName;
    private Enterprise enterprise;
    private InHomePatient inHomePatient;
    private Network network;
    private int drugQuantity;
    
    
Random r = new Random();
int low = 1111;
int high = 3333333;
int result = r.nextInt(high-low) + low;

    public DeliveryWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.system = system;
        this.organization = (DeliveryOrganization) organization;
        this.enterprise=enterprise;
        this.network=network;

        populateTable();

        valueLabel.setText(userAccount.toString());
        jDateChooser.getJCalendar().setMinSelectableDate(new Date());
        
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {
            
            if(request.getActiveLead().equalsIgnoreCase("Delivery") && network.getName().equalsIgnoreCase(request.getCity())){
            Object[] row = new Object[7];
            row[0] = request.getSender();
            row[1] = request.getRequestDate();
            row[2] = request.getResolveDate();
            row[3] = request.getFollow();
            row[4] = request;
            if(request.getInhomepatient()!= null){
                row[5] = request.getInhomepatient().getAddress();
            }
            else{
                row[5] = request.getCity();
            }
            //row[6] = request.getDrugQuantity();

            model.addRow(row);
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

        enterpriseLabel1 = new javax.swing.JLabel();
        deliveryLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        valueLabel = new javax.swing.JLabel();
        datePickerLabel = new javax.swing.JLabel();
        acknowledgeBtn = new javax.swing.JButton();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 102));
        setLayout(null);

        enterpriseLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(0, 102, 102));
        enterpriseLabel1.setText("Delivery Services Work Area");
        add(enterpriseLabel1);
        enterpriseLabel1.setBounds(427, 35, 531, 83);

        deliveryLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        deliveryLabel.setForeground(new java.awt.Color(0, 102, 102));
        deliveryLabel.setText("Delivery ");
        add(deliveryLabel);
        deliveryLabel.setBounds(90, 160, 127, 19);

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Pharmacist", "Requested Date", "Accepted Date", "Status", "Medicine", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(90, 199, 935, 136);

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(0, 102, 102));
        valueLabel.setText("<value>");
        add(valueLabel);
        valueLabel.setBounds(280, 150, 330, 30);

        datePickerLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        datePickerLabel.setForeground(new java.awt.Color(0, 102, 102));
        datePickerLabel.setText("Estimated date of delivery* :");
        add(datePickerLabel);
        datePickerLabel.setBounds(90, 380, 210, 60);

        acknowledgeBtn.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        acknowledgeBtn.setForeground(new java.awt.Color(0, 102, 102));
        acknowledgeBtn.setText("Send Acknowledgment");
        acknowledgeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acknowledgeBtnActionPerformed(evt);
            }
        });
        add(acknowledgeBtn);
        acknowledgeBtn.setBounds(190, 450, 183, 27);

        jDateChooser.setForeground(new java.awt.Color(0, 102, 102));
        add(jDateChooser);
        jDateChooser.setBounds(320, 400, 190, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Icons/Med delivery.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 1600, 1200);
    }// </editor-fold>//GEN-END:initComponents

    private void acknowledgeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acknowledgeBtnActionPerformed
        
        if (jDateChooser.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Please select estimated date to acknowledge");
        } else {
            int selectedRow = workRequestJTable.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Please select a row");
                return;
            }

            PharmacyWorkRequest request = (PharmacyWorkRequest) workRequestJTable.getValueAt(selectedRow, 4);
            String email;
            if(request.getInhomepatient()!= null){
               email = request.getInhomepatient().getUserLoginName(); 
            }
            else{
                email = workRequestJTable.getValueAt(selectedRow, 0).toString();
            }
                        
            if (request.getStatus().equalsIgnoreCase("Delivery Accepted")) {

                JOptionPane.showMessageDialog(null, "Request already acknowledged");
            } else {
                request.setReceiver(userAccount);
                request.setStatus("Delivery Accepted");
                request.setFollow("Shipped");
                request.setResolveDate(new Date());
                System.out.println("expected delivery"+jDateChooser.getDate());
                request.setExpectedDeliveryDate(jDateChooser.getDate());
                drugName = request.getDrugName();
                drugQuantity = request.getDrugQuantity();
                request.setDrugName(drugName);
                request.setDrugQuantity(drugQuantity);
                System.out.println(request);
                populateTable();
            }
       
       String to = email;
       String from = "HappyHealthnoreply";
       String host = "smtp.gmail.com";
       Properties props = new Properties();
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.starttls.enable", "true");
       props.put("mail.smtp.host", host);
       props.put("mail.smtp.port", "587");
       props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
       Session session = Session.getInstance(props,
               new javax.mail.Authenticator() {
           protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
               return new javax.mail.PasswordAuthentication("happyhealthnoreply", "happyhealth@123");
           }
       }
       );
       try {
           MimeMessage message = new MimeMessage(session);
           message.setFrom(new InternetAddress(from));
           message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
           message.setSubject("--STATUS-- for Order " + result);
           message.setText("HELLO " + "\n\nMedicines Order Delivery Initiated"+"\nMedicine Name: "  +drugName+ "\n\nThe request is estimated to be delivered by " + jDateChooser.getDate() + "\n\n\n\n**This is an automated message please do not reply**");

           javax.mail.Transport.send(message);
           JOptionPane.showMessageDialog(null, "The message has been sent " );
           System.out.println("Message "+message.getSubject());

       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
           System.out.println("Message exception ");
       }
        }
        populateTable();
           
    }//GEN-LAST:event_acknowledgeBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acknowledgeBtn;
    private javax.swing.JLabel datePickerLabel;
    private javax.swing.JLabel deliveryLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
