//final keyword in java
// we cannnot change variable or function or classes and stops overriding function

class A
{
final int a=10;
void show()
{
a=1000;
System.out.println(a);
}}
class final12
{
public static void main(String[] args)
{
A obj=new A();
obj.show();
}}