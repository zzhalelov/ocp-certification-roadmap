package kz.zzhalelov.week_1.arrays;

//Сосчитай, сколько чётных чисел в массиве:
//int[] nums = {1, 4, 6, 9, 10, 13}
public class EvenNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 4, 6, 9, 10, 13};
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}