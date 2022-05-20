
package Accessibility.GuiFiles;

import Accessibility.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abdelwahab El-Desoky
 */
public class MarkExamForm extends javax.swing.JFrame {

    Teacher ourTeacher;
    int maxGrading;

    public MarkExamForm(Teacher teacher) {
        initComponents();
        Toolkit toolKit=getToolkit();
        Dimension size=toolKit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        ourTeacher = teacher;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudents = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        cmbClassID = new javax.swing.JComboBox<>();
        cmbExamId = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnShowStudents = new javax.swing.JButton();
        cmbGrade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        btnSendReport = new javax.swing.JButton();
        lblExamInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Mark Exams");

        tableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Grade", "Comment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableStudents);

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        cmbClassID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClassID.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClassIDItemStateChanged(evt);
            }
        });
        cmbClassID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClassIDActionPerformed(evt);
            }
        });

        cmbExamId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbExamId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbExamIdItemStateChanged(evt);
            }
        });
        cmbExamId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbExamIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel2.setText("Class  ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel3.setText("Exam ID");

        btnShowStudents.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnShowStudents.setText("Show Students");
        btnShowStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowStudentsActionPerformed(evt);
            }
        });

        cmbGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbGrade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGradeItemStateChanged(evt);
            }
        });
        cmbGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGradeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel4.setText("Grade year");

        btnSendReport.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btnSendReport.setText("Send Report");
        btnSendReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendReportActionPerformed(evt);
            }
        });

        lblExamInfo.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lblExamInfo.setText("(Exam Name) is (Type) Have Max Grade: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(217, 217, 217)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnShowStudents))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSendReport, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(206, 206, 206)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblExamInfo)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addComponent(cmbClassID, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)))
                .addGap(46, 46, 46)
                .addComponent(cmbExamId, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbExamId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbClassID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addComponent(btnShowStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblExamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSendReport)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbClassIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClassIDActionPerformed

    }//GEN-LAST:event_cmbClassIDActionPerformed

    private void btnShowStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowStudentsActionPerformed
        
        if(cmbExamId.getItemCount() ==0 || cmbClassID.getItemCount() == 0){
            
            JOptionPane.showMessageDialog(null,"You Must Choose The Class Id and Exam ID First.");
            return;
        }
        for (ClassSchool i : ourTeacher.getAssignedClasses()) {
            if (cmbClassID.getSelectedItem().toString().equals(Integer.toString(i.getClassID()))) {
                for (Student j : i.getAllStudents()) {
                    for (Exam x : j.getAllExams()) {
                        if (cmbExamId.getSelectedItem().toString().equals(x.getId())) {
                            lblExamInfo.setVisible(true);
                            lblExamInfo.setText(x.getId()+"is "+x.getType()+ "Have Max Grade: "+x.getMaxGrading() );
                            if(x.isTakenStatus()==true && x.isMarkedStatus()==false){
                                addRowToTable(new Object[]{j.getName(), x.getStudentGrade()});
                            }
                            maxGrading=x.getMaxGrading();
                            break;
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnShowStudentsActionPerformed
    public void addRowToTable(Object[] dataRow) {

        DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
        model.addRow(dataRow);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cmbClassID.removeAllItems();
        cmbExamId.removeAllItems();
        cmbGrade.removeAllItems();
        cmbGrade.addItem("one");
        cmbGrade.addItem("two");
        cmbGrade.addItem("three");
        cmbGrade.addItem("four");
        
        lblExamInfo.setVisible(false);


    }//GEN-LAST:event_formWindowOpened

    private void cmbClassIDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClassIDItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            cmbExamId.removeAllItems();

            for (Exam i : ourTeacher.getSubjectEnrolled().getExamList()) {
                cmbExamId.addItem(i.getId());
            }

        }
         DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
        for (int i = 0; i <model.getRowCount(); i++) {
                model.removeRow(0);
            }
        
    }//GEN-LAST:event_cmbClassIDItemStateChanged

    private void cmbGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbGradeActionPerformed

    private void cmbGradeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGradeItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            for (ClassSchool s : ourTeacher.getAssignedClasses()) {
                if (s.getYear().equals(cmbGrade.getSelectedItem().toString())) {
                    cmbClassID.addItem(Integer.toString(s.getClassID()));

                }
            }
        }
         DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
        for (int i = 0; i <model.getRowCount(); i++) {
                model.removeRow(0);
            }
    }//GEN-LAST:event_cmbGradeItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new TeacherViewForm(ourTeacher).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSendReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendReportActionPerformed
        Report report;
        int grade;
        int y=0;
        String comment = null;
        Exam E = null;
        DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
        
        for(int i=0;i<model.getRowCount();i++){
            if(maxGrading<(int) (model.getValueAt(y, 1))){
                JOptionPane.showMessageDialog(null,"Please Don't Exceed MAX Grade which is:( "+maxGrading+" )");
                return;
            }
        }
        for (ClassSchool i : ourTeacher.getAssignedClasses()) {
            if (cmbClassID.getSelectedItem().toString().equals(Integer.toString(i.getClassID()))) {
                for (Student j : i.getAllStudents()) {
                    for (Exam x : j.getAllExams()) {
                        if (cmbExamId.getSelectedItem().toString().equals(x.getId())) {
                           x.setMarkedStatus(true);
                           E=x;
                        }
                    }
                    
                    grade =(int) (model.getValueAt(y, 1));
                    System.out.println(grade);
                    
                    comment = (String) model.getValueAt(y, 2);
                    System.out.println("Comment : "+comment);
                   // System.out.println(y);
                    
                    System.out.println("okkkkkkkkk");
                    report=new Report( E.getDueDate(), grade, comment,ourTeacher.getSubjectEnrolled().getName(),cmbExamId.getSelectedItem().toString());
                    System.out.println("la2aaaaaaaa ");
                    E.setStudentGrade(grade);
                    System.out.println("ya mosahel");
                    j.getIssueReport().put(cmbExamId.getSelectedItem().toString(), report);
                    System.out.println("size ahooo"+ j.getIssueReport().size());
                    y++;
                    
                }
            }
          
        }
    }//GEN-LAST:event_btnSendReportActionPerformed

    private void cmbExamIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbExamIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbExamIdActionPerformed

    private void cmbExamIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbExamIdItemStateChanged
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) tableStudents.getModel();
        for (int i = 0; i <model.getRowCount(); i++) {
                model.removeRow(0);
            }
    }//GEN-LAST:event_cmbExamIdItemStateChanged

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MarkExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MarkExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MarkExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MarkExamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MarkExamForm().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendReport;
    private javax.swing.JButton btnShowStudents;
    private javax.swing.JComboBox<String> cmbClassID;
    private javax.swing.JComboBox<String> cmbExamId;
    private javax.swing.JComboBox<String> cmbGrade;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExamInfo;
    private javax.swing.JTable tableStudents;
    // End of variables declaration//GEN-END:variables
}
