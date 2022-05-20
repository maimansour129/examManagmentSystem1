package Accessibility;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;

public class Teacher extends User implements Serializable {

    private Subject subjectEnrolled;
    private ArrayList<ClassSchool> assignedClasses;
    private static final long serialVersionUID = 855691359342641201L;
    

    public Teacher(String name, String username, String password, String role) {
        super(name, username, password, role);
        assignedClasses=new ArrayList<>();
    }
    
    

    public void addExam(String gradeYear,Exam exam){
      //  subjectEnrolled.addToExamList(gradeYear, exam);
      subjectEnrolled.getExamList().add(exam);
      
    }

    public boolean editExam(String gradeYear,String ExamID,int choice,LocalDateTime date) {

      for(Exam i:subjectEnrolled.getExamList()){
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
        for(Exam i:subjectEnrolled.getExamList()){
            if(i.getId().equals(ExamID)){
                subjectEnrolled.getExamList().remove(i);
                return true;
            }
        }
        return false;
    }

    public void sendNotification(int classID , String text){
        
       for(ClassSchool i:assignedClasses){
           if(classID == i.getClassID()){
               for(Student j:i.getAllStudents()){
                    j.getNotifications().push(text);
               }
           }
       }

    }

    public boolean assignAssignment(String assignment,int classID,LocalDateTime date) {
        
        String notify= "Assignment Name: " + assignment +" has been released and it's Due Date will be  "+date;
        for(ClassSchool i:assignedClasses){
           if(classID==i.getClassID()){
              for(Student s:i.getAllStudents()){
                  
                  if(s.getAssignments().containsKey(subjectEnrolled.getName())){
                     s.getAssignments().get(subjectEnrolled.getName()).add(assignment); 
                  }
                  else{
                      ArrayList<String> tmp=new ArrayList<>();
                      s.getAssignments().put(subjectEnrolled.getName(),tmp);
                      s.getAssignments().get(subjectEnrolled.getName()).add(assignment);
                  }
                  sendNotification(classID, notify);
                  return true;
              }
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
    
    public void markGrades(String username,int classID, String examID,int grade){
        ArrayList<Student> classStudents=null;
        Student currentStudent;
        for(ClassSchool i:assignedClasses){
           if(classID==i.getClassID()){
             classStudents=i.getAllStudents();
           }
        }
         for(Student x:classStudents){
                if(username.equals(x.getName())){
                    for(Exam i:x.getAllExams()){
                        if(examID.equals(i.getId())){
                            i.setStudentGrade(grade);
                        }
                    }
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
        String type = null;
        LocalDateTime date = null;
        
        for(Exam x:subjectEnrolled.getExamList()){
            
            if(x.getId().equals(examID)){
               
                x.setAssignedStatus(true);
               tmpExam=x;
               type = tmpExam.getType();
               date = tmpExam.getDueDate();
               break;
            }
        }
        
        String notify = "a " + type + " has been released and it's Due Date will be  " + date;
        
        for(ClassSchool i:assignedClasses){
            
            if(i.getYear().equals(gradeYear)){
                
                for(Student j:i.getAllStudents()){
                    
                    j.getAllExams().add((Exam)tmpExam.clone());
                    sendNotification(i.getClassId(), notify);
                }
            }
        }
    }
}
