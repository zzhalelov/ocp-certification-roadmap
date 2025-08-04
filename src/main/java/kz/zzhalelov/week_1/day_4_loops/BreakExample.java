package kz.zzhalelov.week_1.day_4_loops;

//Как только найдёшь — выведи и выйди из цикла с break.
public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Найди первое число, кратное 17, больше 50
            if ((i % 17 == 0) && (i > 50)) {
                System.out.println(i);
                break;
            }
        }
    }
}