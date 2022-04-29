package Accessibility;

import java.util.Date;

/**
 *
 * @author Abelwahab El-Desoky
 */
public class Report {

    private Date date;
    private int grade;
    private String comment;

    public Report(Date date, int grade, String comment) {
        this.date = date;
        this.grade = grade;
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public int getGrade() {
        return grade;
    }

    public String getComment() {
        return comment;
    }

}
