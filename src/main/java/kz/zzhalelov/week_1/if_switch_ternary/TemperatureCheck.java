package kz.zzhalelov.week_1.if_switch_ternary;

//Градусы и замерзание (if-else if)
public class TemperatureCheck {
    public static void main(String[] args) {
        int temp = -3;

        // если temp < 0 → "Замерзание"
        // если temp < 15 → "Прохладно"
        // если temp >= 15 → "Тепло"
        if (temp < 0) {
            System.out.println("Замерзание");
        } else if (temp < 15) {
            System.out.println("Прохладно");
        } else {
            System.out.println("Тепло");
        }
    }
}