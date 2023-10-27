import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class BracketGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the bracket input
        String bracketInput = scanner.nextLine();

        // Read the name input
        String name = scanner.nextLine();

        // Split the bracketInput into open and close brackets
        String openBracket = bracketInput.substring(0, bracketInput.length() / 2);
        String closeBracket = bracketInput.substring(bracketInput.length() / 2);

        // Format the name with brackets
        String output = openBracket + name + closeBracket;

        System.out.println(output);

        scanner.close();
    }
}