//switch cases //vowel or consonent
//no float value,no repeated cases

import java.util.Scanner;

class swtichcasestring
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.print("Enter input Day:");
String a=obj.next();
switch(a)
{
case "Monday":
System.out.println("It is day 1");break;
case "Tuesday":
System.out.println("It is day 2");break;
case "Wednesday":
System.out.println("It is day 3");break;
case "Thursday":
System.out.println("It is day 4");break;
case "Friday":
System.out.println("It is day 5");break;
case "Saturday":
System.out.println("It is day 6");break;
case "Sunday":
System.out.println("It is day 7");break;
default:
System.out.println("Invaild option");
}}}