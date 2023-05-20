class Main {
    public static void main(String[] args) {
        UberX uberX = new UberX("ASD123", new Account("QWE EWQ", "12332131"), "CarBrand1", "CarModel1");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FGH345", new Account("POK SDD", "987872321"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();

        // Car car2 = new Car("LKJ876", new Account("OPI MNB", "89778675"));
        // car.passengers = 4;
        // car.printDataCar();
    }
}