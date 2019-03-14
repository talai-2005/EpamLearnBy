
/**
 * Java Fundamentals. DataTypes: 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class MaxMin {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        String minInp = " ";
        String maxInp = " ";

        for (String a : args) {
            System.out.println(a);
            if (a.length() < min) {
                min = a.length();
                minInp = a;
            }
            if (a.length() > max) {
                max = a.length();
                maxInp = a;
            }
        }
        System.out.print("Minimal entry " + minInp + " consists of " + min
                + " digits\nMaximal entry " + maxInp + " consists of " + max
                + " digits");
    }
}


