/*
decalre a class with name"Bank" that is giving the interset to its customer.under banks-> 
SBI -> 10%
PNB -> 8%
IOB ->11%
ICICI->7%
take the principle amount from the user and caluate the interset based on the as chosen by user,
Use the appropriate the inheritance to solve this peoblem.
*/

import java.util.Scanner;

class banks
{
	double am,sbi,pnb,iob,ici;
	Scanner scan=new Scanner(System.in);
	banks()
	{
		
		System.out.print("Enter amount: ");
		am=scan.nextDouble();
	}
	void dec()
	{
		 sbi=0.1;
		 pnb=0.08;
		 iob=0.11;
		 ici=0.07;
	}
	
}

class SBI	extends banks
{
	
	void sbi()
	{
		double cal=am*sbi;
		System.out.println("The interset amount is: "+cal);
	}
}
class IOB extends SBI
{
	void iob()
	{
		double cal=am*iob;
		System.out.println("The interset amount is: "+cal);
	}
}
class PNB extends IOB
{
	void pnb()
	{
		double cal=am*pnb;
		System.out.println("The interset amount is: "+cal);
	}
}
class ICI extends PNB
{
	void ici()
	{
		double cal=am*ici;
		System.out.println("The interset amount is: "+cal);
	}
}

class IHbank2
{
public static void main(String[] args)
{
ICI obj=new ICI();
Scanner scan2=new Scanner(System.in);
System.out.println("1.SBI 2.IOB 3.PNB 4.ICICI");
System.out.println("Enter your option: ");
int ch=scan2.nextInt();
switch(ch)
{
	case 1:
	obj.dec();
	obj.sbi();
	break;
	case 2:
	obj.dec();
	obj.iob();
	break;
	case 3:
	obj.dec();
	obj.pnb();
	break;
	case 4:
	obj.dec();
	obj.ici();
	break;
	default:
	System.out.println("Invalid option");
}
}}

