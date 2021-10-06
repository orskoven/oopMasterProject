public class Band {
    private String bandName;
    private int members;
    private int startPrice;
    private boolean isContract;
    private int bandId;

    public Band(String bandName, int members, int startPrice, boolean isContract, int bandId) {
        this.bandName = bandName;
        this.members = members;
        this.startPrice = startPrice;
        this.isContract = isContract;
        this.bandId = bandId;
    }

    public int getStartPrice(){
        return startPrice;
    }

    @Override
    public String toString() {
        return "Band{" +
                "bandName='" + bandName + '\'' +
                ", members=" + members +
                ", startPrice=" + startPrice +
                ", isContract=" + isContract +
                ", bandId=" + bandId +
                '}';
    }
}
