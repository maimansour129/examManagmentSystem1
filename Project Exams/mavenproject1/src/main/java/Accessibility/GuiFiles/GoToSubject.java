package Accessibility.GuiFiles;

import Accessibility.Exam;
import Accessibility.Student;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GoToSubject extends javax.swing.JFrame {

    Student ourStudent;
    String subject;

    public GoToSubject(Student stud, String subjectSelected) {
        
        initComponents();
        Toolkit toolKit = getToolkit();
        Dimension size = toolKit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        ourStudent = stud;
        subject = subjectSelected;

    }

    public void addRowToTable(Object[] dataRow, javax.swing.JTable tbl) {

        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.addRow(dataRow);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_examIDs = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_current_assignments = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_subjectGrade = new javax.swing.JTable();
        btn_takeExam = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Exams");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Assignments");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Subject Grades");

        cmb_examIDs.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmb_examIDs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tbl_current_assignments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Current Assignments"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_current_assignments);
        if (tbl_current_assignments.getColumnModel().getColumnCount() > 0) {
            tbl_current_assignments.getColumnModel().getColumn(0).setResizable(false);
        }

        tbl_subjectGrade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exam id", "Grade"
            }
        ));
        jScrollPane2.setViewportView(tbl_subjectGrade);

        btn_takeExam.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btn_takeExam.setText("Take Exam");
        btn_takeExam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_takeExamActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmb_examIDs, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_takeExam)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_examIDs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_takeExam))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        if(ourStudent.getAssignments().containsKey(subject)){
            for(String i: ourStudent.getAssignments().get(subject)){
            addRowToTable(new Object[]{i}, tbl_current_assignments);
        }
        }
        
        cmb_examIDs.removeAllItems();
        for (Exam i : ourStudent.getAllExams()) {
            if (subject.equals(i.getSubjectName())){
                
                if(i.isTakenStatus()==false){
                    cmb_examIDs.addItem(i.getId());
                }
                if (i.isMarkedStatus()) {
                addRowToTable(new Object[]{i.getId(), i.getStudentGrade()}, tbl_subjectGrade);
                }
            }
            
            
        }
    }//GEN-LAST:event_formWindowOpened

    private void btn_takeExamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_takeExamActionPerformed

        LocalDateTime now=LocalDateTime.now();
        if(cmb_examIDs.getItemCount() ==0){
            
            JOptionPane.showMessageDialog(null,"Please Choose an Exam or Wait til an Exam Assign!");
            return;
        }
        for (Exam i : ourStudent.getAllExams()) {
            if (i.getId().equals(cmb_examIDs.getSelectedItem().toString())) {
                if(now.isAfter(i.getDueDate())){
                    JOptionPane.showMessageDialog(null, "Sorry You Passed the Deadline");
                    return;
                }
                if(now.isBefore(i.getStartDate())){
                    JOptionPane.showMessageDialog(null, "The exam not allowed yet\n Will be Available at : "+DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(i.getStartDate()));
                    return;
                }
                System.out.println(i.getType());
                i.setTakenStatus(true);
                JOptionPane.showMessageDialog(null, "Your duedate is at: " + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").format(i.getDueDate()));
            }
        }
    }//GEN-LAST:event_btn_takeExamActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new StudentOptions(ourStudent).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_takeExam;
    private javax.swing.JComboBox<String> cmb_examIDs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_current_assignments;
    private javax.swing.JTable tbl_subjectGrade;
    // End of variables declaration//GEN-END:variables
}
