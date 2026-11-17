import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class QuotaTest {

    @Test
    public void testCalculateYearlyQuotaUnder18() {
        MemberShip memberShip = new MemberShip(SwimmerType.CASUAL);
        Member member = new Member(1, "jan", "AD", "+23", "@", LocalDate.of(2018, 12, 24), memberShip );
        Quota quota = new Quota(member);
        double result = quota.calculateYearlyQuota(member);

        assertEquals(1000, result);
    }

    @Test
    public void testCalculateYearlyQuotaAbove18() {
        MemberShip memberShip = new MemberShip(SwimmerType.COMPETITIVE);
        Member member = new Member(1, "jan", "AD", "+23", "@", LocalDate.of(2000, 12, 24), memberShip);
        Quota quota = new Quota(member);
        double result = quota.calculateYearlyQuota(member);

        assertEquals(1600, result);
    }

    @Test
    public void testCalculateYearlyQuotaAbove60() {
        MemberShip memberShip = new MemberShip(SwimmerType.COMPETITIVE);
        Member member = new Member(1, "jan", "AD", "+23", "@", LocalDate.of(1965, 12, 24), memberShip);
        Quota quota = new Quota(member);
        double result = quota.calculateYearlyQuota(member);

        assertEquals(1200, result);
    }

    @Test
    public void testCalculateYearlyQuotaAbove60SameYear() {
        MemberShip memberShip = new MemberShip(SwimmerType.CASUAL);
        Member member =new Member(1, "jan", "AD", "+23", "@", LocalDate.of(1966, 12, 24), memberShip);
        Quota quota = new Quota(member);
        double result = quota.calculateYearlyQuota(member);

        assertEquals(1600, result);
    }

    @Test
    public void testCalculateYearlyQuotaIsPassive() {
        MemberShip memberShip = new MemberShip();
        Member member = new Member(1, "jan", "AD", "+23", "@", LocalDate.of(2000, 12, 24), memberShip);
        Quota quota = new Quota(member);
        double result = quota.calculateYearlyQuota(member);

        assertEquals(500, result);
    }

    @Test
    public void testcalculateQuotaUnder18() {
        MemberShip memberShip = new MemberShip(SwimmerType.CASUAL);
        Member member = new Member(1, "jan", "AD", "+23", "@", LocalDate.of(2018, 12, 24), memberShip );
        Quota quota = new Quota(member);
        double result = quota.calculateQuota(member);

        assertEquals(83.33, result);
    }

    @Test
    public void testCalculateQuotaAbove18() {
        MemberShip memberShip = new MemberShip(SwimmerType.CASUAL);
        Member member = new Member(1, "jan", "AD", "+23", "@", LocalDate.of(2000, 12, 24), memberShip );
        Quota quota = new Quota(member);
        double result = quota.calculateQuota(member);

        assertEquals(133.33, result);
    }

    @Test
    public void testCalculateQuotaAbove60() {
        MemberShip memberShip = new MemberShip(SwimmerType.CASUAL);
        Member member = new Member(1, "jan", "AD", "+23", "@", LocalDate.of(1965, 12, 24), memberShip );
        Quota quota = new Quota(member);
        double result = quota.calculateQuota(member);

        assertEquals(100, result);
    }
}
