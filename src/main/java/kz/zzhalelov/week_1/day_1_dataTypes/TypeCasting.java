package kz.zzhalelov.week_1.day_1_dataTypes;

//Объясни результат. Почему y стал отрицательным?
public class TypeCasting {
    public static void main(String[] args) {
        int x = 150;
        byte y = (byte) x;
        System.out.println(y);
    }
}