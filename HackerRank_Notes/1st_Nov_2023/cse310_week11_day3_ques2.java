import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input strings
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        // Check if the length of any string is less than 2
        if (str1.length() <= 2 || str2.length() <= 2) {
            System.out.println("Invalid Input");
        } else {
            // Convert the strings to lowercase and remove any whitespace
            str1 = str1.toLowerCase().replaceAll("\\s", "");
            str2 = str2.toLowerCase().replaceAll("\\s", "");

            // Convert the strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort the character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Check if the sorted arrays are equal
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("ANAGRAM");
            } else {
                System.out.println("NOT ANAGRAM");
            }
        }

        scanner.close();
    }
}