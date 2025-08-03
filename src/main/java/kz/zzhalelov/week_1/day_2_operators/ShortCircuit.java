package kz.zzhalelov.week_1.day_2_operators;

//Почему x не увеличился, несмотря на ++x?
public class ShortCircuit {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5 || ++x > 10) {    //1ое условие - true; 2ое условие - false
            x++;                    //в условие необходимо было добавить действие
        }
        System.out.println(x);
    }
}