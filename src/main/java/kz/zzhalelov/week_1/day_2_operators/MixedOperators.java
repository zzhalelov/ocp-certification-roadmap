package kz.zzhalelov.week_1.day_2_operators;

//Попробуй вычислить вручную и объяснить порядок операций.
public class MixedOperators {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        int result = (x << 2) + (y >> 1) & 3;
        System.out.println(result); //1
    }
}