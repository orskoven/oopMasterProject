public class BookingSystem {
    private int time;
    private int numberOfGuests;
    private double ticketPrice;

    public BookingSystem(int time, int numberOfGuests, double ticketPrice) {
        this.time = time;
        this.numberOfGuests = numberOfGuests;
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfGuests(){
        return numberOfGuests;
    }
    public double getTicketPrice(){
        return ticketPrice;
    }
    public double getEventTicketPrice(Event event){
        return event.getEventRevenue((double) numberOfGuests/event.getNumberOfBands());

    }

    @Override
    public String toString() {
        return "BookingSystem{" +
                "time=" + time +
                ", numberOfGuests=" + numberOfGuests +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
