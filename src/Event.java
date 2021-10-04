public class Event extends BookingSystem {
    public double bandBonus;
    public String contactEmail;
    public String contactName;
    public String address;
    public int eventTime;
    public String eventplace;
    public int numberOfBands;
    public int capacity;

    public Event(int time, int numberOfGuests, int numberOfBands, double ticketPrice, double bandBonus,
                 String contactEmail, String contactName, String address, int eventTime,
                 String eventplace, int capacity) {
        super(time, numberOfGuests, ticketPrice);
        this.bandBonus = bandBonus;
        this.contactEmail = contactEmail;
        this.contactName = contactName;
        this.address = address;
        this.eventTime = eventTime;
        this.eventplace = eventplace;
        this.numberOfBands = numberOfBands;
        this.capacity = capacity;
    }
    public double getVacantSeatsInPercent(int capacity, int numberOfGuests){
        return (double) numberOfGuests/capacity;
    }
    public double getBandBonus(int numberOfGuests, double ticketPrice) {
        return (getVacantSeatsInPercent(capacity, numberOfGuests) == 1) ? 0.25 * ticketPrice * numberOfGuests :
                (getVacantSeatsInPercent(capacity, numberOfGuests) > 0.50)?0.10 * ticketPrice * numberOfGuests:0;
    }
}
