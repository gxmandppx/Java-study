package com.mengying;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            num += str.charAt(i) - '0';
        }
        String s = String.valueOf(num);
        String[] output = {"ling", "yi", "er", "san", "si", "wu", "liu", "qi", "ba", "jiu"};
        for (int i = 0; i < s.length(); i++) {
            num = s.charAt(i) - '0';
            if (i != 0)
                System.out.print(" ");
            System.out.print(output[num]);
        }
    }
}
