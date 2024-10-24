package repository;

import model.Car;
import utils.MyArrayList;
import utils.MyList;

import java.util.concurrent.atomic.AtomicInteger;

/*
CRUD - operations
create - add new
read - receive  or read data
update - changedata
delete

 */

public class CarRepoImpl implements CarRepo {

    //all cars stored
    private final MyList<Car> cars;

    //obj responsible for generation of unique id
    private final AtomicInteger currentId = new AtomicInteger(1);

    public CarRepoImpl() {
        this.cars = new MyArrayList<>();
    }

    @Override
    public void addCar(String model, int year, double price) {
        Car car = new Car(currentId.getAndIncrement(),model,year,price);
        //analogue currentId++ to get current id and then +1 to enlarge it
        cars.add(car);//saved in storage
    }

    @Override
    public MyList<Car> getAllCars() {
        return null;
    }

    @Override
    public Car getById(int id) {
        return null;
    }

    @Override
    public MyList<Car> getCarsByModel(String model) {
        return null;
    }

    @Override
    public MyList<Car> getFreeCars() {
        return null;
    }

    @Override
    public boolean updateCarModel(int id, String model) {
        return false;
    }

    @Override
    public boolean takeCar(int id) {
        return false;
    }

    @Override
    public Car deleteCar(int id) {
        return null;
    }
}
