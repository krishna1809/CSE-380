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
        int n=scan.nextInt();
        int c=0,num;
        for(int i=0;i<n;i++)
        {
            num=scan.nextInt();
            if(num>25)
                c++;
            if(num<1)
            {
                System.out.print("Invalid input");
                return;
            }
        }
        System.out.print(c);
    }
}