/*
constructor overloading

class A
{
A()//default contructor
{
}
A(int a,int b) //parametrized constructor
{}
A(int a,int b,int c)
{}
}
*/

//sum of numbers

import java.util.Scanner;
class A
{

A()//default contructor
{
int a=10, b=20;
int c=a+b;
System.out.println("sum is = "+c);
}
A(int a,int b) //parametrized constructor
{
	int c=a+b;
	System.out.println("sum is = "+c);
}
A(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println("sum is = "+d);
}
}

class C_overloading
{
public static void main(String[] args)
{
A obj1= new A();
A obj2= new A(5,6);
A obj3= new A(9,8,7);
}
}