package kz.zzhalelov.week_1.arrays;

import java.util.Arrays;

//Дан массив int[] arr = {3, -1, 5, -2, 0}.
//Выведи новый массив только с положительными элементами и нулями.
public class RemoveNegativeElements {
    public static void main(String[] args) {
        int[] arr = {3, -1, 5, -2, 0};
        int sumPos = 0;
        for (int j : arr) {
            if (j >= 0) {
                sumPos++;
            }
        }
        int[] newArr = new int[sumPos];
        int index = 0;
        for (int j : arr) {
            if (j >= 0) {
                newArr[index] = j;
                index++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}