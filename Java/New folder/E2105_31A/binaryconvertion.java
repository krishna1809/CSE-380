import java.util.Scanner;

class convert
{
	void display(int data)
	{
		int num=data;
		int deci=0;
		
		int base=1;
		
		int n=num;
		while(n!=0)
		{
			int ld=n%10;
			n=n/10;
			deci += ld*base;
			base=base*2;
		}
		System.out.print("The decimal is ="+deci);
}
}

class binaryconvertion
{
public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number");
		int data=scan.nextInt();
		convert obj=new convert();
		obj.display(data);
	}
}
		