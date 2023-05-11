class Main {
    public static void main(String[] args) {
        Car car = new Car("ASD123", new Account("QWE EWQ", "12332131"));
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car("LKJ876", new Account("OPI MNB", "89778675"));
        car.passengers = 4;
        car.printDataCar();
    }
}