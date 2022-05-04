package Accessibility;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;

public class Teacher extends User{

    private Subject subjectEnrolled;
    private ArrayList<ClassSchool> assignedClasses;
    

    public Teacher(String name, String username, String password, String role) {
        super(name, username, password, role);
        assignedClasses=new ArrayList<>();
    }
    
    

    public void addExam(String gradeYear,Exam exam) {
      //  subjectEnrolled.addToExamList(gradeYear, exam);
      subjectEnrolled.getExamList().get(gradeYear).add(exam);
      
    }

    public boolean editExam(String gradeYear,String ExamID,int choice,LocalDateTime date) {

      /*  boolean editResult=subjectEnrolled.editExam(gradeYear, ExamID, choice, date);
        
        return editResult;*/
      for(Exam i:subjectEnrolled.getExamList().get(gradeYear)){
            if(i.getId().equals(ExamID)){
                if(choice==1){
                    i.setStartDate(date);
                }
                else {
                    i.setDueDate(date);
                }
                return true;
            }
        }
        
        return false;   
        
    }

    public boolean deleteExam(String gradeYear,String ExamID) {
        for(Exam i:subjectEnrolled.getExamList().get(gradeYear)){
            if(i.getId().equals(ExamID)){
                subjectEnrolled.getExamList().get(gradeYear).remove(i);
                return true;
            }
        }
        return false;
    }

    public void sendNotification(int className , String text){
        
       for(ClassSchool i:assignedClasses){
           if(className==i.getClassID()){
               for(Student j:i.getAllStudents()){
                    j.getNotifications().push(text);
               }
           }
       }

    }

    public boolean assignAssignment(String assignment,int classID,LocalDateTime date) {
        
        String notify=assignment+" has been released and will be delivered before "+date;
        for(ClassSchool i:assignedClasses){
           if(classID==i.getClassID()){
              i.getAssignments().get(subjectEnrolled.getName()).add(assignment);
               sendNotification(classID, notify);
               return true;
           }
       }
        return false;

    }

    public void checkStudentGrade(int classID){
        ArrayList<Student> classStudents;
         for(ClassSchool i:assignedClasses){
           if(classID==i.getClassID()){
             classStudents=i.getAllStudents();
            //not Done yet 
           }
       }
    }
    
    public void markGrades(String username,int classID, String examID){
        ArrayList<Student> classStudents=null;
        Student currentStudent;
        for(ClassSchool i:assignedClasses){
           if(classID==i.getClassID()){
             classStudents=i.getAllStudents();
           }
        }
         for(int j=0;j<classStudents.size();j++){
                if(username.equals(classStudents.get(j).getUsername())){
                    currentStudent=classStudents.get(j);
                    //not done yet waiting for get All exams
                }
            }
    }

    public HashMap<String, Report> IssueReport(Student student) {
        HashMap<String, Report> fReport = new HashMap<>();

        return fReport;
        
    }
    public Subject getSubjectEnrolled() {
        return subjectEnrolled;
    }

    public void setSubjectEnrolled(Subject subjectEnrolled) {
        this.subjectEnrolled = subjectEnrolled;
    }

    public ArrayList<ClassSchool> getAssignedClasses() {
        return assignedClasses;
    }

    public void setAssignedClasses(ArrayList<ClassSchool> assignedClasses) {
        this.assignedClasses = assignedClasses;
    }
    
    public void assignExam(String gradeYear,String examID)throws CloneNotSupportedException{
        Exam tmpExam=null;
        for(Exam x:subjectEnrolled.getExamList().get(gradeYear)){
            if(x.getId().equals(examID)){
               tmpExam=x;
               break;
            }
        }
        for(ClassSchool i:assignedClasses){
            if(i.getYear().equals(gradeYear)){
                for(Student j:i.getAllStudents()){
                    j.getAllExams().add((Exam)tmpExam.clone());
                }
            }
        }
    }
}
