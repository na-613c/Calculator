package com.example.calculator;


public class DataCalculation {

    public String calc(String str) {
        String inputString = str;
        // формируем массив чисел
        String numbers = inputString.replaceAll("[^0-9|.]",  "");

        // формируем массив операторов
        // сначала мы заменяем все числа и точку на пустую строку, а затем разделяем
        inputString = str;
        String operators = inputString.replaceAll("[0-9|.]", "");
        System.out.println("numbers " + numbers);
        System.out.println("operators " + operators);
        System.out.println("str " + str);

        return str;
    }
}
