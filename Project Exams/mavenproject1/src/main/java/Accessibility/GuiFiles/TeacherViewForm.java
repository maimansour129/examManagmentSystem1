package Accessibility.GuiFiles;

import Accessibility.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class TeacherViewForm extends javax.swing.JFrame {

    Teacher ourTeacher;

    public TeacherViewForm(Teacher teacher) {
        initComponents();
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        ourTeacher = teacher;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssign = new javax.swing.JButton();
        btnCheck = new javax.swing.JButton();
        btnIssuing = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnModifyExam = new javax.swing.JButton();
        btnExamAssign = new javax.swing.JButton();
        btnMarkExam = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnViewSchedule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAssign.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnAssign.setText("Assign Assignment");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnCheck.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnCheck.setText("Check Student Grades");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        btnIssuing.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnIssuing.setText("Issueing Report");
        btnIssuing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssuingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Welcome Mr. Variable");

        btnModifyExam.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnModifyExam.setText("Modify Exams");
        btnModifyExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyExamActionPerformed(evt);
            }
        });

        btnExamAssign.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnExamAssign.setText("Assign exam");
        btnExamAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExamAssignActionPerformed(evt);
            }
        });

        btnMarkExam.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnMarkExam.setText("Mark Exam");
        btnMarkExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkExamActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnViewSchedule.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnViewSchedule.setText("View Schedule");
        btnViewSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnExamAssign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAssign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModifyExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIssuing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMarkExam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyExam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIssuing, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExamAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMarkExam, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnViewSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        new AssignAssignment(ourTeacher).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed

        new TeacherCheckGrades(ourTeacher).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnIssuingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssuingActionPerformed

    }//GEN-LAST:event_btnIssuingActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        jLabel1.setText("Welcome " + ourTeacher.getName());
    }//GEN-LAST:event_formWindowOpened

    private void btnModifyExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyExamActionPerformed

        new ModifyExamsForm((ourTeacher)).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnModifyExamActionPerformed

    private void btnExamAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExamAssignActionPerformed

        new AssignExamForm((ourTeacher)).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnExamAssignActionPerformed

    private void btnMarkExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkExamActionPerformed
        new MarkExamForm(ourTeacher).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnMarkExamActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LoginForm().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Principle p = Principle.getPrinciple();
        Principle.savePrinciple(p);
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnViewScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewScheduleActionPerformed
        new ViewTeacherSchedule(ourTeacher).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnViewScheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnExamAssign;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIssuing;
    private javax.swing.JButton btnMarkExam;
    private javax.swing.JButton btnModifyExam;
    private javax.swing.JButton btnViewSchedule;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
