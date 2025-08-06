package kz.zzhalelov.week_1.string_stringbuilder;

public class Palindrome {
    public static void main(String[] args) {
        String word = "казак";

        // Приводим к одному регистру и удаляем пробелы, если есть
        String cleaned = word.toLowerCase().replaceAll(" ", "");

        // Разворачиваем строку
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Сравниваем
        if (cleaned.equals(reversed)) {
            System.out.println(word + " — палиндром.");
        } else {
            System.out.println(word + " — не палиндром.");
        }
    }
}