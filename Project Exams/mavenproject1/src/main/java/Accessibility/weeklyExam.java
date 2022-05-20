
package Accessibility;

import java.io.Serializable;
import java.time.LocalDateTime;

public class weeklyExam extends Exam implements Serializable{
    
    public static final long serialVersionUID = 1246107213041829988l;

    public weeklyExam(String id, LocalDateTime startDate, LocalDateTime dueDate, String subjectName) {
        super(id, startDate, dueDate, subjectName);
         this.type = "Weekly Exam";
         this.maxGrading = 10;
    }

   public void setType(String type) {
        this.type = "weekly Exam";
    }
}
