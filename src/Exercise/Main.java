package Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Trip> patten = new ArrayList<>();
    static Scanner joachim = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Create trip" + "\n" + "2. List trip");

            int christian = joachim.nextInt();

            if (christian == 1) {
                createTrip();
            } else {
                listTrips();
            }
        }
    }

    public static void createTrip() {
        System.out.println("1. Ordinary trip" + "\n" +  "2. Ski trip " + "\n" + "3. Beach trip");
        int christian = joachim.nextInt();
        joachim.nextLine();
        switch (christian) {
            case 1:
                System.out.println("Write country: ");
                String sverri = joachim.nextLine();
                System.out.println("Write duration of the trip: ");
                int sverri1 = joachim.nextInt();
                System.out.println("Write participants: ");
                int sverri2 = joachim.nextInt();
                System.out.println("Write how much maney you bring with you: ");
                int sverri3 = joachim.nextInt();
                patten.add(new Trip(sverri, sverri1, sverri2, sverri3));
                break;
            case 2:
                System.out.println("Write country: ");
                String sverri4 = joachim.nextLine();
                System.out.println("Write duration of the trip: ");
                int sverri5 = joachim.nextInt();
                System.out.println("Write participants: ");
                int sverri6 = joachim.nextInt();
                System.out.println("Write how much maney you bring with you: ");
                int sverri7 = joachim.nextInt();
                System.out.println("Write if you have a coach: ");
                boolean sverri8 = joachim.nextBoolean();
                System.out.println("Write 1 if you have a ski pas 2 if not: ");
                int sverri9 = joachim.nextInt();
                patten.add(new SkiTrip(sverri4, sverri5, sverri6, sverri7, sverri8, sverri9));
                break;
            case 3:
                System.out.println("Write country: ");
                String sverri10 = joachim.nextLine();
                System.out.println("Write duration of the trip: ");
                int sverri11 = joachim.nextInt();
                System.out.println("Write participants: ");
                int sverri12 = joachim.nextInt();
                System.out.println("Write how much maney you bring with you: ");
                int sverri13 = joachim.nextInt();
                System.out.println("Write yes if you have reserved beach chairs and no if u haven't: ");
                boolean sverri14 = joachim.nextBoolean();
                System.out.println("Write if you have a parasol: ");
                boolean sverri15 = joachim.nextBoolean();
                patten.add(new BeachTrip(sverri10, sverri11, sverri12, sverri13, sverri14, sverri15));
                break;
        }
    }

    public static void listTrips() {
        System.out.println(patten);
    }


}
