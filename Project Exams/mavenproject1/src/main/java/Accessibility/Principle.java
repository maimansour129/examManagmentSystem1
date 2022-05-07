
package Accessibility;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principle extends User {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<ClassSchool> classes;
    private static final long serialVersionUID = 8824058496069985728L;
   // private ArrayList<String> subjects;
    
    //Declaring the Principle
    private static Principle p1= new Principle("Johny","Hoba","69","Principle");
    
    private Principle(String name, String username, String password, String role) {
        super(name, username, password, role);
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
    }
    
    public static Principle getPrinciple(){
        
        return p1;
    }
    
    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }

//    public ArrayList<String> getSubjects() {
//        return subjects;
//    }
//
//    public void setSubjects(ArrayList<String> subjects) {
//        this.subjects = subjects;
//    }

    public static void savePrinciple(Principle p) {
        
        try {
            FileHandler.writeData("principle.txt", p);
        } catch (IOException ex) {
            Logger.getLogger(Principle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void readPrinciple(){
        try {
             p1 = (Principle)FileHandler.readData("principle.txt");
        } catch (IOException ex) {
            Logger.getLogger(Principle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Principle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<ClassSchool> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<ClassSchool> classes) {
        this.classes = classes;
    }
    
    public void AddTeacher(Teacher teacher){
        teachers.add(teacher);
        //this.getTeachers().add(teacher);
    }
    
    public void EditTeacher(Teacher teacher){
        
    }
    public void Delete(Teacher teacher){
        teachers.remove(teacher);
    }
    public void SetTimetable(ClassSchool c){
        
    }
    public void ViewTeacherDetails(){
        
    }
    public void RegisterStudent(ArrayList<String> subjects,int enrolledClass,String name, String username, String password, String role,String yearGrade){
        
        Student newStudent = new Student(subjects, enrolledClass, name, username, password, role,yearGrade);
        students.add(newStudent);
    }
}
