import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class WordFormationActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the words spoken by the participants
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        // Check if the words are of minimum length 3
        if (word1.length() < 3 || word2.length() < 3) {
            System.out.println("ERROR");
        } else {
            // Check if the starting 3 characters of word1 match the ending three characters of word2 in reverse order
            if (word1.substring(0, 3).equals(new StringBuilder(word2.substring(word2.length() - 3)).reverse().toString())) {
                System.out.println("GREAT");
            } else {
                System.out.println("TRY NEXT TIME");
            }
        }

        scanner.close();
    }
}