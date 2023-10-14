class A
{
String a="Hello";
 A()
{
	System.out.println(a);
}
}

class B extends A
{
String a="World";
 B()
{
	super();//Hello
	System.out.println(a);// World
	//System.out.println(super.a);// Hello
}
}

class superM13
{
public static void main(String[] args)
{
B obj=new B();
//obj.show();
}}
