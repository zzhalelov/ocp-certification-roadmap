package kz.zzhalelov.week_1.operators;

public class LogicalTest {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); // -И- если одно условие false, то и вся конструкция даст false
        System.out.println(a || b); // -ИЛИ- если одно условие true, то и вся конструкция даст true
    }
}