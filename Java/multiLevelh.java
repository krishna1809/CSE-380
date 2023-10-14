import java.util.Scanner;
class A	//base class->parent class
{
	int a,b;
	Scanner scan= new Scanner(System.in);
void getdata()
{
	
	System.out.print("Enter a: ");
	a=scan.nextInt();
	System.out.print("Enter b: ");
	b=scan.nextInt();
}
}
class B	extends A//derived class -> child class
{
	int c;
	void sum()
{
	int sum=a+b;
	System.out.println("Sum of a+b is: "+sum);
}
void get()
{
	System.out.print("Enter c: ");
	c=scan.nextInt();
}
}
class C extends B
{
	void tot()
	{
		int t=a+b+c;
		System.out.print("Total: "+t);
	}
}
class multiLevelh
{
public static void main(String[] args)
{	
C obj=new C();
obj.getdata();obj.sum();obj.get();obj.tot(); 

}
}