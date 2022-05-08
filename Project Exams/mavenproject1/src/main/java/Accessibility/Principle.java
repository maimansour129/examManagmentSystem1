
package Accessibility;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import Accessibility.*;

public class Principle extends User {

    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    private ArrayList<ClassSchool> classes;
    private HashMap<String, ArrayList<Subject>> subjects;
    private static final long serialVersionUID = 8824058496069985728L;
   // private ArrayList<String> subjects;
    
    //Declaring the Principle
    private static Principle p1= new Principle("Johny","Hoba","69","Principle");
        
        ArrayList<Subject> yearOneSub = new ArrayList<>();
        ArrayList<Subject> yearTwoSub = new ArrayList<>();
        ArrayList<Subject> yearThreeSub = new ArrayList<>();
        ArrayList<Subject> yearFourSub = new ArrayList<>();
        
        Subject Math1 = new Subject("Math 1");
        Subject Arabic1 = new Subject("Arabic 1");
        Subject English1 = new Subject("English 1");
        
        
        Subject English2 = new Subject("English 2");
        Subject Arabic2 = new Subject("Arabic 2");
        Subject Science = new Subject("Science");
        Subject algebra2 = new Subject("Algebra 1");
        Subject geometry2 = new Subject("Geometry 1");
        
        Subject Arabic3 = new Subject("Arabic 3");
        Subject English3 = new Subject("English 3");
        Subject Biology3 = new Subject("Biology 1");
        Subject Chemistry3 = new Subject("Chemistry 1");
        Subject Physics3 = new Subject("Phyiscs 1");
        Subject algebra3 = new Subject("Algebra 3");
        Subject geometry3 = new Subject("Geometry 3");
        
        Subject Arabic4 = new Subject("Arabic 4");
        Subject English4 = new Subject("English 4");
        Subject algebra4 = new Subject("Algebra 4");
        Subject geometry4 = new Subject("Solid Geometry 4");
        Subject Biology4 = new Subject("Biology 4");
        Subject Chemistry4 = new Subject("Chemistry 4");
        Subject Physics4 = new Subject("Phyiscs 4");
        Subject computerScience = new Subject("Computer Science");
        
    private Principle(String name, String username, String password, String role) {
        super(name, username, password, role);
        teachers = new ArrayList<>();
        students = new ArrayList<>();
        classes = new ArrayList<>();
        subjects = new HashMap<>();
        //subjects for grade 1
        yearOneSub.add(Math1);
        yearOneSub.add(English1);
        yearOneSub.add(Arabic1);
        
        //subjects for grade 2
        yearTwoSub.add(Arabic2);
        yearTwoSub.add(English2);
        yearTwoSub.add(algebra2);
        yearTwoSub.add(geometry2);
        yearTwoSub.add(Science);
        
        //subjects for grade 3
        yearThreeSub.add(Arabic3);
        yearThreeSub.add(English3);
        yearThreeSub.add(Physics3);
        yearThreeSub.add(Chemistry3);
        yearThreeSub.add(Biology3);
        yearThreeSub.add(algebra3);
        yearThreeSub.add(geometry3);
        
        //subjects for grade 4
        yearFourSub.add(English4);
        yearFourSub.add(Arabic4);
        yearFourSub.add(Physics4);
        yearFourSub.add(Chemistry4);
        yearFourSub.add(Biology4);
        yearFourSub.add(geometry4);
        yearFourSub.add(algebra4);
        yearFourSub.add(computerScience);
        
        
        subjects.put("one", yearOneSub);
        subjects.put("two", yearTwoSub);
        subjects.put("three", yearThreeSub);
        subjects.put("four", yearFourSub);
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
