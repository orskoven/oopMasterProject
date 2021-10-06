import java.util.Locale;
import java.util.Random;

public class Email extends User {
    private String email;

    public Email(String email, String userName, String password) {
        super(email, userName, password);

    }

    public String createEmail() {
        return getInitials(getUserName()) + getRandomNumber(0,9) + "@event-booking";
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
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                '}';
    }
}


