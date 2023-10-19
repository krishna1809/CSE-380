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
        if(n>10 && n<500)
        {
            int j=0;
            for(int i=0;i<=n;i++)
            {
                if(i%13==0 && (n%2==0))
                {
                    j=1;
                }
            }
            if(j==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}