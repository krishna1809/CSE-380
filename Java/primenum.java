// prime number program
import java.util.Scanner;

class primenum
{
public static void main(String[] args)
{
Scanner scan= new Scanner (System.in);
int n,x=0;
System.out.print("Enter n value: ");
n=scan.nextInt();
for(int i=2;i<n;i++)
{
	if(n%i==0)
	{
		System.out.print("Not Prime Number");
		x=1;
		break;
	}
	
}
if(x==0)
{
	System.out.print("Prime Number");
}
}}