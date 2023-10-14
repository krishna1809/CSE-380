/*

*/
import java.util.Scanner;
interface A
{
	void desposit();
	void withdraw();
	void getinfo();
}
class SavingAccount implements A
{
	int amount=10000;
	int desp=0,wit=0;
	public void desposit()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter desposit amount: ");
		desp=scan.nextInt();
		amount=amount+desp;
	}
	public void withdraw()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter withdraw amount: ");
		wit=scan.nextInt();
		amount=amount-wit;
	}
	public void getinfo()
	{
		System.out.println("Current amount "+amount);
	}
}
class CheckingAccount implements A
{
	int amount=90000;
	int desp=0,wit=0;
	public void desposit()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter desposit amount: ");
		desp=scan.nextInt();
		amount=amount+desp;
	}
	public void withdraw()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter withdraw amount: ");
		wit=scan.nextInt();
		amount=amount-wit;
	}
	public void getinfo()
	{
		System.out.println("Current amount "+amount);
	}
}
class interface_bank
{
public static void main(String[] args)
{
A obj;
Scanner scan=new Scanner(System.in);
System.out.println("1. Savings account 2. CheckingAccount \n Enter you choice: ");
int n=scan.nextInt();
switch (n)
{
	
case 1://if(n==1)

	obj=new SavingAccount();
	obj.getinfo();
	System.out.println("1. desposit  2. withdraw \n Enter you choice: ");
	int j=scan.nextInt();
	if(j==1)
	{
	obj.desposit();
	}
	else if(j==2)
	{
		obj.withdraw();
	}
	obj.getinfo();
	break;

case 2://else if(n==2)

	obj=new CheckingAccount();
	obj.getinfo();
	System.out.println("1. desposit  2. withdraw \n Enter you choice: ");
	int k=scan.nextInt();
	if(k==1)
	{
	obj.desposit();
	}
	else if(k==2)
	{
		obj.withdraw();
	}
	obj.getinfo();
	break;

default://else
{
	System.out.println("Invalid input");
}
	
}}}