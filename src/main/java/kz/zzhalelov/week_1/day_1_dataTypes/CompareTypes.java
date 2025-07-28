package kz.zzhalelov.week_1.day_1_dataTypes;

//Объясни разницу между == и equals() в этом контексте.
public class CompareTypes {
    public static void main(String[] args) {
        int a = 100;
        Integer b = 100;
        Integer c = new Integer(100);

        System.out.println(a == b); //true
        System.out.println(b == c); //false
        System.out.println(b.equals(c)); //true
    }
}