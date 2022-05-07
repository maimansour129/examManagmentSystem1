
package Accessibility;

import java.time.LocalDateTime;

public class finalExam extends Exam {

    public finalExam(String id, LocalDateTime startDate, LocalDateTime dueDate, String subjectName) {
        super(id, startDate, dueDate, subjectName);
         this.type = "Final Exam";
    }
     
    public void setGrading(int grading) {
        this.maxGrading = 50;
    }

    public void setType(String type) {
        this.type = "Final Exam";
    }

   
    
    
    
}

