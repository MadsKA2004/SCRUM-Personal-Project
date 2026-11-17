public class Quota {
    Member member;

    public Quota (Member member) {
        this.member = member;
    }

    public double calculateYearlyQuota(Member member) {
        MemberShip memberShip = member.getMembership();
        int age = memberShip.calculateAge(member.getBirthday());
        //Member er passiv
        if (memberShip.getStatus() == MemberShipStatus.PASSIVE) {
            return 500;
        }
        //Member er under 18
        if (age < 18) {
            return 1000;
        }
        //Member over 60
        if (age >= 60) {
            return 1200;
        }
        //Member er mellem 18-60
        else {
            return 1600;
        }
    }

    public double calculateQuota(Member member) {
        return Math.round((calculateYearlyQuota(member) / 12)* 100.0)/100.0;
    }
}
