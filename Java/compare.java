//Greater b/w two numbers

import java.util.Scanner;

class compare
{
public static void main(String[] args)
{
int a,b;
Scanner obj =new Scanner(System.in);
System.out.print("Enter value for a=");
a=obj.nextInt();
System.out.print("Enter value for b=");
b=obj.nextInt();
if(a>b)
{
System.out.print("\'a' is greater than \'b'");
}
else
{
System.out.print("\'b' is greater than \'a'");
}
}
}