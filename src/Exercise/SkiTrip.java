package Exercise;

public class SkiTrip extends Trip {

    private boolean coach;
    private int skiPas;

    public SkiTrip(String country, int duration, int participants, int maney, boolean coach, int skiPas) {
        super(country, duration, participants, maney);
        this.coach = coach;
        this.skiPas = skiPas;
    }

    @Override
    public String toString() {
        return super.toString() + "Coach: " + coach + "Skipas: " + skiPas;
    }

}
