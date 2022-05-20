package Accessibility.GuiFiles;

import Accessibility.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class ModifyExamsForm extends javax.swing.JFrame {

    Teacher ourTeacher;

    public ModifyExamsForm(Teacher teacher) {
        initComponents();
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        ourTeacher = teacher;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEditExam = new javax.swing.JButton();
        btnAddExam = new javax.swing.JButton();
        btnDeleteExam = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEditExam.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnEditExam.setText("Edit Exam");
        btnEditExam.setName("btnEdit"); // NOI18N
        btnEditExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditExamActionPerformed(evt);
            }
        });

        btnAddExam.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnAddExam.setText("Add Exam");
        btnAddExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddExamActionPerformed(evt);
            }
        });

        btnDeleteExam.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnDeleteExam.setText("Delete Exam");
        btnDeleteExam.setToolTipText("");
        btnDeleteExam.setName("btnEdit"); // NOI18N
        btnDeleteExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteExamActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Exam Modifications");

        btnBack.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnAddExam, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnEditExam, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnDeleteExam))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditExam, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddExam, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteExam, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddExamActionPerformed

        new AddExamForm(ourTeacher).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnAddExamActionPerformed

    private void btnEditExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditExamActionPerformed

        new EditExamForm(ourTeacher).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnEditExamActionPerformed

    private void btnDeleteExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteExamActionPerformed

        new DeleteExamForm(ourTeacher).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnDeleteExamActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        new TeacherViewForm(ourTeacher).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddExam;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteExam;
    private javax.swing.JButton btnEditExam;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
