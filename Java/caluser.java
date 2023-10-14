// take two values from user and performe add,mul,div, and sub

import java.util.Scanner;

class caluser
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int a,b,sum,div,mul,sub;

System.out.print("Enter value of a=");
a=obj.nextInt();
System.out.print("Enter value of b=");
b=obj.nextInt();
sum=a+b;
sub=a-b;
div=a/b;
mul=a*b;
System.out.println("Addition=" + sum);
System.out.println("sub=" + sub);
System.out.println("multiplition=" + mul);
System.out.println("division=" + div);
}}