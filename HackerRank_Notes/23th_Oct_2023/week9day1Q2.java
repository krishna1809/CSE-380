import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;
class A
{
   int id;
    String s;Scanner scan=new Scanner(System.in);
        void getinfo()
        {
            id=scan.nextInt();s=scan.next();
        }
    void print()
    {
        System.out.print(id+" "+s);
    } 
}
public class Solution {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        A obj=new A();
        obj.getinfo();
        obj.print();
    }
}