package Accessibility;

import java.util.Date;

public class Exam {

    /*- id: string
- status : boolean
- startDate: Date
- dueDate: Date
- subject: String
- grading: int*/
    private String id;
    private boolean status;
    private Date startDate;
    private Date dueDate;
    private String subjectName;
    private int grading;

    public void setId(String id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setGrading(int grading) {
        this.grading = grading;
    }

    public String getId() {
        return id;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getGrading() {
        return grading;
    }

}
