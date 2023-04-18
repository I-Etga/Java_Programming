package daily_videos.day30_inheritanceContinue.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person {

    private LocalDate electedDate;

    public President(String name, char gender, LocalDate DOB, LocalDate electedDate) {
        super(name, gender, DOB);// comes automatically, when we generate constructor !
        setElectedDate(electedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie() {
        System.out.println(getName() + " is lying");
        // name is private in superClass. We can't access it directly. But we can access set/get method and through setter and getter the variable !!
    }
}
