import java.time.LocalDate;

public class SwimResult {
    private Discipline discipline;
    private double finishTime; //Omdøbt fra timeInSeconds
    private LocalDate date;
    private boolean isCompetition;
    private String competitionName;
    private int placement;

    // Konstruktør til træning
    public SwimResult(Discipline discipline, double finishTime, LocalDate date) {
        this.discipline = discipline;
        this.finishTime = finishTime;
        this.date = date;
        this.isCompetition = false;
    }

    //Konstruktør til stævne
    public SwimResult(Discipline discipline, double finishTime, LocalDate date, String competitionName, int placement) {
        this.discipline = discipline;
        this.finishTime = finishTime;
        this.date = date;
        this.isCompetition = true;
        this.competitionName = competitionName;
        this.placement = placement;
    }

    //Getters
    public Discipline getDiscipline() {return discipline;}
    public double getFinishTime() {return finishTime;}
    public boolean isCompetition() {return isCompetition;}


    @Override
    public String toString() {
        if (isCompetition) {
            return String.format("""
                    %s
                    Tid: %.2f sek.
                    Dato: %s
                    (Stævne: %s, Placering: %d""",
                    discipline, finishTime, date, competitionName, placement);
        } else {
            return String.format("""
                    %s
                    Tid: %.2f sek.
                    Dato: %s (Træning)""",
                    discipline,finishTime, date);
        }
    }
}
