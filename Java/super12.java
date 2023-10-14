// super keyword in java
// used to call the variable/function defined in immediate parent class
//used to avoid overriding of variable/function

class A
{
String a="Hello";
}

class B extends A
{
String a="World";
void show()
{
	System.out.println(a);// World
	System.out.println(super.a);// Hello
}
}
class super12
{
public static void main(String[] args)
{
B obj=new B();
obj.show();
}}
