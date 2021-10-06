public class Guests extends User{
    private int numberOfTickets;
    private String email;

    public Guests(String userName, String password, int numberOfTickets, String email) {
        super(userName, password);
        this.numberOfTickets = numberOfTickets;
        this.email = email;
    }
}
