/*
interface
is to used to achieve abstration
only static method is allowed 
interface interfacename
{
methods;	//abstrat methods - protected
}
using keyword implements to intert the property
*/

interface A
{
	void print();
}
class Interface_1 implements A
{
	public void print()
	{
		System.out.println("This interface example");
	}
public static void main(String[] args)
{
Interface_1 obj=new Interface_1();
obj.print();
}
}