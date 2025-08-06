package kz.zzhalelov.week_1.dataTypes;

//Объясни разницу в поведении num и sb.
public class ReferenceVsPrimitive {
    public static void main(String[] args) {
        int num = 5;
        StringBuilder sb = new StringBuilder("Hello");

        change(num, sb);

        System.out.println(num); // 5
        System.out.println(sb);  // Hello World
    }

    static void change(int n, StringBuilder s) {
        n += 10;
        s.append(" World");
    }
}