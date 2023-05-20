package POO.Java;

class UberBlack extends Car {
    Map<String, ArrayList<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial

    public UberBlack(String license, Account driver, Map<String, ArrayList<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {

        // reference atributes and methods to the superclass
        super(license, driver);
        // reference atributes and methods to this class or subclass
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
