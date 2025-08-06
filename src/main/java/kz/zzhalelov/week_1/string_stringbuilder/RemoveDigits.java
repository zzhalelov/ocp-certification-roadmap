package kz.zzhalelov.week_1.string_stringbuilder;

//Удалить из строки все цифры, оставив только буквы и пробелы.
//"Java123 is fun45" → "Java is fun"
public class RemoveDigits {
    public static void main(String[] args) {
        String string = "Java123 is fun45";
        StringBuilder sb = new StringBuilder(string);
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isDigit(sb.charAt(i))) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}