package kz.zzhalelov.week_1.day_3_if_switch_ternary;

//Измени код, чтобы выводилась буква "A", только если score ≥ 95.
public class TernaryNesting {
    public static void main(String[] args) {
        int score = 85;
        String grade = (score >= 95) ? "A" :
                (score >= 75) ? "B" :
                        (score >= 60) ? "C" : "F";

        System.out.println("Оценка: " + grade);
    }
}