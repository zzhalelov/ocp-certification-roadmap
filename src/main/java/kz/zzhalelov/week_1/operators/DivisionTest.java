package kz.zzhalelov.week_1.operators;

//Почему результат не 2.5? Как это исправить?
//если необходимо сделать 2.5 нужен cast ((double) a / b)
public class DivisionTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        double result = a / b;
        System.out.println(result); // 2, т.к. целочисленное деление
    }
}