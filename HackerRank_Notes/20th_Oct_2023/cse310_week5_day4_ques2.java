import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        

        

        int n = scan.nextInt();

        scan.nextLine(); 

        

           String[] array = new String[n];

        for (int i = 0; i < n; i++) {

            array[i] = scan.next();

        }

        

   
        int stringCount = 0;

        int integerCount = 0;

        for (int i = 0; i < n; i++) {

            if (isInteger(array[i])) {

                integerCount++;

            } else {

                stringCount++;

            }

        }

        

      System.out.println(integerCount);

        System.out.println(stringCount);

    }

    

   

    private static boolean isInteger(String s) {

        try {

            Integer.parseInt(s);

            return true;

        } catch (NumberFormatException e) {

            return false;

        }

    }

}