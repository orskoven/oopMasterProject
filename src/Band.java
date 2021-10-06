public class Band {
    private String bandName;
    private int startPrice;
    private boolean isContract;

    public Band(String bandName, int startPrice, boolean isContract) {
        this.bandName = bandName;
        this.startPrice = startPrice;
        this.isContract = isContract;
    }

    public int getStartPrice(){
        return startPrice;
    }
}
