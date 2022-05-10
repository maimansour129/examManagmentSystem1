package Accessibility;


import java.io.Serializable;
import java.util.*;


public class Subject implements Serializable{

    private String name;
    private String gradeYear;
    public static final long serialVersionUID = 7966112252390337768L;

    //private HashMap<String, ArrayList<Exam>> examList;
    private ArrayList<String> assignments;

    ArrayList<Exam> examList = new ArrayList<>();
//    ArrayList<Exam> yearTwo = new ArrayList<>();
//    ArrayList<Exam> yearThree = new ArrayList<>();
//    ArrayList<Exam> yearFour = new ArrayList<>();

    public Subject(String name,String gradeYear) {
        
        this.name = name;
        this.gradeYear=gradeYear;
        examList=new ArrayList<>();
//        examList=new HashMap<>();
        assignments= new ArrayList<>();
        
        
//        examList.put("one", yearOne);
//        examList.put("two", yearTwo);
//        examList.put("three", yearThree);
//        examList.put("four", yearFour);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Exam> getExamList() {
        return examList;
    }
    
    
//    public HashMap<String, ArrayList<Exam>> getExamList() {
//        return examList;
//    }
    
    public String getGradeYear() {
        return gradeYear;
    }

    public void setGradeYear(String gradeYear) {
        this.gradeYear = gradeYear;
    }
    
}

