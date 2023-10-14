//Febonacci series
// a=-1,b=1
// 	   +
// 0 1 1 2 3 5 8 13
/*
   c=a+b;
   a=b;
   b=c;
*/

import java.util.Scanner;

class febonacci
{
public static void main(String[] args)
{
Scanner obj= new Scanner (System.in);
int a,b,c=0,t=0,n;
System.out.print("Enter no. of number to print:");n=obj.nextInt();
System.out.print("Enter a&b values:");
a=obj.nextInt();
b=obj.nextInt();

while(t<n)
{
	c=a+b;
	System.out.print(c+" ");
	a=b;
	b=c;
	t++;
}
}}