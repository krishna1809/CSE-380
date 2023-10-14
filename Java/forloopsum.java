//iterative statements
//for loop
//sum of n natural numbers

import java.util.Scanner;

class forloopsum
{
public static void main(String[] args)
{
int i,sum=0,n;
Scanner obj= new Scanner (System.in);
System.out.print("Enter n value:");n=obj.nextInt();
for(i=1;i<=n;i++)
{
sum=sum+i;
}
System.out.println("Total:" +sum);
}}