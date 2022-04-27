
package Accessibility;

public class Student extends User{
    
    private int grade;
    private String issue_report;
    private String note_to_principle;

    public String getNote_to_principle() {
        return note_to_principle;
    }

    public void setNote_to_principle(String note_to_principle) {
        this.note_to_principle = note_to_principle;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getIssue_report() {
        return issue_report;
    }

    public void setIssue_report(String issue_report) {
        this.issue_report = issue_report;
    }
    
    public void ViewGrades(){
        
    }
}
