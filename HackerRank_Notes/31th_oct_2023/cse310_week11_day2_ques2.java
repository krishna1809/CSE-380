import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        if (input.length() <= 5) {
            System.out.println("Invalid Input");
        } else {
            int[] count = new int[26]; 
            
            for (char c : input.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                }
            }
            
            StringBuilder output = new StringBuilder();
            
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    output.append((char) ('a' + i)).append(count[i]);
                }
            }
            
            System.out.println(output.toString());
        }
    }
}