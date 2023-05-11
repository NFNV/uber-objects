package POO.Java;

class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        // reference atributes and methods to the superclass
        super(license, driver);
        // reference atributes and methods to this class or subclass
        this.brand = brand;
        this.model = model;
    }
}
