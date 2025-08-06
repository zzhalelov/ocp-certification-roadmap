package kz.zzhalelov.week_1.operators;

//Объясни, почему такие результаты. Какие биты установлены в ответе?
public class Bitwise {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println(a & b); // AND //1
        System.out.println(a | b); // OR //7
    }
}