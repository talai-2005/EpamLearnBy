package java.javaFundamentals;

import java.io.IOException;

/**
 * Java Fundamentals: 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg).append(" ");
        }
        String str = builder.toString();
        System.out.println("Hello " + str);
    }

}
