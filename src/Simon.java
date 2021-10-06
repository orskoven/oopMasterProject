import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Simon {
    public Simon() {
    }

    public static void main(String[] args) {
    }

    public static boolean isContractApproved(String inputAnswerToContract) {
        return inputAnswerToContract.toLowerCase(Locale.ROOT) == "Y";
    }

    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + max;

    }

    public static void bandCreatorInterface() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many bands do you need to create?");
        int numberOfBands = scanner.nextInt();
        for (int i = 0; i < numberOfBands; i++) {
            System.out.println("Let's add a band!\nWhat's the band name");
            System.out.println(scanner.nextLine());
            String bandName = scanner.nextLine();
            System.out.println("How many members are there in the band?");
            int bandMembers = scanner.nextInt();
            System.out.println("What is the bands start price?");
            int bandStartPrice = scanner.nextInt();
            System.out.println("Is the band contract approved?Y/N");
            System.out.println(scanner.nextLine());
            String isContractApproved = scanner.nextLine();
            Band newBand = new Band(bandName, bandMembers, bandStartPrice, isContractApproved(isContractApproved), getRandomNumber(0, 100000));
        }
    }
}


