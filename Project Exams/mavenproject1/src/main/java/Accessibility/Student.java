
package Accessibility;

import java.util.ArrayList;
import java.util.HashMap;

public class Student extends User{
    
    private int grade;
    private ArrayList<String> subjects;
    
    private HashMap<String,Report> issueReport;
    private String noteToPrinciple;
    private ArrayList<Exam> allExams;
    private int enrolledclassID;

    public Student(ArrayList<String> subjects, int enrolledclassID, String name, String username, String password, String role) {
        super(name, username, password, role);
        this.subjects = subjects;
        this.enrolledclassID = enrolledclassID;
    }

    
    public void CalculateFinalGrade(){
        
    }
    public void ShowExamGrades(){
        
    }
    public void TakeExam(){
        
    }
    public void ShowReport(){
        
    }
   
    public String getNote_to_principle() {
        return noteToPrinciple;
    }

    public void setNote_to_principle(String note_to_principle) {
        this.noteToPrinciple = note_to_principle;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public HashMap<String, Report> getIssue_report() {
        return issueReport;
    }

    public void setIssue_report(HashMap<String,Report> issue_report) {
        this.issueReport = issue_report;
    }
    
    public void ViewGrades(){
        
    }
}
