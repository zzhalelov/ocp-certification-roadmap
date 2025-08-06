package kz.zzhalelov.week_1.string_stringbuilder;

//Подсчитай, сколько раз в строке встречается символ 'а'.
public class CountLetter {
    public static void main(String[] args) {
        String s = "abracadabra";
        char[] chars = s.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if (aChar == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}