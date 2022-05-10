package Accessibility.GuiFiles;

import javax.swing.table.DefaultTableModel;

import Accessibility.*;

public class SetSchedule extends javax.swing.JFrame {

    int classID;
    String gradeYear;
    Principle p = Principle.getPrinciple();

    public SetSchedule() {

        initComponents();

        cmbSubjects.removeAllItems();
        for (int i = 0; i < p.getTeachers().size(); i++) {
            cmbSubjects.addItem(p.getTeachers().get(i).getSubjectEnrolled().getName());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSchedule = new javax.swing.JTable();
        labelDay = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddDay = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cmbDay = new javax.swing.JComboBox<>();
        cmbGradeYear = new javax.swing.JComboBox<>();
        cmbClassId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        cmbTime = new javax.swing.JComboBox<>();
        chbAddSchedule = new javax.swing.JCheckBox();
        labelSubjects = new javax.swing.JLabel();
        cmbSubjects = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Days", "8-10", "10-12", "12-2", "2-4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSchedule.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tblSchedule);

        labelDay.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        labelDay.setText("Select Day:");

        btnBack.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddDay.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnAddDay.setText("Add Day");
        btnAddDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDayActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel5.setText("Select Grade Year:");

        cmbDay.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cmbDay.setSelectedItem(" ");

        cmbGradeYear.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cmbGradeYear.setSelectedItem(" ");
        cmbGradeYear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGradeYearItemStateChanged(evt);
            }
        });

        cmbClassId.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cmbClassId.setSelectedItem(" ");
        cmbClassId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbClassIdItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel6.setText("Select Class ID:");

        labelTime.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        labelTime.setText("Select Time:");

        cmbTime.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        cmbTime.setSelectedItem(" ");

        chbAddSchedule.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        chbAddSchedule.setText("Add To The Schedule?");
        chbAddSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbAddScheduleActionPerformed(evt);
            }
        });

        labelSubjects.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        labelSubjects.setText("Select Subject:");

        cmbSubjects.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        cmbSubjects.setSelectedItem(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(chbAddSchedule))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddDay, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelDay, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelSubjects))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbDay, 0, 138, Short.MAX_VALUE)
                                    .addComponent(cmbSubjects, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addComponent(labelTime)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmbGradeYear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(25, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(cmbClassId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbGradeYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(chbAddSchedule)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDay)
                    .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTime))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDay)
                    .addComponent(labelSubjects)
                    .addComponent(cmbSubjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDayActionPerformed

        int row = -1, col = -1;
        switch (cmbDay.getSelectedItem().toString()) {
            case "Saturday":
                row = 0;
                break;
            case "Sunday":
                row = 1;
                break;
            case "Monday":
                row = 2;
                break;
            case "Tuesday":
                row = 3;
                break;
            case "Wednesday":
                row = 4;
                break;
            case "Thursday":
                row = 5;
                break;
            default:
                break;
        }
        switch (cmbTime.getSelectedItem().toString()) {
            case "8 - 10":
                col = 1;
                break;
            case "10 - 12":
                col = 2;
                break;
            case "12 - 2":
                col = 3;
                break;
            case "2 - 4":
                col = 4;
                break;
            default:
                break;
        }
        DefaultTableModel model = (DefaultTableModel) tblSchedule.getModel();
        model.setValueAt(cmbSubjects.getSelectedItem().toString(), row, col);
        for (ClassSchool i : p.getClasses()) {
            if (i.getClassID() == Integer.parseInt(cmbClassId.getSelectedItem().toString()) && i.getYear().equals(cmbGradeYear.getSelectedItem().toString())) {
                i.addtoschedule(cmbDay.getSelectedItem().toString() + cmbTime.getSelectedItem().toString(), cmbSubjects.getSelectedItem().toString());
            }
        }

    }//GEN-LAST:event_btnAddDayActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        labelDay.setVisible(false);
        labelTime.setVisible(false);
        labelSubjects.setVisible(false);
        cmbDay.setVisible(false);
        cmbTime.setVisible(false);
        cmbSubjects.setVisible(false);
        btnAddDay.setVisible(false);

        cmbGradeYear.removeAllItems();
        cmbClassId.removeAllItems();
        for (ClassSchool i : p.getClasses()) {
            cmbGradeYear.addItem(i.getYear());
            cmbClassId.addItem(Integer.toString(i.getClassID()));
        }

        cmbDay.removeAllItems();
        cmbDay.addItem("Saturday");
        cmbDay.addItem("Sunday");
        cmbDay.addItem("Monday");
        cmbDay.addItem("Tuesday");
        cmbDay.addItem("Wednesday");
        cmbDay.addItem("Thursday");

        cmbTime.removeAllItems();
        cmbTime.addItem("8 - 10");
        cmbTime.addItem("10 - 12");
        cmbTime.addItem("12 - 2");
        cmbTime.addItem("2 - 4");
    }//GEN-LAST:event_formWindowOpened

    private void cmbClassIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbClassIdItemStateChanged

        this.classID = Integer.parseInt(cmbClassId.getSelectedItem().toString());
        if (chbAddSchedule.isSelected()) {

            DefaultTableModel model = (DefaultTableModel) tblSchedule.getModel();
            for (int i = 0; i <= 5; i++) {
                model.removeRow(0);
            }
            model.addRow(new Object[]{"Saturday"});
            model.addRow(new Object[]{"Sunday"});
            model.addRow(new Object[]{"Monday"});
            model.addRow(new Object[]{"Tuesday"});
            model.addRow(new Object[]{"Wednesday"});
            model.addRow(new Object[]{"Thursday"});
        }

    }//GEN-LAST:event_cmbClassIdItemStateChanged

    private void cmbGradeYearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGradeYearItemStateChanged

        this.gradeYear = cmbGradeYear.getSelectedItem().toString();
    }//GEN-LAST:event_cmbGradeYearItemStateChanged

    private void chbAddScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbAddScheduleActionPerformed

        DefaultTableModel model = (DefaultTableModel) tblSchedule.getModel();
        if (chbAddSchedule.isSelected() == true) {

            model.addRow(new Object[]{"Saturday"});
            model.addRow(new Object[]{"Sunday"});
            model.addRow(new Object[]{"Monday"});
            model.addRow(new Object[]{"Tuesday"});
            model.addRow(new Object[]{"Wednesday"});
            model.addRow(new Object[]{"Thursday"});
            labelDay.setVisible(true);
            labelTime.setVisible(true);
            labelSubjects.setVisible(true);
            cmbDay.setVisible(true);
            cmbTime.setVisible(true);
            cmbSubjects.setVisible(true);
            btnAddDay.setVisible(true);
        } else {
            for (int i = 0; i <= 5; i++) {
                model.removeRow(0);
            }
            labelDay.setVisible(false);
            labelTime.setVisible(false);
            labelSubjects.setVisible(false);
            cmbDay.setVisible(false);
            cmbTime.setVisible(false);
            cmbSubjects.setVisible(false);
            btnAddDay.setVisible(false);
        }
    }//GEN-LAST:event_chbAddScheduleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        new PrincipleView(p).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDay;
    private javax.swing.JButton btnBack;
    private javax.swing.JCheckBox chbAddSchedule;
    private javax.swing.JComboBox<String> cmbClassId;
    private javax.swing.JComboBox<String> cmbDay;
    private javax.swing.JComboBox<String> cmbGradeYear;
    private javax.swing.JComboBox<String> cmbSubjects;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDay;
    private javax.swing.JLabel labelSubjects;
    private javax.swing.JLabel labelTime;
    private javax.swing.JTable tblSchedule;
    // End of variables declaration//GEN-END:variables
}
