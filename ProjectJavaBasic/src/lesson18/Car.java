package lesson18;

public class Car {

    public static int totalCarProduced;

    private String model;
    private int powerPS;

    public Car(String model, int powerPS){
        this.model = model;
        this.powerPS = powerPS;
        totalCarProduced++;
        //увелич общ кол во авто при создании нов объекта

    }

    public String toString(){
        // Нельзя создать статическую переменную внутри какого-то метода
        //   static String result = "Hello";
        return String.format("Auto - model: %s, power: %d. Total number: %d" , model, powerPS, totalCarProduced);
    }

    public static void testStatic() {
        // В статике нельзя использовать this - обращение к текущему объекту
        // this.model
        System.out.println("Hello from static method");
    }
}
