package Accessibility;

import java.time.LocalDateTime;

public class Exam implements Cloneable{

    private String id;
    private boolean takenStatus;
    private boolean markedStatus;
    private boolean allowedStatus;
    private boolean assignedStatus;
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    private String subjectName;
    private int grading;

    public Exam(String id, LocalDateTime startDate, LocalDateTime dueDate, String subjectName) {

        this.id = id;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.subjectName = subjectName;
        this.grading=0;
        this.assignedStatus=false;
        this.allowedStatus=false;
        this.takenStatus=false;
        this.markedStatus=false;
    }

    public void setAllowedStatus(boolean allowedStatus) {
        this.allowedStatus = allowedStatus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTakenStatus(boolean takenStatus) {
        this.takenStatus = takenStatus;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
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

    public boolean isAllowedStatus() {
        return allowedStatus;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getDueDate() {
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

    @Override
    public Object clone()throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException exp) {
            exp.printStackTrace();
        }
        return clone;
    }

    public boolean isAssignedStatus() {
        return assignedStatus;
    }

    public void setAssignedStatus(boolean assignedStatus) {
        this.assignedStatus = assignedStatus;
    }
    
}
