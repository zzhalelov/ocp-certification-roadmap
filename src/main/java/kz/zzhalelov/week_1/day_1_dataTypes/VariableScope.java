package kz.zzhalelov.week_1.day_1_dataTypes;

//Что выведет программа? Почему?
// выведет только 10 из метода main. Метод printX не вызывается в этом коде
public class VariableScope {
    static int x = 5;

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

    }

    public static void printX() {
        System.out.println(x);
    }
}