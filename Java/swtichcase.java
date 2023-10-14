//switch cases
//no float value,no repeated cases

import java.util.Scanner;

class swtichcase
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.print("Enter input either as 1 0r 2 :");
int a=obj.nextInt();
switch(a)
{
case 1:
{
System.out.print("Value passes as 1"); break;
}
case 2:
System.out.print("Value passes as 2"); break;
default:
System.out.print("Wrong input");
}}}