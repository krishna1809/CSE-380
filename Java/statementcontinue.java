//  continue statements

 import java.util.Scanner;
 
class statementcontinue
{
public static void main(String[] args)
{
Scanner obj= new Scanner (System.in);
int i;
for(i=0;i<10;i++)
{
if(i==6)
continue;
System.out.println(i);
}}}