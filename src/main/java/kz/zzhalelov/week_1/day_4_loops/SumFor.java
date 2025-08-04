package kz.zzhalelov.week_1.day_4_loops;

//Задача 1. Сумма чисел от 1 до 10 (for)
//Используй цикл for. Итог должен быть: 1 + 2 + ... + 10 = 55.
public class SumFor {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}