import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to your favorite bookingSystem");
        System.out.println("First time logging in - we need to create your admin profile!");

        //Create admin object
        System.out.println("Please choose your username: ");
        String concertAdminUserName = "LoneR";                              //scanner.next();

        System.out.println("Please choose your password: ");
        String concertAdminPassword = "lone123";                            //scanner.next();

        ConcertAdmin concertAdmin = new ConcertAdmin(concertAdminUserName,concertAdminPassword);

        //Show admin object
        System.out.println("Your admin username: " + concertAdmin.getUserName());
        System.out.println("Your admin email: " + concertAdmin.createEmail());

        //Create


        //Guests peter = new Guests("peterpeter","123peter");
        //ConcertAdmin lone = new ConcertAdmin("LoneR","lone123");
        Band javaMusic = new Band("javaMusic", 4,100000,true);
        Event smukFest = new Event(22,10000,100,100,200,"henriette@hotmail.com","henriette","skanderborgvej 1",22,"skanderborg",10000);
        Double smukFestPris = lone.getPrice(javaMusic.getStartPrice(), smukFest.getBandBonus(smukFest.getNumberOfGuests(), smukFest.getTicketPrice()));
        System.out.println(smukFestPris);
        Double bandSmukfestBonus = smukFest.getBandBonus(smukFest.getNumberOfGuests(), smukFest.getTicketPrice());
        System.out.println(bandSmukfestBonus);
        System.out.println(smukFest.getEventRevenue(smukFestPris));

    }
}
