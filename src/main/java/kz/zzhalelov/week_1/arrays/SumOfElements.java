package kz.zzhalelov.week_1.arrays;

//Создай массив int[] numbers = {1, 2, 3, 4, 5}.
//Выведи сумму всех элементов.
public class SumOfElements {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int result = 0;
        for (int i = 0; i <= nums.length; i++) {
            result += i;
        }
        System.out.println(result);
    }
}