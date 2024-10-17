package hw26;
/*
Task3 * Опционально
Обобщенный класс с ограничениями типов
Описание:
Создайте обобщенный класс NumericPair, который хранит две числовые переменные
и имеет метод для вычисления их суммы.

Требования:

Класс должен иметь конструктор для инициализации двух чисел.
Метод double sum() возвращает сумму этих чисел.
 */

public class NumericPair<T> {

    private T x;
    private T y;

    public NumericPair(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public static <T extends Number> double sum(T x, T y){
        return x.doubleValue() + y.doubleValue();
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }


    public static void main(String[] args) {

        NumericPair<Integer> intPair = new NumericPair<>(10, 20);
        System.out.println(intPair.sum(intPair.getX(), intPair.getY())); // Вывод: 30.0

        NumericPair<Double> doublePair = new NumericPair<>(5.5, 4.5);
        System.out.println(doublePair.sum(doublePair.getX(), doublePair.getY())); // Вывод: 10.0
    }
}
