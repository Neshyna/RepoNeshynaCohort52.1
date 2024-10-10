package lesson21;

import java.util.Arrays;

public class Autobus {
    /*
    для создания связи типа has-a мы определяем поле классаю
    которое будет хранить ссылку на объект другого класса

    ассоциация(фгрегация и композиция) реализуется через
    создание ссылок на другие объекты внутри классаю
    отношение, где один класс использует другой в качестве одного из
    своих полей

    агрегация . водитель может быть отдельно о автобуса
    композиция . автопилот неотъемлемая часть автобуса. без буса не
    может существовать


    важн аспекты ассоциации
    направленые связи. однонаправленая или двунаправленая
    кардинальность связи. опр сколько объектов одного класса может
    быть ассоциирован с объектом др класса

    one to one (автобус и двигатель), one to many(автобус и пассажиры),
    many to many(бус и список остановок)
     */


    private static int counter = 1;
    private  final int id;
    private  final  int capacity;
    private int countPassengers;

    private Driver driver;//агрегация
    private Autopilot autopilot;//композиция

    private final Passenger[] passengers;

    public Autobus(Driver driver,int capacity){
        this.id = counter;
        counter++;
        this.capacity = capacity;
        this.driver = driver;
        this.autopilot = new Autopilot("Ap-v001");
        this.autopilot.setAutobus(this);//двунаправлен связь
        this.passengers = new Passenger[capacity];
    }

    public void showListPassengers(){

        if(countPassengers == 0){
        System.out.println("[]");
        return ;
        }
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < countPassengers;i++){
            sb.append(passengers[i].toString());
            sb.append((i < countPassengers -1 )? "," : "]");
        }
        System.out.println(sb.toString());
    }

    public boolean takePassenger(Passenger passenger){
        if(passenger == null){
            return false;
        }
        if(countPassengers < capacity){
            if(isPassengerInBus(passenger)){
                System.out.printf("passenger %d is already in bus with id %d" , passenger.getId(),this.id);
                return false;
            }
            passengers[countPassengers] = passenger;
            countPassengers++;
            System.out.printf("passenger %d in bus with id %d" , passenger.getId(),this.id);
            return true;

        }
        System.out.printf("in bus id %d no free places" , this.id);
        return false;
    }


    private boolean isPassengerInBus (Passenger passenger){
        for(int i =0 ; i < countPassengers; i++){
            if(passengers[i].getId() == passenger.getId()){
                return true;
            }
        }
        return false;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public Driver getDriver() {
        return driver;
    }

    public Autopilot getAutopilot() {
        return autopilot;
    }

    public  String toString(){
        return "Autobus: {id: " + id + " , capacity: " + capacity +
                " ,driver: " + driver.toString() +
                " ; autopilot: " + autopilot.toString() +  " } ";
    }

    public void updateAutopilotVersion (String softwareVersion){

        this.autopilot.setSoftwareVersion(softwareVersion);
    }
    public void installNewAutopilot(String softwareVersion){

        this.autopilot = new Autopilot(softwareVersion);
    }
}
