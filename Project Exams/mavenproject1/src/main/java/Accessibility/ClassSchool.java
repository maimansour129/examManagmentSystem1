/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Accessibility;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Date;
/**
 *
 * @author Abelwahab El-Desoky
 */
public class ClassSchool implements Serializable {
    
    private ArrayList<Student> allStudents;
    private HashMap<String, String> schedule;
    private int classId;
    private String year;
    public static final long serialVersionUID = 9012406228533285031L;
    
    
    // we need object of classAssignment hashmap
    // we need to fill it with subject name and assignments
    // 1) constructor for this class
    
    public ClassSchool(int classId, String year)
    {
        this.classId = classId;
        this.year = year;
        allStudents=new ArrayList<>();
        schedule=new HashMap<>();
    }
    
    public void setAllStudents(ArrayList<Student> allStudents)
    {
        this.allStudents = allStudents;
    }
    
    public void setSchedule(HashMap<String, String> schedule)
    {
        this.schedule = schedule;
    }
    
            
    
    public ArrayList<Student> getAllStudents()
    {
        return allStudents;
    }


    public int getClassId() {
        return classId;
    }
    public void addtoschedule(String date_time,String sub){
        if(schedule.containsKey(date_time)){
            schedule.replace(date_time, sub);
        }
        else{
            schedule.put(date_time, sub);
        }
        
    }
    
    public HashMap<String, String> getSchedule()
    {
        return schedule;
    }
    
    
    public int getClassID(){
        return classId;
    }
    
    public String getYear(){
        return year;
    }
    
}
