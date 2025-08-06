package kz.zzhalelov.week_1.if_switch_ternary;

//Реализуй простую арифметику по символу op. Добавь default: "Оператор не распознан".
public class Calculator {
    public static void main(String[] args) {
        int a = 6, b = 3;
        char op = '*';
        // switch-case по op: '+', '-', '*', '/'
        switch (op) {
            case '+':
                System.out.println(a + b);
            case '-':
                System.out.println(a - b);
            case '*':
                System.out.println(a * b);
            case '/':
                System.out.println();
            default:
                System.out.println("Оператор не распознан");
        }
    }
}