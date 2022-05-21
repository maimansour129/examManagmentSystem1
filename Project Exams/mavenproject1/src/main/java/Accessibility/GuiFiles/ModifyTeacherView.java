package Accessibility.GuiFiles;

import Accessibility.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ModifyTeacherView extends javax.swing.JFrame {

    Principle p = Principle.getPrinciple();
    ArrayList<String> classes;

    public ModifyTeacherView() {

        initComponents();

        classes = new ArrayList<>();

        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);

        cmbTeachers.removeAllItems();
        for (int i = 0; i < p.getTeachers().size(); i++) {
            cmbTeachers.addItem(p.getTeachers().get(i).getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        cmbTeachers = new javax.swing.JComboBox<>();
        chbAddTeacher = new javax.swing.JCheckBox();
        txtName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnAddTeacher = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbClassID = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbGradeYear = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbSubject = new javax.swing.JComboBox<>();
        btnAddClass = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        cmbTeachers.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cmbTeachers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        chbAddTeacher.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        chbAddTeacher.setText("Add Teacher");
        chbAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAddTeacherActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Teacher Name:");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Teacher Username:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Teacher Password:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Teacher Subject:");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        btnAddTeacher.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAddTeacher.setText("Add");
        btnAddTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeacherActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Assigned Class ID:");

        cmbClassID.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("Assign Grade Year:");

        cmbGradeYear.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbGradeYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGradeYearItemStateChanged(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Select Teacher:");

        btnAddClass.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnAddClass.setText("Add Class");
        btnAddClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClassActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Teacher Salary:");

        txtSalary.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(chbAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbGradeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbClassID, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddClass))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnAddTeacher)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtSalary, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(83, 83, 83))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbTeachers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chbAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbGradeYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbClassID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnAddClass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnAddTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        txtName.setVisible(false);
        txtUsername.setVisible(false);
        txtPassword.setVisible(false);
        txtSalary.setVisible(false);
        cmbSubject.setVisible(false);
        cmbClassID.setVisible(false);
        cmbGradeYear.setVisible(false);

        jLabel1.setVisible(false);
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);

        btnAddTeacher.setVisible(false);

        cmbGradeYear.removeAllItems();
        cmbClassID.removeAllItems();

        cmbGradeYear.addItem("one");
        cmbGradeYear.addItem("two");
        cmbGradeYear.addItem("three");
        cmbGradeYear.addItem("four");
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new PrincipleView(p).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chbAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAddTeacherActionPerformed

        if (chbAddTeacher.isSelected()) {

            txtName.setVisible(true);
            txtUsername.setVisible(true);
            txtPassword.setVisible(true);
            txtSalary.setVisible(true);
            cmbSubject.setVisible(true);
            cmbClassID.setVisible(true);
            cmbGradeYear.setVisible(true);

            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            jLabel6.setVisible(true);

            btnAddTeacher.setVisible(true);
        } else {

            txtName.setVisible(false);
            txtUsername.setVisible(false);
            txtPassword.setVisible(false);
            txtSalary.setVisible(false);
            cmbSubject.setVisible(false);
            cmbClassID.setVisible(false);
            cmbGradeYear.setVisible(false);

            jLabel1.setVisible(false);
            jLabel2.setVisible(false);
            jLabel3.setVisible(false);
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            jLabel6.setVisible(false);

            btnAddTeacher.setVisible(false);
        }
    }//GEN-LAST:event_chbAddTeacherActionPerformed

    private void btnAddTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeacherActionPerformed

        if(classes.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Add Classes please");
            return;
            
        }
        
        if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()||txtName.getText().isEmpty()||txtSalary.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Please Add Teacher Information First");
        } else {
            Teacher newTeacher = new Teacher(txtName.getText(), txtUsername.getText(), txtPassword.getText(), "Teacher",Integer.parseInt(txtSalary.getText().toString()));

            p.AddTeacher(newTeacher);

            for (Subject s : p.getSubjects().get(cmbGradeYear.getSelectedItem().toString())) {
                if (s.getName().equals(cmbSubject.getSelectedItem().toString())) {
                    newTeacher.setSubjectEnrolled(s);
                }
            }

            for (String classID : classes) {
                for (ClassSchool i : Principle.getPrinciple().getClasses()) {
                    if (Integer.parseInt(classID) == i.getClassID() && cmbGradeYear.getSelectedItem().toString().equals(i.getYear())) {
                        newTeacher.getAssignedClasses().add(i);
                    }
                }
            }

            JOptionPane.showMessageDialog(null, "Added Succesfully");

            new PrincipleView(p).setVisible(true);
            this.setVisible(false);
            
            for(ClassSchool c:newTeacher.getAssignedClasses()){
                System.out.println("class: "+c.getClassID());
            }
            
        
        }
    }//GEN-LAST:event_btnAddTeacherActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

        Teacher teacher;

        for (int i = 0; i < p.getTeachers().size(); i++) {

            if (cmbTeachers.getSelectedItem().toString().equals(p.getTeachers().get(i).getName())) {

                teacher = p.getTeachers().get(i);

                new EditTeacherForm(teacher).setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        Teacher teacher;

        for (int i = 0; i < p.getTeachers().size(); i++) {

            if (cmbTeachers.getSelectedItem().toString().equals(p.getTeachers().get(i).getName())) {

                teacher = p.getTeachers().get(i);
                p.Delete(teacher);

                JOptionPane.showMessageDialog(null, "Teacher Account Deleted Succesfully");

                new PrincipleView(p).setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cmbGradeYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGradeYearItemStateChanged

        cmbClassID.removeAllItems();
        for (ClassSchool i : p.getClasses()) {
            if (i.getYear().equals(cmbGradeYear.getSelectedItem().toString())) {
                cmbClassID.addItem(Integer.toString(i.getClassID()));
            }
        }

        cmbSubject.removeAllItems();
        for (Subject s : p.getSubjects().get(cmbGradeYear.getSelectedItem().toString())) {
            cmbSubject.addItem(s.getName());
        }
    }//GEN-LAST:event_cmbGradeYearItemStateChanged

    private void btnAddClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClassActionPerformed
        // TODO add your handling code here:

        int idx = cmbClassID.getSelectedIndex();
        classes.add(cmbClassID.getSelectedItem().toString());
        cmbClassID.removeItemAt(idx);

    }//GEN-LAST:event_btnAddClassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClass;
    private javax.swing.JButton btnAddTeacher;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JCheckBox chbAddTeacher;
    private javax.swing.JComboBox<String> cmbClassID;
    private javax.swing.JComboBox<String> cmbGradeYear;
    private javax.swing.JComboBox<String> cmbSubject;
    private javax.swing.JComboBox<String> cmbTeachers;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
