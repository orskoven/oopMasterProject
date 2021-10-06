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
}
