package kz.zzhalelov.week_1.day_2_operators;

//Что делает оператор ! и как изменить условие, чтобы вывести "Access granted"?
public class NegationTest {
    public static void main(String[] args) {
        boolean loggedIn = true;

        if (!loggedIn) {
            System.out.println("Access denied");
        } else {
            System.out.println("Access granted");
        }
    }
}