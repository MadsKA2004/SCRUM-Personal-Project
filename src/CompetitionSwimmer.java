import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CompetitionSwimmer extends Member{
    List<SwimResult> swimResults = new ArrayList<>();

    public CompetitionSwimmer(int memberId, String name, String address, String phoneNumber, String email, LocalDate birthday) {
        //Her sender man et aktivt konkurrencemedlemskab med op til Member.
        super(memberId, name, address, phoneNumber, email, birthday, new MemberShip(SwimmerType.COMPETITIVE));
    }

    public void addSwimResult(SwimResult swimResult) {swimResults.add(swimResult);}
    public List<SwimResult> getSwimResults(){return swimResults;}


    //Metoden returnerer det hurtigste rekord tid i givent disciplin
    public SwimResult getBestResult(Discipline discipline) {
        SwimResult best = null;
        for (SwimResult result : swimResults) {
            if (result.getDiscipline() == discipline) {
                if (best == null || result.getFinishTime() < best.getFinishTime()) {
                    best = result;
                }
            }
        }
        return best;
    }
}
