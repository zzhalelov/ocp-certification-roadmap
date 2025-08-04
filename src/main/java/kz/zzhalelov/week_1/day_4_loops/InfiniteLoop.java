package kz.zzhalelov.week_1.day_4_loops;

//Почему программа зависает? Как это исправить?
public class InfiniteLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            // где ошибка?
            i++;
        }
    }
}