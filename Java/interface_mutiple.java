/*
interface - area of circle and area of recangle
multiple inhertance

import java.util.Scanner;
interface A
{
	void area1();
	
}
*/
import java.util.Scanner;
interface Circle_area 
{
	 void area_C();
}
interface Rectangle_area 
{
	 void area_R();
}
class A implements Circle_area,Rectangle_area
{
	
	public void area_C()
	{
		//Scanner scan=new Scanner(System.in);
		double pi=3.14;
		//System.out.println("Enter r: ");
		//double r=scan.nextDouble();
		double r=2;
		double ar=pi*r*r;
		System.out.println("area of circle: "+ar);
	}
	public void area_R()
	{
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Enter a: ");
		//double a=scan.nextDouble();
		double a=5;
		//System.out.println("Enter b: ");
		//double b=scan.nextDouble();
		double b=6;
		double ar=a*b;
		System.out.println("area of circle: "+ar);
	}
}
class interface_mutiple
{
public static void main(String[] args)
{
A obj=new A();

obj.area_C();
obj.area_R();
/*			
				or

	A obj;
	obj=new Circle_area();obj.area1();
	obj=new Rectangle_area();obj.area1();
*/
}}