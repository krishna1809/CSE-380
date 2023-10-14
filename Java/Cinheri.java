/*
inheritance
1. single 
2. multiLevel
3. multiple	->not implement in java with extends keyword but using interface concept
4. Herarchical
5. Hybrid

this program Single
*/
import java.util.Scanner;
class A	//base class->parent class
{
int a,b;				//int a=5,b=10;
Scanner scan= new Scanner(System.in);
void getdata()
{
	
	System.out.print("Enter a: ");
	a=scan.nextInt();
	System.out.print("Enter b: ");
	b=scan.nextInt();
}
}
class B	extends A	//derived class -> child class
{
int c;							//(int c=a+b; ) computation should in function only if it not main
void sum()
{
	c=a+b;
	System.out.println("Sum is:"+c);
}
}
class Cinheri
{
public static void main(String[] args)
{	
B obj=new B(); 
obj.getdata(); obj.sum();
}
}