package Accessibility;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Abelwahab El-Desoky
 */
public class Report {

    private LocalDateTime date;
    private int grade;
    private String comment;
    private String examId;

    public Report(LocalDateTime date, int grade, String comment,String examId) {
        this.date = date;
        this.grade = grade;
        this.comment = comment;
        this.examId = examId;
    }

   

    public LocalDateTime getDate() {
        return date;
    }

    public int getGrade() {
        return grade;
    }

    public String getComment() {
        return comment;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getExamId() {
        return examId;
    }

}
