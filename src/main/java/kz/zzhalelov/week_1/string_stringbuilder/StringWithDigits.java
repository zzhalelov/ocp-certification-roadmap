package kz.zzhalelov.week_1.string_stringbuilder;

//Собери строку из чисел от 1 до 100, разделённых пробелами, используя StringBuilder.
public class StringWithDigits {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}