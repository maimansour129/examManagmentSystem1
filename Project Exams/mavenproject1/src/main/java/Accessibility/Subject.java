package Accessibility;


import java.util.*;


public class Subject {

    private String name;
    private HashMap<String, ArrayList<Exam>> examList;
    private ArrayList<Assignment> assignments;

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

    public void addToExamList(String gradeyear, Exam exam) {
       examList.get(gradeyear).add(exam);
    }
    
    public boolean editExam(String gradeYear,String ExamID,char choice,Date date) {
        
        for(Exam i:examList.get(gradeYear)){
            if(i.getId().equals(ExamID)){
                if(choice=='s'){
                    i.setStartDate(date);
                }
                else {
                    i.setDueDate(date);
                }
                return true;
            }
        }
        
        return false;   
    }

    public HashMap<String, ArrayList<Exam>> getExamList() {
        return examList;
    }
    
    
}

