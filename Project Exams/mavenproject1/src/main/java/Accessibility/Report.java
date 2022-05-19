package Accessibility;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Abelwahab El-Desoky
 */
public class Report implements Serializable{

    private LocalDateTime date;
    private int grade;
    private String comment;
    private String examId;
    private String subject; 
    //public static final long serialVersionUID = 3170408122144110067L;
    public static final long serialVersionUID = -4265844872645070847L;

    public Report(LocalDateTime date, int grade, String comment,String subject,String examId) {
        this.date = date;
        this.grade = grade;
        this.comment = comment;
        this.subject = subject;
        this.examId=examId;
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
