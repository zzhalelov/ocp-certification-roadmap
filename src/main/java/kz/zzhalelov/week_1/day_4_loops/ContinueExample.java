package kz.zzhalelov.week_1.day_4_loops;

//Ожидаемый вывод: 1 3 5 7 9
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Выведи только нечётные числа (continue)
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}