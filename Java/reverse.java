//reverse of a number

import java.util.Scanner;

class reverse
{
public static void main(String[] args)
{
Scanner obj= new Scanner (System.in);
int n,rem,out=0;
System.out.print("Enter n value:");
n=obj.nextInt();
while(n>0)
{
	rem=n%10;
	out=out*10+rem;
	n=n/10;
}
System.out.print("Reverse is:"+out);
}
}
