package java.javaFundamentals;

/**
 * Java Fundamentals. Operators: 1. Ввести число от 1 до 12. Вывести на консоль название месяца,
 * соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

public class MonthByNumber {
    public static void main(String[] args) {
        int value = 0;
        for (String inputValue : args) {
            try {
                value = Integer.parseInt(inputValue);
            }
            catch (NumberFormatException e) {
                System.out.println("Please, make the correct format digit input from 1 to 12");
            }
            helperMethod(value-1);
        }
    }

    private static void helperMethod (int value) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        try {
            System.out.println(months[value - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please, enter the digit from 1 to 12");
        }

    }
}

