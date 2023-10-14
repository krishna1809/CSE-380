//find perfect

import java.util.Scanner;
 
class perfectnum
{
public static void main(String[] args)
{
int i,n,sum=0,r;
Scanner obj= new Scanner (System.in);
System.out.print("Enter n value:");
n=obj.nextInt();

r=n;
for(i=1;i<n;i++)
{
	if(n%i==0)
	{
		sum=sum+i;
	}
	
}
if(sum==r)
{
	System.out.print("Perfect");
}
else
{
	System.out.print("Not perfect");
}

}}