import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Team {
    private String teamName; //f.eks. "Juniorholdet" eller "Seniorholdet"
    private String coachName;
    private ArrayList<CompetitionSwimmer> swimmers = new ArrayList<>();

    public Team(String teamName, String coachName) {
        this.teamName = teamName;
        this.coachName = coachName;
    }

    public void addSwimmer(CompetitionSwimmer swimmer) {if (!swimmers.contains(swimmer)) {swimmers.add(swimmer);}}

    //Getters
    public String getTeamName() {return teamName;}
    public String getCoachName() {return coachName;}
    public ArrayList<CompetitionSwimmer> getSwimmers() {return swimmers;}


    //Metode til udskrivning af top-5 hurtigeste svømmere på holdet i en given discipline
    public List<CompetitionSwimmer> getTop5(Discipline discipline) {
        List<CompetitionSwimmer> qualified = new ArrayList<>();

        for (CompetitionSwimmer swimmer : swimmers) {
            if (swimmer.getBestResult(discipline) != null) {
                qualified.add(swimmer);
            }
        }
        // Sorterer fra hurtigste (laveste) finishTime til langsomste
        qualified.sort(Comparator.comparingDouble(swimmer -> swimmer.getBestResult(discipline).getFinishTime()));

        return qualified.subList(0, Math.min(5, qualified.size()));
    }
}
