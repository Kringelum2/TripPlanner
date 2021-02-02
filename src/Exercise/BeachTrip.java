package Exercise;

public class BeachTrip extends Trip {

    private boolean beachChairs;
    private boolean parasol;

    public BeachTrip(String country, int duration, int participants, int maney, boolean beachChairs, boolean parasol) {
        super(country, duration, participants, maney);
        this.beachChairs = beachChairs;
        this.parasol = parasol;
    }

    @Override
    public String toString() {
        return super.toString() + "Beach chairs: " + beachChairs + "parasol: " + parasol;
    }
}
