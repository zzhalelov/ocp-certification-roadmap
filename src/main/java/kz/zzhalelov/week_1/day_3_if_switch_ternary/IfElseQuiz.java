package kz.zzhalelov.week_1.day_3_if_switch_ternary;

//Почему else относится не к первому if, а ко второму?
//ОТВЕТ: потому что для начала выполняется if внутри, затем внешний if
public class IfElseQuiz {
    public static void main(String[] args) {
        int x = 5;
        if (x > 3)
            if (x < 10)
                System.out.println("x между 3 и 10");
            else
                System.out.println("x не больше 3");
    }
}