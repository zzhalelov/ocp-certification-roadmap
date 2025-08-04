package kz.zzhalelov.week_1.day_4_loops;

import java.util.Scanner;

//Гарантируй хотя бы одно выполнение с помощью do-while.
public class AskName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        // Спроси имя пользователя, если оно пустое — спроси снова
        do {
            System.out.println("Введи имя");
            name = sc.nextLine();
            System.out.println("Имя: " + name);
            break;
        } while (true);
    }
}