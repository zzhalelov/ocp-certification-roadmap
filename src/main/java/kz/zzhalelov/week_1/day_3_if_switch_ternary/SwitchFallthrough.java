package kz.zzhalelov.week_1.day_3_if_switch_ternary;

//Что будет выведено? Почему? Как это исправить?
//Ответ: не установлены break
public class SwitchFallthrough {
    public static void main(String[] args) {
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            default:
                System.out.println("День неизвестен");
        }
    }
}