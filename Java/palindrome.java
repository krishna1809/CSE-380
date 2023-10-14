//palindrome

import java.util.Scanner;

class palindrome
{
public static void main(String[] args)
{
Scanner obj= new Scanner (System.in);
int n,y=0,rem,c;
System.out.print("enter n value:");n=obj.nextInt();
c=n;
while(n>0)
{
rem=n%10;
y=y*10+rem;
n=n/10;
}

System.out.println(y);
System.out.println(n);
if(c==y)
{
System.out.println("It is a palindrome");
}
else{
System.out.println("it is not a palindrome");}
}}