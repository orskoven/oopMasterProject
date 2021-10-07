import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Event extends BookingSystem {
    private static int capacity;
    private double bandBonus;
    private String contactEmail;
    private String eventLocation;
    private int numberOfBands;
    static int[] bandId;

    public Event(int time, int numberOfGuests, double ticketPrice, double bandBonus, String contactEmail, String eventLocation, int numberOfBands, int capacity, int[] bandId) {
        super(time, numberOfGuests, ticketPrice);
        this.bandBonus = bandBonus;
        this.contactEmail = contactEmail;
        this.eventLocation = eventLocation;
        this.numberOfBands = numberOfBands;
        this.capacity = capacity;
        Event.bandId = bandId;
    }

    public static double getVacantSeatsInPercent(int capacity, int numberOfGuests){
        return (double) numberOfGuests/capacity;
    }
    public static double getBandBonus(int numberOfGuests, double ticketPrice) {
        return (getVacantSeatsInPercent(capacity, numberOfGuests) == 1) ? 0.25 * ticketPrice * numberOfGuests :
                (getVacantSeatsInPercent(capacity, numberOfGuests) > 0.50)?0.10 * ticketPrice * numberOfGuests:0;
    }
    public double getEventRevenue(double eventPrice){
        return getTicketPrice()*getNumberOfGuests() - eventPrice;
    }

    public static void chooseEvent(int[] bandId, int numberOfBands) {
        System.out.println("Choose an event for the band!\n" +
                "press 1 for roskilde festival, 2 for Java music rock festival and 3 for smukfest");
        Scanner scanner = new Scanner(System.in);
        String chosenEvent = scanner.nextLine();

        if (chosenEvent.equals("1")) {
            Event roskildeFestival = new Event(20, 90000, 600, getBandBonus(90000, 600), "Peter@hotmail.com", "Roskilde",numberOfBands , 120000, bandId);
            System.out.println(roskildeFestival);
        } else if (chosenEvent.equals("2")) {
            Event javaMusicRockFestival = new Event(24, 250, 80, 0, "søren.JavaRock@gmail.com", "Nørrebro", numberOfBands, 400, bandId);
            System.out.println(javaMusicRockFestival);
        } else if (chosenEvent.equals("3")) {
            Event smukFest = new Event(22, 10000, 100, getBandBonus(10000, 100), "henriette@hotmail.com" , "skanderborg", numberOfBands, 10000, bandId);
            System.out.println(smukFest);
        }



    }
    public static void bandCreatorInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bands do you need to create?");
        int numberOfBands = scanner.nextInt();
        int[] bandIdArrays = new int[numberOfBands];
        String[] bandNameArrays = new String[numberOfBands];
        for (int i = 0; i < numberOfBands; i++) {
            System.out.println("Let's add a band!\nWhat's the band name");
            String bandName = scanner.next();
            System.out.println("How many members are there in the band?");
            int bandMembers = scanner.nextInt();
            System.out.println("What is the bands start price?");
            int bandStartPrice = scanner.nextInt();
            System.out.println("Is the band contract approved?1/0");
            int isContractApproved = scanner.nextInt();
            int bandIdNumber  = getRandomNumber(0,100000);
            Band newBand = new Band(bandName, bandMembers, bandStartPrice, isContractApproved(isContractApproved), bandIdNumber);
            bandIdArrays[i] = bandIdNumber;
            Event.bandId = bandIdArrays;
            bandNameArrays[i] = bandName;
        }
        System.out.println();
        Event.chooseEvent((bandId), numberOfBands);
        for (String bandNames:bandNameArrays) {
            System.out.println("Band: " + bandNames);

        }

        }
        public int getNumberOfBands(){
        return numberOfBands;
        }

    public static boolean isContractApproved(int inputAnswerToContract) {
        return inputAnswerToContract == 1;
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + max;

    }

    @Override
    public String toString() {
        return "Event{" +
                "bandBonus=" + bandBonus +
                ", contactEmail='" + contactEmail + '\'' +
                ", eventLocation='" + eventLocation + '\'' +
                ", numberOfBands=" + numberOfBands +
                ", capacity=" + capacity +
                ", bandId=" + Arrays.toString(bandId) +
                '}';
    }
}
