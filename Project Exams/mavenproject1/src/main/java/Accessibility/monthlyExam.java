
package Accessibility;

import java.io.Serializable;
import java.time.LocalDateTime;

public class monthlyExam extends Exam implements Serializable{

    public monthlyExam(String id, LocalDateTime startDate, LocalDateTime dueDate, String subjectName) {
        super(id, startDate, dueDate, subjectName);
        this.type = "Monthly Exam";
    }

   
     public void setGrading(int grading) {
        this.maxGrading = 25;
    }

    public void setType(String type) {
        this.type = "Monthly Exam";
    }
}
