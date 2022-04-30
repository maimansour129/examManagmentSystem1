
package Accessibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Student extends User{
    
    private int yearGrade;
    private ArrayList<String> subjects;
    private HashMap<String,Report> issueReport;
    private String noteToPrinciple;
    private ArrayList<Exam> allExams;
    private int enrolledclassID;
    private Stack<String> notifications;

    
    

    public Student(ArrayList<String> subjects, int enrolledclassID, String name, String username, String password, String role) {
        super(name, username, password, role);
        this.subjects = subjects;
        this.enrolledclassID = enrolledclassID;
    }

    public int getYearGrade() {
        return yearGrade;
    }
    public String getRole() {
        return role;
        }
    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public HashMap<String, Report> getIssueReport() {
        return issueReport;
    }

    public ArrayList<Exam> getAllExams() {
        return allExams;
    }

    public int getEnrolledclassID() {
        return enrolledclassID;
    }

    public Stack<String> getNotifications() {
        return notifications;
    }
    
    public String getNoteToPrinciple() {
        return noteToPrinciple;
    }

    public void setNoteToPrinciple(String note_to_principle) {
        this.noteToPrinciple = note_to_principle;
    }

    public void setGrade(int grade) {
        this.yearGrade = grade;
    }

    public int getGrade() {
        return yearGrade;
    }

    public HashMap<String, Report> getIssue_report() {
        return issueReport;
    }

    public void setIssueReport(HashMap<String,Report> issue_report) {
        this.issueReport = issue_report;
    }
    
    public void ViewFinalGrades(){
        
    }
     public void CalculateFinalGrade(){
        
    }
    public void ShowExamGrades(){
        
    }
    public void TakeExam(){
        
    }
    public void ShowReport(){
        
    }
   
}
