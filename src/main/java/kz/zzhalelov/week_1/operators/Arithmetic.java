package kz.zzhalelov.week_1.operators;

//Что будет выведено? Объясни поведение оператора %.
public class Arithmetic {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;

        System.out.println(a / b); // 2, т.к. целочисленное деление
        System.out.println(a % b); // 1, т.к. остаток от деления
    }
}