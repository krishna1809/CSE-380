import java.io.*;
import java.util.*;
import java.util.Arrays; 
  
public class Solution  
{  
public static void main(String args[])   
{  
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
//defining an array of type String  
String[] countries =new String [n];  
int size = countries.length;  
    for(int i=0;i<n;i++)
    {
        countries[i]=sc.next();
    }
//logic for sorting   
for(int i = 0; i<size-1; i++)   
{  
for (int j = i+1; j<countries.length; j++)   
{  
//compares each elements of the array to all the remaining elements  
if(countries[i].compareTo(countries[j])>0)   
{  
//swapping array elements  
String temp = countries[i];  
countries[i] = countries[j];  
countries[j] = temp;  
}  
}  
}  
//prints the sorted array in ascending order  
//System.out.println(Arrays.toString(countries));  
    
    for(int i=0;i<n;i++)
    {
       System.out.println(countries[i]);
    }
}  
}  