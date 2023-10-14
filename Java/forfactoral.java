//factoral of a number from user input

import java.util.Scanner;

class forfactoral
{
public static void main(String[] args)
{
int n,i,fac=1;
Scanner obj= new Scanner (System.in);
System.out.print("Enter n value:");n=obj.nextInt();
/*for(i=1;i<=n;i++)
{
fac=fac*i;
}
*/
for(i=n;i>=1;i--)
{
fac=fac*i;
}
System.out.println("Factoral of " +n+" :"+fac);
}}