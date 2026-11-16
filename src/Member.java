import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private LocalDate birthday;
    List<Member> members = new ArrayList<>();

    public Member(int memberId, String name, String address, String phoneNumber, String email, LocalDate birthday) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
    }

    public void addMember(Member member) {members.add(member);}

    public int getMemberId() {return memberId;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getAddress() {return address;}
    public String getPhoneNumber() {return phoneNumber;}
    public LocalDate getBirthday() {return birthday;}


    public int calculateAge(){
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public boolean isJunior() {
        return calculateAge() < 18;
    }
    public Boolean isSenior() {
        return !isJunior();
    }
}
