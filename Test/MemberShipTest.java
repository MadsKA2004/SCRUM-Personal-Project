import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MemberShipTest {

    @Test
    void testDefaultMembershipIsPassive() {
        MemberShip memberShip = new MemberShip();

        assertEquals(MemberShipStatus.PASSIVE, memberShip.getStatus());
        assertEquals(SwimmerType.NONE, memberShip.getSwimmerType());
    }

    @Test
    void testActiveCasualMembership(){
        MemberShip memberShip = new MemberShip(SwimmerType.CASUAL);

        assertEquals(MemberShipStatus.ACTIVE, memberShip.getStatus());
        assertEquals(SwimmerType.CASUAL, memberShip.getSwimmerType());
    }

    @Test
    void testActiveCompetitiveMembership() {
        MemberShip memberShip = new MemberShip(SwimmerType.COMPETITIVE);

        assertEquals(MemberShipStatus.ACTIVE, memberShip.getStatus());
        assertEquals(SwimmerType.COMPETITIVE, memberShip.getSwimmerType());
    }

    @Test
    void testActiveMembershipThrowsExceptionWhenSwimmerTypeIsNone(){
        assertThrows(IllegalArgumentException.class, () -> {
            new MemberShip(SwimmerType.NONE);
        });
    }
}