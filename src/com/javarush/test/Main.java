package com.javarush.test;

import com.javarash.test1.Converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter expression, numbers have to be from 0 to 10: ");
            String expression = scanner.nextLine();
            System.out.println(calc(expression));
        }
        public static String calc(String input) throws Exception {
            Converter converter = new Converter();
            String[] actions = {"+", "-", "/", "*"};
            String[] regexActions = {"\\+", "-", "/", "\\*"};


            int actionIndex= -1;
            for (int i = 0; i < actions.length; i++) {
                if(input.contains(actions[i])){
                    actionIndex = i;
                    break;
                }
            }
            if (actionIndex == -1) {
                throw new Exception();
            }
            String[] data = input.split(regexActions[actionIndex]);
            if(converter.isRoman(data[0]) == converter.isRoman(data[1])){
                int a,b;

                boolean isRoman = converter.isRoman(data[0]);
                if(isRoman){

                    a = converter.romanToInt(data[0]);
                    b = converter.romanToInt(data[1]);
                    if ((a < 0) || (a > 10) || (b < 0) || (b > 10)) {
                        throw new Exception();
                    }
                } else{
                    a = Integer.parseInt(data[0]);
                    b = Integer.parseInt(data[1]);
                    if ((a < 0) || (a > 10) || (b < 0) || (b > 10)) {
                        throw new Exception();
                    }
                }
                int result;
                switch (actions[actionIndex]){
                    case "+":
                        result = a+b;
                        break;
                    case "-":
                        result = a-b;
                        break;
                    case "*":
                        result = a*b;
                        break;
                    default:
                        result = a/b;
                        break;
                }
                if(isRoman){
                    if (result >= 1) {
                        return converter.intToRoman(result);
                    } else {
                        throw new Exception();
                    }
                }
                else{
                  return Integer.toString(result);
                }
            }else{
                throw new Exception();
            }
    }
}


