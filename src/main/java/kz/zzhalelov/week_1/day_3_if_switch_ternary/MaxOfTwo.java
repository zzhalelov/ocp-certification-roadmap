package kz.zzhalelov.week_1.day_3_if_switch_ternary;

// Используй тернарный оператор, чтобы вывести большее из a и b
public class MaxOfTwo {
    public static void main(String[] args) {
        int a = 12;
        int b = 15;

        String result = a > b ? "a больше b" : "a меньше b";
        System.out.println(result);
    }
}