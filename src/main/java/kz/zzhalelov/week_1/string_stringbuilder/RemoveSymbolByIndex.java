package kz.zzhalelov.week_1.string_stringbuilder;

//С помощью StringBuilder удали символ по заданному индексу (например, 3-й).
public class RemoveSymbolByIndex {
    public static void main(String[] args) {
        String string = "Hello World";
        StringBuilder sb = new StringBuilder(string);
        sb.deleteCharAt(5);
        System.out.println(sb);
    }
}