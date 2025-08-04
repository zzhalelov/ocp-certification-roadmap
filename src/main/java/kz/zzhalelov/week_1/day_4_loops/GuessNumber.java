package kz.zzhalelov.week_1.day_4_loops;

import java.util.Scanner;

//Используй while, выводи: “Попробуй ещё” до тех пор, пока не введут 7.
public class GuessNumber {
    public static void main(String[] args) {
        int secret = 7;
        Scanner sc = new Scanner(System.in);
        int guess = -1;

        // Пока пользователь не введёт 7 — просим угадать
        while (guess != secret) {
            System.out.println("Попробуй ещё");
            break;
        }
    }
}