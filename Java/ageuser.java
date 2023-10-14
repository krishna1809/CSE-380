//identification of age of a person 

import java.util.Scanner;
class ageuser
{
public static void main(String[] args)
{
int age;
Scanner obj =new Scanner(System.in);
System.out.print("Enter your age = ");
age=obj.nextInt();
if (age>18)
{
System.out.print("Allowed for vote");
}
else
{
System.out.print("Not allowed for vote");
}
}}