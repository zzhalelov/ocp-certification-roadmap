package kz.zzhalelov.week_1.day_4_loops;

//Последовательность: 0 1 1 2 3 5 8 13 21 34
// Выведи первые 10 чисел Фибоначчи
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + " " + n2 + " ");

        for (int i = 3; i <= 10; i++) {
            int next = n1 + n2;
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
        }
    }
}