/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Admin;

import business.enterprise.AmenitiesEnterprise;
import business.enterprise.ConstructionEnterprise;
import business.enterprise.Enterprise;
import business.organization.Organization;
import business.organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shruti
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;

    public ManageOrganizationJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        populateOrganizationTable();
        populateOrganizationComboBox();
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
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        deleteOrganizationBttn = new javax.swing.JButton();
        addOrganizationBttn = new javax.swing.JButton();
        backBttn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Organization");

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Organization Type ");

        deleteOrganizationBttn.setBackground(new java.awt.Color(153, 51, 0));
        deleteOrganizationBttn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteOrganizationBttn.setForeground(new java.awt.Color(255, 255, 255));
        deleteOrganizationBttn.setText("Delete Organization");
        deleteOrganizationBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteOrganizationBttnMouseClicked(evt);
            }
        });
        deleteOrganizationBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrganizationBttnActionPerformed(evt);
            }
        });

        addOrganizationBttn.setBackground(new java.awt.Color(153, 51, 0));
        addOrganizationBttn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addOrganizationBttn.setForeground(new java.awt.Color(255, 255, 255));
        addOrganizationBttn.setText("Add Organization");
        addOrganizationBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOrganizationBttnMouseClicked(evt);
            }
        });
        addOrganizationBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrganizationBttnActionPerformed(evt);
            }
        });

        backBttn.setBackground(new java.awt.Color(153, 51, 0));
        backBttn.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        backBttn.setForeground(new java.awt.Color(255, 255, 255));
        backBttn.setText("<< Back");
        backBttn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBttnMouseClicked(evt);
            }
        });
        backBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(deleteOrganizationBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addOrganizationBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(backBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(387, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteOrganizationBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addOrganizationBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(backBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteOrganizationBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteOrganizationBttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteOrganizationBttnMouseClicked

    private void deleteOrganizationBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrganizationBttnActionPerformed
        // TODO add your handling code here:
        int selectedRow = organizationJTable.getSelectedRow();
        int pic = JOptionPane.ERROR_MESSAGE;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an organization to delete", "", pic);
        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the Organization", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Organization organization = (Organization) organizationJTable.getValueAt(selectedRow, 1);
                enterprise.getOrganizationDirectory().removeOrganization(organization);
                JOptionPane.showMessageDialog(null, "Organization Deleted Successfully");
                populateOrganizationTable();
            }
        }
    }//GEN-LAST:event_deleteOrganizationBttnActionPerformed

    private void addOrganizationBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOrganizationBttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addOrganizationBttnMouseClicked

    private void addOrganizationBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrganizationBttnActionPerformed
        // TODO add your handling code here:
        Organization.OrganizationType type = (Organization.OrganizationType) organizationJComboBox.getSelectedItem();
        enterprise.getOrganizationDirectory().addOrganization(type.getValue(), type);
        populateOrganizationTable();
        JOptionPane.showMessageDialog(null, "Organization Added Successfully");
    }//GEN-LAST:event_addOrganizationBttnActionPerformed

    private void backBttnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBttnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backBttnMouseClicked

    private void backBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBttnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBttnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrganizationBttn;
    private javax.swing.JButton backBttn;
    private javax.swing.JButton deleteOrganizationBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables

    private void populateOrganizationTable() {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationDirectory()) {
            Object[] row = new Object[2];
            row[0] = organization.getId();
            row[1] = organization;
            model.addRow(row);
        }
    }

    private void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        if(enterprise instanceof ConstructionEnterprise){
            organizationJComboBox.addItem(Organization.OrganizationType.CONSTRUCTIONADMIN);
        }else if(enterprise instanceof AmenitiesEnterprise){
            organizationJComboBox.addItem(Organization.OrganizationType.PLUMBER);
            organizationJComboBox.addItem(Organization.OrganizationType.ELECTRICIAN);
            organizationJComboBox.addItem(Organization.OrganizationType.TRANSPORT);
            organizationJComboBox.addItem(Organization.OrganizationType.SEWAGE);
        }
    }
}