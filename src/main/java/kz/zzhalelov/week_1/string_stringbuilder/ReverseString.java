package kz.zzhalelov.week_1.string_stringbuilder;

//Разверни строку задом наперёд.
//Пример:
//"java" → "avaj"
public class ReverseString {
    public static void main(String[] args) {
        String string = "java";
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        System.out.println(sb);
    }
}