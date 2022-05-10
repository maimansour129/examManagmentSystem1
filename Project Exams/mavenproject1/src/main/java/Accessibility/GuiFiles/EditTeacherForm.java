package Accessibility.GuiFiles;

import javax.swing.JOptionPane;
import Accessibility.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class EditTeacherForm extends javax.swing.JFrame {

    Teacher teacher;
    int classID;
    String gradeYear;

    Principle ourPrinciple = Principle.getPrinciple();

    public EditTeacherForm(Teacher teacher) {

        initComponents();
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.teacher = teacher;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cmbClassID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbGradeYear = new javax.swing.JComboBox<>();
        btnEditTeacher = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        cmbSubjects = new javax.swing.JComboBox<>();
        checkBoxTeachingDetails = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Teacher Username:");

        txtName.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        cmbClassID.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbClassID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassIDActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Assign Grade Year:");

        cmbGradeYear.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbGradeYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGradeYearItemStateChanged(evt);
            }
        });

        btnEditTeacher.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnEditTeacher.setText("Save");
        btnEditTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditTeacherActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Assigned Class ID:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setText("Teacher Password:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Teacher Name:");

        lblSubject.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblSubject.setText("Teacher Subject: (subject)");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Edit Teacher Information");

        btnBack.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        checkBoxTeachingDetails.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        checkBoxTeachingDetails.setText("Change Teaching Details");
        checkBoxTeachingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxTeachingDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSubject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cmbClassID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(checkBoxTeachingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(cmbGradeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnEditTeacher)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(checkBoxTeachingDetails)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbGradeYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbClassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubject)
                    .addComponent(cmbSubjects))
                .addGap(18, 18, 18)
                .addComponent(btnEditTeacher)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditTeacherActionPerformed


        if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please Write All Teacher Information First");
        } else {

            if (!txtName.getText().equals(teacher.getName())) {
                teacher.setName(txtName.getText());
            }
            if (!txtUsername.getText().equals(teacher.getUsername())) {
                teacher.setUsername(txtUsername.getText());
            }
            if (!txtPassword.getText().equals(teacher.getPassword())) {
                teacher.setPassword(txtPassword.getText());
            }

            if (checkBoxTeachingDetails.isSelected()) {

                //subject changing
                if (!cmbSubjects.getSelectedItem().toString().equals(teacher.getSubjectEnrolled().getName())) {
                    for (Subject s : ourPrinciple.getSubjects().get(gradeYear)) {
                        if (s.getName().equals(cmbSubjects.getSelectedItem().toString())) {
                            teacher.setSubjectEnrolled(s);
                        }
                    }
                }

                //Class changing
                for (ClassSchool i : ourPrinciple.getClasses()) {
                    if (cmbGradeYear.getSelectedItem().toString().equals(i.getYear()) && cmbClassID.getSelectedItem().toString().equals(Integer.toString(i.getClassID()))) {
                        teacher.getAssignedClasses().add(i);
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Teacher Information Edited Succesfully");

            new ModifyTeacherView().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnEditTeacherActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        //txtName.set
        txtName.setText(teacher.getName());
        txtUsername.setText(teacher.getUsername());
        txtPassword.setText(teacher.getPassword());
        lblSubject.setText("Teacher Subject: ( " + teacher.getSubjectEnrolled().getName() + " )");

        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        lblSubject.setVisible(false);
        cmbClassID.setVisible(false);
        cmbGradeYear.setVisible(false);
        cmbSubjects.setVisible(false);

        cmbGradeYear.removeAllItems();
        cmbClassID.removeAllItems();

        cmbGradeYear.removeAllItems();
        cmbGradeYear.addItem("one");
        cmbGradeYear.addItem("two");
        cmbGradeYear.addItem("three");
        cmbGradeYear.addItem("four");

    }//GEN-LAST:event_formWindowOpened

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        new ModifyTeacherView().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbGradeYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGradeYearItemStateChanged

        this.gradeYear = cmbGradeYear.getSelectedItem().toString();

        cmbClassID.removeAllItems();
        for (ClassSchool c : ourPrinciple.getClasses()) {
            if (c.getYear().equals(gradeYear)) {
                cmbClassID.addItem(Integer.toString(c.getClassID()));
            }
        }

        cmbSubjects.removeAllItems();
        for (Subject s : ourPrinciple.getSubjects().get(gradeYear)) {
            cmbSubjects.addItem(s.getName());
        }

    }//GEN-LAST:event_cmbGradeYearItemStateChanged

    private void cmbClassIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIDActionPerformed

        if (cmbClassID.getSelectedItem() != null) {
            this.classID = Integer.parseInt(cmbClassID.getSelectedItem().toString());
        }

    }//GEN-LAST:event_cmbClassIDActionPerformed

    private void checkBoxTeachingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxTeachingDetailsActionPerformed

        if (checkBoxTeachingDetails.isSelected()) {
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);
            lblSubject.setVisible(true);
            cmbClassID.setVisible(true);
            cmbGradeYear.setVisible(true);
            cmbSubjects.setVisible(true);
        } else {
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);
            lblSubject.setVisible(false);
            cmbClassID.setVisible(false);
            cmbGradeYear.setVisible(false);
            cmbSubjects.setVisible(false);
        }

    }//GEN-LAST:event_checkBoxTeachingDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditTeacher;
    private javax.swing.JCheckBox checkBoxTeachingDetails;
    private javax.swing.JComboBox<String> cmbClassID;
    private javax.swing.JComboBox<String> cmbGradeYear;
    private javax.swing.JComboBox<String> cmbSubjects;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
