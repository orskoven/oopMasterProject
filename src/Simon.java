import java.util.Scanner;

public class Simon {
    public Simon() {
    }

    public static void main(String[] args) {
        }
        public static boolean isContractApproved(String inputAnswerToContract) {
        return inputAnswerToContract == "Y";


        }
        public static void bandCreatorInterface(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hello, let's add a band!\nWhat's the band name");
            String bandName = scanner.nextLine();
            System.out.println("How many members are there in the band?");
            int bandMembers = scanner.nextInt();
            System.out.println("What is the bands start price?");
            int bandStartPrice = scanner.nextInt();
            System.out.println("Is the band contract approved?Y/N");
            System.out.println(scanner.nextLine());
            String isContractApproved = scanner.nextLine();
            Band newBand = new Band(bandName,bandMembers,bandStartPrice,isContractApproved(isContractApproved));

        }

    }

