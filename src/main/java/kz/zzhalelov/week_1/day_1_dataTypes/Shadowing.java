package kz.zzhalelov.week_1.day_1_dataTypes;

//Что произойдет? Почему? Как исправить ошибку и при этом вывести 30?
// int x не должно дублироваться.
public class Shadowing {
    static int x = 100;

    public static void main(String[] args) {
        int x = 50;
        {
//            int x = 30; ошибка была здесь
            x = 30;
            System.out.println(x);
        }
    }
}