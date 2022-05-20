
package Accessibility;

import java.io.Serializable;
import java.time.LocalDateTime;

public class finalExam extends Exam implements Serializable{

    public finalExam(String id, LocalDateTime startDate, LocalDateTime dueDate, String subjectName) {
        super(id, startDate, dueDate, subjectName);
         this.type = "Final Exam";
         this.maxGrading = 50;
    }

    public void setType(String type) {
        this.type = "Final Exam";
    }

   
    
    
    
}

