
class A
{
int a;
	A()
	{
	System.out.println("Constructor in A class");
	}
{
	System.out.println("instance intializer");
}
}
class B extends A
{
	B()
	{	
	super(); // just to indicate A constructor is called
	System.out.println("Constructor in B class");
	}

}
class instance_intilia3
{
	public static void main(String[] args)
	{
	B obj=new B();
	}
}