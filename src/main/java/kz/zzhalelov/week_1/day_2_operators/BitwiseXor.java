package kz.zzhalelov.week_1.day_2_operators;

//Что делает оператор ^ и в каких случаях он может быть полезен в алгоритмах?
public class BitwiseXor {
    public static void main(String[] args) {
        int a = 6; // 0110
        int b = 3; // 0011

        int c = a ^ b;
        System.out.println(c); //5
    }
}