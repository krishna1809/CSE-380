abstract class A
{
	abstract void show();	
}
class abstract12 extends A
{
	void show()
	{
		System.out.println("Hello");
	}
	
public static void main(String[] args)
{
A obj=new abstract12();
obj.show();
}
}