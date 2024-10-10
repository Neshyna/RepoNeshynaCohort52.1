package lesson21;

public class AutoPark {
    public static void main(String[] args) {

        Driver driver = new Driver("LN-234567", "John");

        Autobus bus = new Autobus(driver,15);

        Driver driver1 = new Driver("DE-23456","Margo");
        Autobus bus1 = new Autobus(driver1,24);

        System.out.println("bus: " + bus.toString());
        System.out.println("bus1: " + bus1.toString());

        Driver peter = new Driver("FG_23456", "peter");
        bus1.setDriver(peter);
        System.out.println("bus1: " + bus1.toString());


        System.out.println("============");

        System.out.println("number passengers: " + bus.getCountPassengers());
        bus.showListPassengers();

        Passenger passenger = new Passenger("John");
        Passenger passenger1 = new Passenger("Margo");
        bus.takePassenger(passenger);
        bus.showListPassengers();
        bus.takePassenger(passenger1);
        bus.showListPassengers();
        bus.takePassenger(passenger1);



    }
}
