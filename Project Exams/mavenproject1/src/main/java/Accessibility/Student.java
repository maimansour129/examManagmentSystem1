
package Accessibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 
import java.util.Date;
//import java.time.format.DateTimeFormatterBuilder;

public class Student extends User{
    
    private int yearGrade;
    private ArrayList<String> subjects;
    private HashMap<String,Report> issueReport;
    private String noteToPrinciple;
    private ArrayList<Exam> allExams;
    private int enrolledclassID;
    private Stack<String> notifications;


    public Student(){
        subjects = new ArrayList<String>();
        issueReport = new HashMap<String, Report>();
        allExams = new ArrayList<Exam>();
        notifications = new Stack<String>();
        
    }
    public Student(ArrayList<String> subjects, int enrolledclassID, String name, String username, String password, String role, int yearGrade) {
        super(name, username, password, role);
        this.subjects = subjects;
        this.yearGrade = yearGrade;
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
     public int getGrade() {
        return yearGrade;
    }

    public HashMap<String, Report> getIssue_report() {
        return issueReport;
    }

    public void setNoteToPrinciple(String note_to_principle) {
        this.noteToPrinciple = note_to_principle;
    }

    public void setGrade(int grade) {
        this.yearGrade = grade;
    }
    
    public void setIssueReport(HashMap<String,Report> issue_report) {
        this.issueReport = issue_report;
    }
    public void TakeExam(Exam exam){
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        
         
    }
    
    public void ViewFinalGrades(){
        
    }
     public void CalculateFinalGrade(){
        
    }
    public void ShowExamGrades(){
        
    }
    
    public void ShowReport(){
        
    }
   
}
