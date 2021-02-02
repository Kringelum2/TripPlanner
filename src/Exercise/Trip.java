package Exercise;

public class Trip {

    private String country;
    private int duration;
    private int participants;
    private int maney;

    public Trip(String country, int duration, int participants, int maney) {
        this.country = country;
        this.duration = duration;
        this.participants = participants;
        this.maney = maney;
    }


    @Override
    public String toString() {
        return "Country: " + country + " Duration of trip: " + duration + " days " + "Participants: " + participants +
                " Maney: " + maney;
    }

}
