/*
interface - area of circle and area of recangle
*/
import java.util.Scanner;
interface A
{
	void area1();
	
}
class Circle_area implements A
{
	public void area1()
	{
		Scanner scan=new Scanner(System.in);
		double pi=3.14;
		System.out.println("Enter r: ");
		double r=scan.nextDouble();
		double ar=pi*r*r;
		System.out.println("area of circle: "+ar);
	}
}
class Rectangle_area implements A
{
		public void area1()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a: ");
		double a=scan.nextDouble();
		System.out.println("Enter b: ");
		double b=scan.nextDouble();
		double ar=a*b;
		System.out.println("area of circle: "+ar);
	}
}
class interface_area
{
public static void main(String[] args)
{
Circle_area obj1=new Circle_area();
Rectangle_area obj2=new Rectangle_area();

obj1.area1();
obj2.area1();
/*
	A obj;
	obj=new Circle_area();obj.area1();
	obj=new Rectangle_area();obj.area1();
*/
}}