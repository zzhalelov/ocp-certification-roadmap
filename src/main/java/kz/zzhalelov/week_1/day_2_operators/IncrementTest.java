package kz.zzhalelov.week_1.day_2_operators;

//Чем отличается x++ от ++x? Почему такие значения x и y?
public class IncrementTest {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x; // 6 + 5 = 11
        System.out.println("x = " + x); // x = 7
        System.out.println("y = " + y); // y = 6 + 6 = 12
    }
}