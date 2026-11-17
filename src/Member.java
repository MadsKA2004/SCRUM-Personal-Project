import java.time.LocalDate;

public class Member {
    private int memberId;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private LocalDate birthday;
    private MemberShip membership;

    public Member(int memberId, String name, String address, String phoneNumber, String email, LocalDate birthday, MemberShip membership) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.birthday = birthday;
        this.membership = membership;
    }

    public int getMemberId() {return memberId;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getAddress() {return address;}
    public String getPhoneNumber() {return phoneNumber;}
    public LocalDate getBirthday() {return birthday;}
    public MemberShip getMembership() {return membership;}

    public boolean isJunior() {return membership.isJunior(this.birthday);}
    public int getAge() {return membership.calculateAge(this.birthday);}

    @Override
    public String toString() {
        return String.format ("""
                Medlemsnummer: %s
                Navn: %s
                Adresse: %s
                Telefonnummer: %s
                Email: %s
                Fødselsdato: %s
                """, memberId, name, address, phoneNumber,email, birthday);
    }
}
