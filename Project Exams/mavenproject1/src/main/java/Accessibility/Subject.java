package Accessibility;


import java.io.Serializable;
import java.util.*;


public class Subject implements Serializable{

    private String name;
    private HashMap<String, ArrayList<Exam>> examList;
    private ArrayList<String> assignments;

    ArrayList<Exam> yearOne = new ArrayList<>();
    ArrayList<Exam> yearTwo = new ArrayList<>();
    ArrayList<Exam> yearThree = new ArrayList<>();
    ArrayList<Exam> yearFour = new ArrayList<>();

    public Subject(String name) {
        this.name = name;

        examList=new HashMap<>();
        assignments= new ArrayList<>();
        
        
        examList.put("one", yearOne);
        examList.put("two", yearTwo);
        examList.put("three", yearThree);
        examList.put("four", yearFour);
    }

    public String getName() {
        return name;
    }
    
    public HashMap<String, ArrayList<Exam>> getExamList() {
        return examList;
    }
    
    
}

