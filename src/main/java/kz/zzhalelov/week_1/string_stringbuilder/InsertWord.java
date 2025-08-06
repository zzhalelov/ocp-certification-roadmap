package kz.zzhalelov.week_1.string_stringbuilder;

//Вставь строку "HELLO" в середину другой строки с помощью StringBuilder.
public class InsertWord {
    public static void main(String[] args) {
        String string = "Hello World";
        StringBuilder sb = new StringBuilder(string);

        // Вставим "HELLO" в середину строки
        int middle = sb.length() / 2;
        sb.insert(middle, "HELLO");

        System.out.println(sb);
    }
}