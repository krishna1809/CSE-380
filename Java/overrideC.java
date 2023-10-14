//overriding concept in inheritance

class A
{
	void show()
	{
	System.out.println("Class A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Class B");
	}
}
class overrideC
{
public static void main(String[] args)
{	
B obj=new B(); 
obj.A->show();
obj.show();
}
}