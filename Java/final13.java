//final keyword in java
// we cannnot change variable or function(method) or classes and stops overriding function

class A
{
 int a=10;
final void show()
{
System.out.println(a);
}}
class B extends A
{
int a=100;
void show()
{
System.out.println(a);
}
}
class final13
{
public static void main(String[] args)
{
B obj=new B();
obj.show();
}}