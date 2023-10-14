class A
{
String a="Hello";
void show()
{
	System.out.println(a);
}
}

class B extends A
{
String a="World";
void show()
{
	super.show();//Hello
	System.out.println(a);// World
	//System.out.println(super.a);// Hello
}
}

class superM12
{
public static void main(String[] args)
{
B obj=new B();
obj.show();
}}
