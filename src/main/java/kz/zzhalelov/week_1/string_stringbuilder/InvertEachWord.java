package kz.zzhalelov.week_1.string_stringbuilder;

//Дано предложение:
//"Java is powerful"
//Выведи:
//"avaJ si lufrewop"
public class InvertEachWord {
    public static void main(String[] args) {
        String string = "Java is powerful";
        String[] words = string.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            sb.append(reversedWord).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}