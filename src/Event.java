import java.util.Scanner;

public class Event extends BookingSystem {
    private double bandBonus;
    private String contactEmail;
    private String eventLocation;
    private int numberOfBands;
    private int capacity;
    private String playingBand;
    private int[] bandId;

    public Event(int time, int numberOfGuests, double ticketPrice, double bandBonus, String contactEmail, String eventLocation, int numberOfBands, int capacity, String playingBand, int[] bandId) {
        super(time, numberOfGuests, ticketPrice);
        this.bandBonus = bandBonus;
        this.contactEmail = contactEmail;
        this.eventLocation = eventLocation;
        this.numberOfBands = numberOfBands;
        this.capacity = capacity;
        this.playingBand = playingBand;
        this.bandId = bandId;
    }

    public double getVacantSeatsInPercent(int capacity, int numberOfGuests){
        return (double) numberOfGuests/capacity;
    }
    public double getBandBonus(int numberOfGuests, double ticketPrice) {
        return (getVacantSeatsInPercent(capacity, numberOfGuests) == 1) ? 0.25 * ticketPrice * numberOfGuests :
                (getVacantSeatsInPercent(capacity, numberOfGuests) > 0.50)?0.10 * ticketPrice * numberOfGuests:0;
    }
    public double getEventRevenue(double eventPrice){
        return getTicketPrice()*getNumberOfGuests() - eventPrice;
    }

    public void chooseEvent(String playingBand, int[] bandId) {
        System.out.println("Choose an event for the band!\n" +
                "press 1 for Java music rock festival, 2 for roskilde festival and 3 for smukfest");
        Scanner scanner = new Scanner(System.in);
        String chosenEvent = scanner.nextLine();

        if (chosenEvent.equals("1")) {
            Event roskildeFestival = new Event(20, 90000, 100, 1000, "Peter@hotmail.com", "Roskilde",100 , 120000, playingBand, bandId);
        } else if (chosenEvent.equals("2")) {
            Event javaMusicRockFestival = new Event(24, 250, 80, 0, "søren.JavaRock@gmail.com", "Nørrebro", 2, 400, playingBand, bandId);
        } else if (chosenEvent.equals("3")) {
            Event smukFest = new Event(22, 10000, 100, 100, "henriette@hotmail.com" , "skanderborg", 10, 10000, playingBand, bandId);
        }


    }

}
