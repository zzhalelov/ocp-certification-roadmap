package kz.zzhalelov.week_1.day_1_dataTypes;

//Почему компилятор ругается? Что нужно изменить, чтобы всё работало?
//Ответ: y помечена как переменная в цикле. необходимо вытащить её за пределы цикла
public class ScopeExample {
    public static void main(String[] args) {
        int y = 0;
        int x = 10;
        if (x > 5) {
            //int y = x + 5; не верно
            y = x + 5; //верно
        }
        System.out.println(y); // Ошибка?
    }
}