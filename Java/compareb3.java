//Greater b/w three numbers

import java.util.Scanner;

class compareb3
{
public static void main(String[] args)
{
int a,b,c;
Scanner obj =new Scanner(System.in);
System.out.print("Enter value for a=");
a=obj.nextInt();
System.out.print("Enter value for b=");
b=obj.nextInt();
System.out.print("Enter value for c=");
c=obj.nextInt();
if((a>b) && (a>c))
{
System.out.print("\'a' is greater than \'b\' and \'c\'");
}
if((b>a) && (b>c))
{
System.out.print("\'b' is greater than \'a\' and \'c\'");
}
else
{
System.out.print("\'c' is greater than \'a\' and \'b\'");
}
}
}