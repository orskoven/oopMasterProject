import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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

        //Create
        Event.bandCreatorInterface();

        /*
        Double bandSmukfestBonus = smukFest.getBandBonus(smukFest.getNumberOfGuests(), smukFest.getTicketPrice());
        System.out.println(bandSmukfestBonus);
        System.out.println(smukFest.getEventRevenue(smukFestPris));

         */

    }

}
