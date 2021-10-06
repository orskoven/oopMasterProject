import java.util.Locale;
import java.util.Random;

public class ConcertAdmin extends User{
    public ConcertAdmin(String userName, String password) {
        super( userName, password);
    }

    public double getPrice(double bandStartPrice, double eventPrice){
        return bandStartPrice + eventPrice;
    }

    public String createEmail() {
        return getInitials(getUserName()) + getRandomNumber(0,9) + "@book-din-event-nu.dk";
    }

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + max;
    }

    public String getInitials(String studentName) {
        String reversed = "";
        for (int i = 0; i+getUserName().length()-1 <= getUserName().length(); i++) {
            char k = (char) (getUserName().charAt(i) );
            reversed += k;
        }
        return reversed.toLowerCase(Locale.ROOT);

    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }
}
