import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        int f=1;

        for(int i=1;i<=n;i++)

        {

            f=f*i;

        }

        System.out.println(f);

    }

}