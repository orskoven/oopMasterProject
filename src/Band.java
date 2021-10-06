public class Band {
    private String bandName;
    private int members;
    private int startPrice;
    private boolean isContract;

    public Band(String bandName, int members, int startPrice, boolean isContract) {
        this.bandName = bandName;
        this.members = members;
        this.startPrice = startPrice;
        this.isContract = isContract;
    }

    public int getStartPrice(){
        return startPrice;
    }
}
