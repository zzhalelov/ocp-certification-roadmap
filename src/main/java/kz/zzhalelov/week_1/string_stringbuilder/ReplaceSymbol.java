package kz.zzhalelov.week_1.string_stringbuilder;

//Замени все пробелы в строке на подчёркивания (_).
//Пример:
//"Hello world" → "Hello_world"
public class ReplaceSymbol {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s.replace(" ", "_"));
    }
}