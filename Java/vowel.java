//Whether character is vowel or consonent

import java.util.Scanner;

class vowel
{
public static void main(String[] args)
{
char chs[]={'A','E','I','O','U','a','e','i','o','u'};
int k=0;
Scanner obj= new Scanner(System.in);
System.out.print("Enter a Character :");
char ch=obj.next().charAt(0);
for (int i=0;i<10;i++)
{
	if(ch == chs[i])
	k=k+1;
}
if(k>0)
System.out.print("Character is vowel");
else
System.out.print("Character is consonent");
}}