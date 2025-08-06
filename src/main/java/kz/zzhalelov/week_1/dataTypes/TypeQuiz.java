package kz.zzhalelov.week_1.dataTypes;

//Почему char + int работает? Что происходит на каждом этапе?
//потому что у каждого char есть числовое значение. К примеру, у 'A' это 65
//и при этом число можно преобразовать в char (через приведение типов). 66 это 'B'
public class TypeQuiz {
    public static void main(String[] args) {
        char ch = 'A';
        int result = ch + 1;
        System.out.println(result);
        System.out.println((char) result);
    }
}