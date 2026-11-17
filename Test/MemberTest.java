import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    @Test
    void testCreateValidMember() {
        LocalDate birthday = LocalDate.of(2000,5,10);
        //Member member = new Member(1, "Anders And", "Paradisæblevej 13",
                //"22364561", "Anders@andeby.dk", birthday);

        //Assert
        //assertEquals(1, member.getMemberId());
        //assertEquals("Anders And", member.getName());
        //assertEquals("Paradisæblevej 13",member.getAddress());
        //assertEquals("22364561", member.getPhoneNumber());
        //assertEquals("Anders@andeby.dk", member.getEmail());
        //&assertEquals(birthday, member.getBirthday());
    }

    //@Test
    //void testIsJuniorWhenUnder18() {

        //Fylder først 18 år i morgen -> stadigvæk 17 år (Junior) // tester grænsetilfælde
        //LocalDate almost18 = LocalDate.now().minusYears(18).plusDays(1);
        //Member juniorMember = new Member(2, "Rip And", "Paradisæblevej 13", "35664281", "rip@andeby.dk", almost18);

        //assertTrue(juniorMember.isJunior()); //Burde true
        //assertFalse(juniorMember.isSenior()); //Burde false
    //}

    //@Test
    //void testIsSeniorWhenExactly18() {

        // Fylder 18 år i dag -> Senior
        //LocalDate turns18Today = LocalDate.now().minusYears(18);
        //Member seniorMember = new Member(3, "Rip And", "Paradisæblevej 13", "35664281", "rip@andeby.dk", turns18Today);

        //assertFalse(seniorMember.isJunior()); //Burde false
        //assertTrue(seniorMember.isSenior()); //Burde true
    //}
}