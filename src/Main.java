import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create Admin
        ConcertAdmin.createAdmin();

        //Create Band and link event with bands
        Event.bandCreatorInterface();
    }

}
