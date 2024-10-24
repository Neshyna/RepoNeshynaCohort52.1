package repository;

import model.Car;
import utils.MyList;

public interface CarRepo {
    /*
CRUD - operations
create - add new
read - receive  or read data
update - changedata
delete

 */
//create - add
    void addCar(String model,int year, double price);

    //read
    MyList<Car> getAllCars();

    //get auto by id
    Car getById(int id);

    //receive list of cars by moder
    MyList<Car> getCarsByModel(String model);

    //receive list of free cars
    MyList<Car> getFreeCars();

    //update
    boolean updateCarModel(int id, String model);

    boolean takeCar(int id);

    //delete
    Car deleteCar(int id);
}
