//switch cases //vowel or consonent
//no float value,no repeated cases

import java.util.Scanner;

class swtichcasevowel
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
System.out.print("Enter character input :");
char a=obj.next().charAt(0);
switch(a)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
System.out.println(a+ " is vowel");break;
default:
System.out.println(a+" is consonent");
}}}