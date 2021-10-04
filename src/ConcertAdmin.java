public class ConcertAdmin extends User{
    public ConcertAdmin(String email, String userName, String password) {
        super(email, userName, password);
    }

    public double getPrice(double bandStartPrice, double eventPrice){
        return bandStartPrice + eventPrice;
    }
}
