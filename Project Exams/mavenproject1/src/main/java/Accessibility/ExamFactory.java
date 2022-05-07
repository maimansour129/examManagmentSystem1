/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accessibility;

import java.time.LocalDateTime;

/**
 *
 * @author maima
 */
public class ExamFactory {
    
    public Exam getExamType(String type,String id, LocalDateTime startDate, LocalDateTime dueDate, String subjectName){
        if(type==null){
            return null;
        }
        else if(type.equals("Final Exam")){
            return new finalExam( id,  startDate,  dueDate,  subjectName);
        }
        else if(type.equals("Monthly Exam")){
            return new monthlyExam(id,  startDate,  dueDate,  subjectName);
        }
        else if(type.equals("Weekly Exam")){
            return new weeklyExam(id,  startDate,  dueDate,  subjectName);
        }
        else{
            return null;
        }
    }
    
}
