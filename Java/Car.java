package POO.Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passengers;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }

    void printDataCar(){
        if(passengers != null){
            System.out.println("License: " + license + "Driver: " + driver.name + "Passengers: " + passengers);
        }
    }

    public Integer getPassenger(){
        return passengers;
    }

    public void setPassenger(Integer passengers){
        if (passengers == 4){
            this.passengers = passengers;
        }else{
            System.out.println("You need 4 passengers.")
        }
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the driver
     */
    public Account getDriver() {
        return driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Account driver) {
        this.driver = driver;
    }
}
