package kz.zzhalelov.week_1.day_3_if_switch_ternary;

// Выведи количество дней: 30, 31 или 28/29
public class MonthName {
    public static void main(String[] args) {
        String month = "апрель";
        String num = switch (month) {
            case "январь", "март", "май", "июль", "август", "октябрь", "декабрь" -> num = "31";
            case "апрель", "июнь", "сентябрь", "ноябрь" -> "30";
            case "февраль" -> "28/29";
            default -> "месяц не распознан";
        };

        System.out.println(num);
    }
}