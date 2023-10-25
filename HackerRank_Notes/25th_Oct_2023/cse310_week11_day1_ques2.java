import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        char c=scan.next().charAt(0);
        int temp;
        switch(c)
        {
            case '+':
                temp=n1+n2;
                System.out.print(temp);
                break;
            case '-':
                temp=n1-n2;
                System.out.print(temp);
                break;
            case '*':
                temp=n1*n2;
                System.out.print(temp);
                break;
            case '/':
                temp=n1/n2;
                System.out.print(temp);
                break;
            default:
                System.out.print("invalid operator");
        }
    }
}