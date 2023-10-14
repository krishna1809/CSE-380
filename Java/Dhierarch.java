/*
Hierachical inheritance
*/

import java.util.Scanner;
class A	
{
int a,b;				//int a=5,b=10;
Scanner scan= new Scanner(System.in);
A()
{
	
	System.out.print("Enter a: ");
	a=scan.nextInt();
	System.out.print("Enter b: ");
	b=scan.nextInt();
}
}
class B	extends A	
{
int c;							//(int c=a+b; ) computation should in function only if it not main
void sum()
{
	c=a+b;
	System.out.println("Sum is:"+c);
}
}
class C extends A
{
	void mul()
	{
		int mu=a*b;
		System.out.println("Mul is:"+mu);
	}
}
class Dhierarch
{
public static void main(String[] args)
{	
B obj1=new B(); 

//obj1.getdata();
 obj1.sum();
//obj2.getdata();
C obj2=new C(); 
 obj2.mul();
}
}