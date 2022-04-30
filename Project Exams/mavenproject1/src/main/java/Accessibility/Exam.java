package Accessibility;

import java.util.Date;

public class Exam {

    private String id;
    private boolean takenStatus;
    private boolean markedStatus;

    private Date startDate;
    private Date dueDate;
    private String subjectName;
    private int grading;

    public Exam(String id, Date startDate, Date dueDate, String subjectName) {

        this.id = id;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.subjectName = subjectName;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTakenStatus(boolean takenStatus) {
        this.takenStatus = takenStatus;
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

    public boolean isTakenStatus() {
        return takenStatus;
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

    public boolean isMarkedStatus() {
        return markedStatus;
    }

    public void setMarkedStatus(boolean markedStatus) {
        this.markedStatus = markedStatus;
    }
}
