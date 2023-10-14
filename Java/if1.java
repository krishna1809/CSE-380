//conditional statements
//if,if else,nested if else, switch

import java.util.Scanner;
class if1
{
public static void main(String[] args)
{
//int a=10;
int a;
Scanner obj=new Scanner(System.in);
System.out.print("Enter a value=");
a=obj.nextInt();
if (a<0)
{
System.out.println("negative number");
System.out.println("inside if block");
}
else{
System.out.println("positive number");
System.out.println("inside else block");
}
}}