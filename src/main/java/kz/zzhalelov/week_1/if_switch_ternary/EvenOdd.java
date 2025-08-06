package kz.zzhalelov.week_1.if_switch_ternary;

//Выведи "Четное", если n делится на 2, иначе — "Нечетное".
public class EvenOdd {
    public static void main(String[] args) {
        int n = 7;
        // добавь проверку
        if (n / 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}