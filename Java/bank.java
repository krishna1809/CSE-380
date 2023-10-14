/*declare a class ->account(accno,name,amount)
void insert () that is  fn taking values of amount, anme and amount
void deposit()->add the value to amount based on the deposit_value
void withdraw()-> deduct the withdrawn amount from the amount varible 
void display ()->accno,name and rest amount

in main section ,declare switch case to accept th efn ->deposit withdraw and display the last valueof amount
*/

import java.util.Scanner;

class A
{
	int accno,amount,current_a;
	String name;
	Scanner scan =new Scanner(System.in);
	
	void insert()
	{
	Scanner scan =new Scanner(System.in);
	System.out.print("Enter Account number: ");accno=scan.nextInt();
	System.out.print("Enter Account holder name: ");name=scan.nextLine();
	name=scan.nextLine();
	System.out.print("Enter Amount: ");amount=scan.nextInt();
	scan.close();
	current_a=amount;
	}
	
	void deposit()
	{
		int desp;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the amount to be deposit: ");desp=scan.nextInt();
		current_a=amount+desp;
		//System.out.print("Current Amount: "+current_a);
	}
	void withdraw()
	{
		int withd;
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the amount to be withdraw: ");withd=scan.nextInt();
		current_a=amount-withd;
		//System.out.print("Current Amount: "+current_a);
	}
	void display()
	{
		System.out.print("Account number: "+accno);
		System.out.print("Account holder name: "+name);
		System.out.print("Balance: "+current_a);
	}
}
class bank
{
	public static void main(String[] args)
	{
	Scanner scan =new Scanner(System.in);
	A obj2 =new A();
	//new account().insert();->annonymous object
	obj2.insert();
	
	int ch;
	System.out.println("To deposit->press 1 :");
	System.out.println("To withdraw->press 2 :");
	
	ch=scan.nextInt();
	
	
	
	switch(ch)
	{
		case 1:
		{
			obj2.deposit();
			break;
		}
		
		case 2:
		{
			obj2.withdraw();
			break;
		}
		default:
		System.out.print("Invalid option");
	}
	
}}