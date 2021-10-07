import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ConcertAdmin extends User{
    public ConcertAdmin(String userName, String password) {
        super( userName, password);
    }

// Laura
    public static void createAdmin (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your favorite bookingSystem");
        System.out.println("First time logging in - we need to create your admin profile!");

        //Create admin object
        System.out.println("Please choose your username: ");
        String concertAdminUserName = scanner.next();

        System.out.println("Please choose your password: ");
        String concertAdminPassword = scanner.next();

        ConcertAdmin concertAdmin = new ConcertAdmin(concertAdminUserName,concertAdminPassword);

        //Show admin object
        System.out.println("Your admin username: " + concertAdmin.getUserName());
        System.out.println("Your admin email: " + concertAdmin.createEmail());
    }

    public double getPrice(double bandStartPrice, double eventPrice){
        return bandStartPrice + eventPrice;
    }

    // Simon
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
