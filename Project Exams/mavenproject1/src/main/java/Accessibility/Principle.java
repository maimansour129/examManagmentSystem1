
package Accessibility;

import java.util.ArrayList;

public class Principle extends User{

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<Class> classes;
    
    public Principle(String name, String username, String password, String role) {
        super(name, username, password, role);
    }
    public void AddTeacher(Teacher teacher){
        
    }
    public void EditTeacher(Teacher teacher){
        
    }
    public void Delete(Teacher teacher){
        
    }
    public void SetTimetable(Class c){
        
    }
    public void ViewTeacherDetails(){
        
    }
    public void RegisterStudent(ArrayList<String> subjects,int enrolledClass, String username, String password, String role,int yearGrade){
        
        Student newStudent = new Student(subjects, enrolledClass, null, username, password, role,yearGrade);
    }
}
