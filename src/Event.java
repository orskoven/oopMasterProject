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
}
