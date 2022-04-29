package Accessibility;

import java.util.ArrayList;
import java.util.*;

public class Teacher {

    private Subject subjectEnrolled;
    private ArrayList<Class> assignedClasses;

    public void addExam(String gradeYear,Exam exam) {
        subjectEnrolled.addToExamList(gradeYear, exam);
    }

    public boolean editExam(String gradeYear,String ExamID,char choice,Date date) {

        boolean editResult=subjectEnrolled.editExam(gradeYear, ExamID, choice, date);
        
        return editResult;
        
    }

    public void deleteExam(Exam exam) {

    }

    public void sendNotification(String text) {

    }

    public void assignAssignment(Assignment assignment) {

    }

    public void checkStudentGrade(Student student) {

    }

    public HashMap<String, Report> IssueReport(Student student) {
        HashMap<String, Report> fReport = new HashMap<String, Report>();

        return fReport;
    }
}
