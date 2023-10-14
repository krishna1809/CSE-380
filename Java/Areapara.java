// find area of rectangle using class concept with parametic passage

import java.util.Scanner;

class B
{
	double l,b;
	
	void getdata(double length,double breath)		//paramterized functions
	{
		l=length;b=breath;
	}
	void display()
	{
	System.out.print("Area of rectangle: "+l*b);		//or area =l*b;
	}
}
class Areapara
{
public static void main(String[] args)
{
	double length,breath;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter length of rectangle: ");length=scan.nextDouble();
	System.out.print("Enter breath of rectangle: ");breath=scan.nextDouble();
B obj=new B();
obj.getdata(length,breath);
obj.display();
}}