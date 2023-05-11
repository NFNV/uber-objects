package POO.Java;

class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){
        // reference atributes and methods to the superclass
        super(license, driver);
        // reference atributes and methods to this class or subclass
        this.brand = brand;
        this.model = model;
    }
}
