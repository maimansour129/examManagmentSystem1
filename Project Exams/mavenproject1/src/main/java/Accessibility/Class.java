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
public class Class {
    
    private ArrayList<Student> allStudents;
    private HashMap<Date, Subject> schedule;
    private HashMap<String, ArrayList<Assignment>> classAssignments;
    private int classId;
    private String year;
    
    
    public ArrayList<Student> getAllStudents()
    {
        return allStudents;
    }
    
    public HashMap<Date, Subject> getSchedule()
    {
        return schedule;
    }
    
    public HashMap<String, ArrayList<Assignment>> getAssignments()
    {
        return classAssignments;
    }
    
    public int getClassID(){
        return classId;
    }
    
    public String getYear(){
        return year;
    }
}
