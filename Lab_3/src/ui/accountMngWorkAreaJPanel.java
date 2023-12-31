/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import buisness.accountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class accountMngWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form accountMngWorkAreaJPanel
     */
    
    private JPanel displayJPanel;
    private accountDirectory AccountDirectory;

    accountMngWorkAreaJPanel(JPanel displayJPanel, accountDirectory AccountDirectory) {
        initComponents();
        
        this.AccountDirectory = AccountDirectory;
        this.displayJPanel = displayJPanel;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateAccount = new javax.swing.JButton();
        btnManageAccount = new javax.swing.JButton();

        btnCreateAccount.setText("Create Account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        btnManageAccount.setText("Manage Account");
        btnManageAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageAccount)
                    .addComponent(btnCreateAccount))
                .addContainerGap(581, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnCreateAccount)
                .addGap(40, 40, 40)
                .addComponent(btnManageAccount)
                .addContainerGap(313, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        
        createAccountJPanel panel = new createAccountJPanel(displayJPanel, AccountDirectory);
        displayJPanel.add("createAccountJPanel" , panel);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.next(displayJPanel);
        
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    private void btnManageAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAccountActionPerformed
        // TODO add your handling code here:
        
        manageAccountJPanel panel = new manageAccountJPanel(displayJPanel, AccountDirectory);
        displayJPanel.add("manageAccountJPanel" , panel);
        CardLayout layout = (CardLayout) displayJPanel.getLayout();
        layout.next(displayJPanel);
        
    }//GEN-LAST:event_btnManageAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnManageAccount;
    // End of variables declaration//GEN-END:variables
}
