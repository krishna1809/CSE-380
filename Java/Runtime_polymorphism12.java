/*
runtime polymorphism

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

abstract class banks
{
	
	/*
	double am;
	Scanner scan=new Scanner(System.in);
	banks()
	{
		
		System.out.print("Enter amount: ");
		am=scan.nextDouble();
	}
	*/
	abstract void interset(double am);
	{
		
	}
	
}

class SBI extends banks
{
	
	void interset(double am)
	{
		double cal=am*0.1;
		System.out.println("The interset percentage of SBI is: 10%");
		System.out.println("The interset amount of SBI is: "+cal+"\n");
	}
}
class IOB extends banks
{
	void interset(double am)
	{
		double cal=am*0.11;
		System.out.println("The interset percentage f IOB is: 11%");
		System.out.println("The interset amount of IOB is: "+cal+"\n");
	}
}
class PNB extends banks
{
	void interset(double am)
	{
		double cal=am*0.08;
		System.out.println("The interset percentage of PNB is: 8%");
		System.out.println("The interset amount of PNB is: "+cal+"\n");
	}
}
class ICI extends banks
{
	void interset(double am)
	{
		double cal=am*0.07;
		System.out.println("The interset percentage of ICICI is: 7%");
		System.out.println("The interset amount of ICICI is: "+cal+"\n");
	}
}

class Runtime_polymorphism12
{
public static void main(String[] args)
{	
	/*SBI obj1;
	obj1=new banks();		*/	//error: incompatible types: banks cannot be converted to SBI
	double am;
	Scanner scan=new Scanner(System.in);	
		System.out.print("Enter amount: ");
		am=scan.nextDouble();
	banks obj;
		obj=new SBI();
	obj.interset(am);
		obj=new IOB();
	obj.interset(am);
		obj=new PNB();
	obj.interset(am);
		obj=new ICI();
	obj.interset(am);
}
}

