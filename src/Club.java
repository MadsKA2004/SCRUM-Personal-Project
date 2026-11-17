import java.util.ArrayList;
import java.util.List;

public class Club {
    private List<Member> members = new ArrayList<>();

    private Team juniorTeam = new Team("Juniorholdet", "Anders");
    private Team seniorTeam = new Team("Seniorholdet", "Mette");

    //Getters - til at hente holdene og vise deres Top-5 lister i UI
    public Team getJuniorTeam() {return juniorTeam;}
    public Team getSeniorTeam() {return seniorTeam;}
    public List<Member> getMembers() {return members;}

    // Kører når man tilføjer et almindeligt medlem (Motionist/passiv)
    public void addMember(Member member) {members.add(member);}

    // Kører kun når man tilføjer en CompetitionSwimmer
    public void addMember(CompetitionSwimmer swimmer) {
        members.add(swimmer);
        if (swimmer.isJunior()) {
            juniorTeam.addSwimmer(swimmer);
        } else {
            seniorTeam.addSwimmer(swimmer);
        }
    }

    public Member findMemberByMemberId(int memberId) {
        for (Member member : members) {
            if (memberId == member.getMemberId()) {
                return member;
            }
        }
        return null;
    }
}