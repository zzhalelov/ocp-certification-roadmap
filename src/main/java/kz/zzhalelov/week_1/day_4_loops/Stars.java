package kz.zzhalelov.week_1.day_4_loops;

//Ожидаемый вывод: 4 строки по 6 звёзд * * * * * *
public class Stars {
    public static void main(String[] args) {
        int rows = 4;
        int cols = 6;

        // Нарисуй прямоугольник из '*'
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < cols; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}