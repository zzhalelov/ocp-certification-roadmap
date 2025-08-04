package kz.zzhalelov.week_1.day_4_loops;

// Выведи таблицу умножения от 1 до 10
// Пример вывода: 5 x 1 = 5, ..., 5 x 10 = 50
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + number * i);
        }
    }
}