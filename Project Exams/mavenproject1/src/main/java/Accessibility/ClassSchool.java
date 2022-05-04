/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Accessibility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
/**
 *
 * @author Abelwahab El-Desoky
 */
public class ClassSchool {
    
    private ArrayList<Student> allStudents;
    private HashMap<Date, Subject> schedule;
    private HashMap<String, ArrayList<String>> subjectAssignments;
    private int classId;
    private String year;
    
    
    // we need object of classAssignment hashmap
    // we need to fill it with subject name and assignments
    // 1) constructor for this class
    
    public ClassSchool(int classId, String year)
    {
        this.classId = classId;
        this.year = year;
    }
    
    public void setAllStudents(ArrayList<Student> allStudents)
    {
        this.allStudents = allStudents;
    }
    
    public void setSchedule(HashMap<Date, Subject> schedule)
    {
        this.schedule = schedule;
    }
    
            
    public void setSubjectAssignments(HashMap<String, ArrayList<String>> subjectAssignments)
    {
        this.subjectAssignments = subjectAssignments;
    }
    
    public ArrayList<Student> getAllStudents()
    {
        return allStudents;
    }

    public HashMap<String, ArrayList<String>> getClassAssignments() {
        return subjectAssignments;
    }

    public int getClassId() {
        return classId;
    }
    
    public HashMap<Date, Subject> getSchedule()
    {
        return schedule;
    }
    
    public HashMap<String, ArrayList<String>> getAssignments()
    {
        return subjectAssignments;
    }
    
    public int getClassID(){
        return classId;
    }
    
    public String getYear(){
        return year;
    }
}
