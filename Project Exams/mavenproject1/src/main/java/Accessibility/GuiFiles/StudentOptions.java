
package Accessibility.GuiFiles;

import Accessibility.*;
import java.awt.Dimension;
import java.awt.Toolkit;



public class StudentOptions extends javax.swing.JFrame {
    
    Student ourStudent;
    Principle ourPrinciple;

    public StudentOptions(Student student) {
        initComponents();
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        ourStudent = student;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        btn_messagePrinciple = new javax.swing.JButton();
        cmb_subjectname = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn_gotosubject = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnShowReport = new javax.swing.JButton();
        btnViewSchedule = new javax.swing.JButton();
        btnShowNotification = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton2.setText("Edit Personal Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_messagePrinciple.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btn_messagePrinciple.setText("Message Principle");
        btn_messagePrinciple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_messagePrincipleMousePressed(evt);
            }
        });
        btn_messagePrinciple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_messagePrincipleActionPerformed(evt);
            }
        });

        cmb_subjectname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmb_subjectname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        jLabel2.setText("Choose Subject");

        btn_gotosubject.setFont(new java.awt.Font("Dialog", 3, 16)); // NOI18N
        btn_gotosubject.setText("Go To Subject");
        btn_gotosubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gotosubjectActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jButton1.setText("Save And Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnShowReport.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnShowReport.setText("Show Reports");
        btnShowReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowReportActionPerformed(evt);
            }
        });

        btnViewSchedule.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnViewSchedule.setText("View Schedule");
        btnViewSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewScheduleActionPerformed(evt);
            }
        });

        btnShowNotification.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnShowNotification.setText("Show Notifications");
        btnShowNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowNotificationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_messagePrinciple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnViewSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowReport, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(btnShowNotification)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(cmb_subjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btn_gotosubject, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_subjectname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_gotosubject, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowReport, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_messagePrinciple, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnShowNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        new EditStudentData(ourStudent).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_gotosubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gotosubjectActionPerformed
        
        new GoToSubject(ourStudent, cmb_subjectname.getSelectedItem().toString()).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btn_gotosubjectActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cmb_subjectname.removeAllItems();
        for (String s : ourStudent.getSubjects()) {
            cmb_subjectname.addItem(s);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        new LoginForm().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_messagePrincipleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_messagePrincipleMousePressed

    }//GEN-LAST:event_btn_messagePrincipleMousePressed

    private void btn_messagePrincipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_messagePrincipleActionPerformed
        
        new MessagePrinciple(ourStudent).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_messagePrincipleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Principle p = Principle.getPrinciple();
        Principle.savePrinciple(p);
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnShowReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowReportActionPerformed

        new StudentReport(ourStudent).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnShowReportActionPerformed

    private void btnViewScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewScheduleActionPerformed
        new ViewStudentSchedule(ourStudent).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewScheduleActionPerformed

    private void btnShowNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowNotificationActionPerformed
        // TODO add your handling code here:
        new ShowNotifications(ourStudent).setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnShowNotificationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowNotification;
    private javax.swing.JButton btnShowReport;
    private javax.swing.JButton btnViewSchedule;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_gotosubject;
    private javax.swing.JButton btn_messagePrinciple;
    private javax.swing.JComboBox<String> cmb_subjectname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
