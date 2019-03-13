import java.io.IOException;

/**
 * Java Fundamentals: 1. Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class Solution {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            builder.append(args[i] + " ");
        }
        String str = builder.toString();
        System.out.println("Hello " + str);
    }

}
