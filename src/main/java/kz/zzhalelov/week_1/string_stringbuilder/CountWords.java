package kz.zzhalelov.week_1.string_stringbuilder;

//Сосчитай, сколько слов в строке (слова разделены пробелами).
//Пример:
//"Я изучаю Java" → 3
public class CountWords {
    public static void main(String[] args) {
        String string = "Я изучаю Java";
        String[] words = string.split(" ");
        System.out.println(words.length);
    }
}