
package Accessibility;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

//import java.time.format.DateTimeFormatterBuilder;

public class Student extends User implements Serializable {
    
    private String yearGrade;
    private ArrayList<String> subjects;
    private Report report;
    private HashMap<String,Report> issueReport;
    private String noteToPrinciple;
    private ArrayList<Exam> allExams;
    private int enrolledclassID;
    private Stack<String> notifications;
    private HashMap<String, ArrayList<String>> Assignments;
    private static final long serialVersionUID = 4262226727166753310L;


    
    public Student(ArrayList<String> subjects, int enrolledclassID, String name, String username, String password, String role, String yearGrade) {
        super(name, username, password, role);
        this.subjects = subjects;
        this.yearGrade = yearGrade;
        this.enrolledclassID = enrolledclassID;
        subjects = new ArrayList<String>();
        issueReport = new HashMap<String, Report>();
        allExams = new ArrayList<Exam>();
        notifications = new Stack<String>();
        Assignments=new HashMap<>();
    }

    public HashMap<String, ArrayList<String>> getAssignments() {
        return Assignments;
    }

    public void setAssignments(HashMap<String, ArrayList<String>> Assignments) {
        this.Assignments = Assignments;
    }
    
    public String getYearGrade() {
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

    public HashMap<String, Report> getIssue_report() {
        return issueReport;
    }

    public void setNoteToPrinciple(String note_to_principle) {
        this.noteToPrinciple = note_to_principle;
    }

    public void setGrade(String grade) {
        this.yearGrade = grade;
    }
    
    public void setIssueReport(HashMap<String,Report> issue_report) {
        this.issueReport = issue_report;
    }
    
//    public void TakeExam(Exam exam){
//       //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//       Date now = new Date(System.currentTimeMillis());
//       if(now.compareTo(exam.getDueDate())>0){
//           exam.setAllowedStatus(false);
//        }
//       else if(now.compareTo(exam.getDueDate())<0){
//           exam.setTakenStatus(false);
//           exam.setAllowedStatus(false);
//           if(now.compareTo(exam.getDueDate())>0){
//               exam.setAllowedStatus(false);
//           }
//       }
//    }
    public void StudentLogin(String username,String pass, ArrayList<Student> allstuds){
        for(int i=0; i<allstuds.size(); i++){
          if(allstuds.get(i).getUsername().equals(username) && allstuds.get(i).getPassword().equals(pass)){
              System.out.println("HI");
        }
        }
    }

    public void setReport(Report report) {
        this.report = report;
    }
   
}
