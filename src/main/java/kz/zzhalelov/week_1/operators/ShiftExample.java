package kz.zzhalelov.week_1.operators;

//Что делают операторы >> и <<?
public class ShiftExample {
    public static void main(String[] args) {
        int a = 8; // 0000 1000

        System.out.println(a >> 1); //4
        System.out.println(a << 2); //32
    }
}