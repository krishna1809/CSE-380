//number is leap year or not?

import java.util.Scanner;

class leapyear
{
public static void main(String[] args)
{
Scanner obj= new Scanner(System.in);
int year;
System.out.print("Enter year :"); year=obj.nextInt();
if(((year%4==0) && (year%100!=0)) ||(year%400==0))
System.out.print("It's a Leap year");
else
System.out.print("It's a not Leap year");
}}