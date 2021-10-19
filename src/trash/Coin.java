package trash;

public enum Coin {
    //VALUES ARE IN ASCENDING ORDER
    COPPER("cp",1),SILVER("sp",10),ELECTRUM("ep",50),GOLD("gp",100),PLATINUM("pp",1000);


    private String shortName, string;
    private int copperValue;

    Coin(String shortName, int copperValue) {
        this.shortName = shortName;
        this.copperValue = copperValue;
        this.string = super.toString().charAt(0) + super.toString().substring(1);
    }

    public int getCopperValue() {
        return copperValue;
    }

    public String toString() {
        return string;
    }

    public String getShort() {
        return shortName;
    }
}
