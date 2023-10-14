// used to call the variable/function defined in immediate parent class
class A
{
String a="Hello";
}

class B extends A
{
String a="World";
void show2()
{
	System.out.println(a);// World
	System.out.println(super.a);// Hello
}
}
class C extends B
{
String a="Hi";
void show3()
{
	System.out.println(a);// Hi
	System.out.println(super.a);// World
}
}

class super13
{
public static void main(String[] args)
{
C obj=new C();
obj.show2();
obj.show3();
}}
