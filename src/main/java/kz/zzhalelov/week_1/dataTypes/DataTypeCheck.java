package kz.zzhalelov.week_1.dataTypes;

//Что будет выведено на экран? Почему d получается таким?
public class DataTypeCheck {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32000;
        int c = a + b;
        double d = 5 / 2;
        System.out.println(c);
        System.out.println(d);
    }
}