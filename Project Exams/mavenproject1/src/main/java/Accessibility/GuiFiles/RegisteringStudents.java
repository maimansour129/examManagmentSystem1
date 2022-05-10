package Accessibility.GuiFiles;

import Accessibility.*;
import java.awt.Dimension;
import java.awt.Toolkit;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class RegisteringStudents extends javax.swing.JFrame {

    Principle p1;
    ArrayList<String> myList = new ArrayList<>();

    public RegisteringStudents(Principle p) {
        initComponents();
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        p1 = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        txtStudentUsername = new javax.swing.JTextField();
        txtStudentPassword = new javax.swing.JTextField();
        cmbStudentGrade = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbStudentClass = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setText("FULL NAME:");

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("USERNAME:");

        jLabel3.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel3.setText("PASSWORD:");

        txtStudentName.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        txtStudentUsername.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        txtStudentPassword.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        cmbStudentGrade.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        cmbStudentGrade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbStudentGradeItemStateChanged(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel5.setText("GRADE YEAR:");

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel6.setText("ENROLLED CLASS:");

        cmbStudentClass.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtStudentPassword)
                        .addComponent(cmbStudentGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbStudentClass, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtStudentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStudentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbStudentGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(cmbStudentClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnSave)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new PrincipleView(p1).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        for (Subject s : p1.getSubjects().get(cmbStudentGrade.getSelectedItem().toString())) {
            myList.add(s.getName());
        }

        p1.RegisterStudent(myList, Integer.parseInt(cmbStudentClass.getSelectedItem().toString()),
                txtStudentName.getText(), txtStudentUsername.getText(), txtStudentPassword.getText(),
                "Student", cmbStudentGrade.getSelectedItem().toString());

        for (ClassSchool i : p1.getClasses()) {
            if (cmbStudentGrade.getSelectedItem().toString().equals(i.getYear()) && cmbStudentClass.getSelectedItem().toString().equals(Integer.toString(i.getClassID()))) {
                for (Student j : p1.getStudents()) {
                    if (txtStudentUsername.getText().equals(j.getUsername())) {
                        i.getAllStudents().add(j);
                    }
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Registered Succesfully");
        new PrincipleView(p1).setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnSaveActionPerformed


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cmbStudentGrade.removeAllItems();
        cmbStudentClass.removeAllItems();
        cmbStudentGrade.addItem("one");
        cmbStudentGrade.addItem("two");
        cmbStudentGrade.addItem("three");
        cmbStudentGrade.addItem("four");
    }//GEN-LAST:event_formWindowOpened

    private void cmbStudentGradeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbStudentGradeItemStateChanged

        cmbStudentClass.removeAllItems();
        for (ClassSchool i : p1.getClasses()) {
            if (i.getYear().equals(cmbStudentGrade.getSelectedItem().toString())) {
                cmbStudentClass.addItem(Integer.toString(i.getClassID()));
            }
        }
    }//GEN-LAST:event_cmbStudentGradeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbStudentClass;
    private javax.swing.JComboBox<String> cmbStudentGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtStudentPassword;
    private javax.swing.JTextField txtStudentUsername;
    // End of variables declaration//GEN-END:variables
}
