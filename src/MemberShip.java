public class MemberShip {
    private MemberShipStatus status;
    private SwimmerType swimmerType;


    //Opretter et passivt medlemskab
    public MemberShip(){
        this.status = MemberShipStatus.PASSIVE;
        this.swimmerType = SwimmerType.NONE;
    }

    //Opretter et aktivt medlemskab
    public MemberShip(SwimmerType swimmerType) {
        setActive(swimmerType);
    }

    //Setters

    public void setActive(SwimmerType swimmerType){
        if (swimmerType == null || swimmerType == SwimmerType.NONE) {
            throw new IllegalArgumentException("Aktivt medlemskab kræver man er motionist eller konkurrencesvømmer.");
        }
        this.status = MemberShipStatus.ACTIVE;
        this.swimmerType = swimmerType;
    }

    public void setPassive() {
        this.status = MemberShipStatus.PASSIVE;
        this.swimmerType = SwimmerType.NONE;
    }

    //Getters
    public MemberShipStatus getStatus() {return status;}
    public SwimmerType getSwimmerType() {return swimmerType;}


}
