/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.governmentAdminRole;

import business.event.Event;
import business.project.Project;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hardik
 */
public class HandleEventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HandleEventJPanel
     */
    private JPanel userProcessContainer;
    private Event event;

    public HandleEventJPanel() {
        initComponents();
    }

    public HandleEventJPanel(JPanel userProcessContainer, Event event) {
        this();
        this.userProcessContainer = userProcessContainer;
        this.event = event;

        approvalCount.setText(String.valueOf(event.getApprovalCount()));
        float approvalRate = (float) event.getApprovalCount() / event.getAccountDirectory().getAccountDirectory().size();
        approvalPercentage.setText(String.valueOf(approvalRate * 100));
        if (approvalRate >= 0.6) {
            approveButton.setEnabled(true);
        }
        System.out.println(approvalRate);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        approveButton = new javax.swing.JButton();
        rejectButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        approvalPercentage = new javax.swing.JLabel();
        approvalCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        approveButton.setBackground(new java.awt.Color(153, 51, 0));
        approveButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        approveButton.setForeground(new java.awt.Color(255, 255, 255));
        approveButton.setText("Approve");
        approveButton.setEnabled(false);
        approveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approveButtonMouseClicked(evt);
            }
        });
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        rejectButton.setBackground(new java.awt.Color(153, 51, 0));
        rejectButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        rejectButton.setForeground(new java.awt.Color(255, 255, 255));
        rejectButton.setText("Reject");
        rejectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rejectButtonMouseClicked(evt);
            }
        });
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(153, 51, 0));
        backButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<< Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        approvalPercentage.setText("0");

        approvalCount.setText("0");

        jLabel1.setText("Approval Count");

        jLabel2.setText("Approval % (60 needed)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Manage Event");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(226, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(approvalPercentage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(approvalCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(approveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approvalCount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approvalPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        GovernmentAdminWorkAreaJPanel gawajp = (GovernmentAdminWorkAreaJPanel) userProcessContainer.getComponent(userProcessContainer.getComponentCount() - 1);
        gawajp.populateEventTable();
        gawajp.populateRequestTable();
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backButtonMouseClicked

    private void rejectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rejectButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rejectButtonMouseClicked

    private void approveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveButtonMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_approveButtonMouseClicked

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed
        // TODO add your handling code here:
        event.getProject().setProjectStatus(Project.ProjectStatus.APPROVED);
        rejectButton.setEnabled(false);
        approveButton.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Project has been approved!!");
    }//GEN-LAST:event_approveButtonActionPerformed

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        // TODO add your handling code here:
        event.getProject().setProjectStatus(Project.ProjectStatus.REJECTED);
        event.getProject().getBuilding().setWorkInProgress(false);
        rejectButton.setEnabled(false);
        approveButton.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Project has been rejected!!");
    }//GEN-LAST:event_rejectButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel approvalCount;
    private javax.swing.JLabel approvalPercentage;
    private javax.swing.JButton approveButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton rejectButton;
    // End of variables declaration//GEN-END:variables
}
