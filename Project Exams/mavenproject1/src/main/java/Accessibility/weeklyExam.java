
package Accessibility;

import java.io.Serializable;
import java.time.LocalDateTime;

public class weeklyExam extends Exam implements Serializable{

    public weeklyExam(String id, LocalDateTime startDate, LocalDateTime dueDate, String subjectName) {
        super(id, startDate, dueDate, subjectName);
         this.type = "Weekly Exam";
    }

     public void setGrading(int grading) {
        this.maxGrading = 10;
    }

   public void setType(String type) {
        this.type = "weekly Exam";
    }
}
