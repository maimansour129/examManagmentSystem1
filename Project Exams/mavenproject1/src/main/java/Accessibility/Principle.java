
package Accessibility;

import java.util.ArrayList;

public class Principle extends User{

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<ClassSchool> classes;
    
    //Declaring the Principle
    private static Principle p1 = new Principle("Johny","Hoba","69","Principle");
    private Principle(String name, String username, String password, String role) {
        super(name, username, password, role);
    }
    public static Principle getPrinciple(){
        return p1;
    }
    
    
    public void AddTeacher(Teacher teacher){
        
    }
    public void EditTeacher(Teacher teacher){
        
    }
    public void Delete(Teacher teacher){
        
    }
    public void SetTimetable(ClassSchool c){
        
    }
    public void ViewTeacherDetails(){
        
    }
    public void RegisterStudent(ArrayList<String> subjects,int enrolledClass, String username, String password, String role,String yearGrade){
        
        Student newStudent = new Student(subjects, enrolledClass, null, username, password, role,yearGrade);
    }
}
