/*Check whether a given integer is positive even,negative even,positive odd or negative*/

import java.util.Scanner;
class evenodd
{
public static void main(String[] args)
{
int x;
Scanner obj = new Scanner(System.in);
System.out.print("Enter a value:");
x=obj.nextInt();
/*
if(a%2==1)
{
	if(a<0)
	{
	System.out.print("The number is Negative odd");
	}
	else
	{
	System.out.print("The number is positive odd");
	}
}
else if(a%2==)
{
	if(a<0)
	{
	System.out.print("The number is Negative even");
	}
	else
	{
	System.out.print("The number is positive odd");
	}
}
*/
if((x>0) && (x%2==0))
System.out.print("The number is positive even");
else if((x>0) && (x%2!=0))
System.out.print("The number is positive odd");

if((x<0) && (x%2==0))
System.out.print("The number is negative even");
else if((x<0) && (x%2!=0))
System.out.print("The number is negative odd");
}}
