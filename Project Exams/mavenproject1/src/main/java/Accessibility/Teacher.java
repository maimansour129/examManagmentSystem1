package Accessibility;

import java.util.ArrayList;
import java.util.*;

public class Teacher {

    private Subject subjectEnrolled;
    private ArrayList<Class> assignedClasses;
    
    

    public void addExam(String gradeYear,Exam exam) {
      //  subjectEnrolled.addToExamList(gradeYear, exam);
      subjectEnrolled.getExamList().get(gradeYear).add(exam);
      
    }

    public boolean editExam(String gradeYear,String ExamID,char choice,Date date) {

      /*  boolean editResult=subjectEnrolled.editExam(gradeYear, ExamID, choice, date);
        
        return editResult;*/
      for(Exam i:subjectEnrolled.getExamList().get(gradeYear)){
            if(i.getId().equals(ExamID)){
                if(choice=='s'){
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
        
       for(Class i:assignedClasses){
           if(className==i.getClassID()){
               for(Student j:i.getAllStudents()){
                    j.getNotifications().push(text);
               }
           }
       }

    }

    public boolean assignAssignment(String assignment,int classID,Date date) {
        
        String notify=assignment+" has been released and will be delivered before "+date;
        for(Class i:assignedClasses){
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
         for(Class i:assignedClasses){
           if(classID==i.getClassID()){
             classStudents=i.getAllStudents();
            //not Done yet 
           }
       }
    }
    
    public void markGrades(String username,int classID, String examID){
        ArrayList<Student> classStudents=null;
        Student currentStudent;
        for(Class i:assignedClasses){
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
}
