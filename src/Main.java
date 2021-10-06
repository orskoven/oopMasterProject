public class Main {
    public static void main(String[] args) {
        Guests peter = new Guests("peter@gmail.com","peterpeter","123peter");
        ConcertAdmin lone = new ConcertAdmin("lone@roskildefestivals.dk","LoneR","lone123");
        Band javaMusic = new Band("javaMusic",100000,true);
        Event smukFest = new Event(22,10000,100,100,200,"henriette@hotmail.com","henriette","skanderborgvej 1",22,"skanderborg",10000);
        Double smukFestPris = lone.getPrice(javaMusic.getStartPrice(), smukFest.getBandBonus(smukFest.getNumberOfGuests(), smukFest.getTicketPrice()));
        System.out.println(smukFestPris);
        Double bandSmukfestBonus = smukFest.getBandBonus(smukFest.getNumberOfGuests(), smukFest.getTicketPrice());
        System.out.println(bandSmukfestBonus);
        System.out.println(smukFest.getEventRevenue(smukFestPris));

    }
}
