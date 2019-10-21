package javaErrorAndExceprions;

import com.sun.org.apache.xml.internal.utils.WrongParserException;

import java.io.*;
import java.sql.SQLOutput;

/**
 * @author Nikolai
 */

public class readingFileInformation {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        File f1 = new File("input.txt");
        String[] words = null;
        FileReader fr = null;
        try {
            fr = new FileReader(f1);
        } catch (FileNotFoundException e) {
            System.out.println("It seems the required file is missing");;
        }
        BufferedReader br = new BufferedReader(fr);
        String s = " ";
        Double input = 0.0;
        int count = 0;


        while(true)
        {

            try {
                if (!((s = br.readLine()) != null))
                    break;
            } catch (IOException e) {
                System.out.println("The file does not contain any other input data");
            }

            words = s.split(" ");

            for (String word : words)
            { try {
                input = Double.parseDouble(word);
            } catch (WrongParserException e) {
                System.out.println("Input must not contain either special symbols or string format entries");
            }
                if (input.equals(input >= -1000 && input <= 1000))
                {
                    input += input;
                    count++;

                }
                else if (!input.equals(input >= -1000 && input <= 1000)) {
                    throw new IndexOutOfBoundsException("The value input range is between -1000 and 1000, " +
                            "Please do not go beyond the set range");
                }
            }
        }
        System.out.println("Total sum of input values is " + input + " Average is " + input/count);

    }

}
