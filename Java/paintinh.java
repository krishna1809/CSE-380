/*
Create a Painting class that holds the painting title, artist name, and value. All paintings
are valued at $400.Include a display function that dispalys all fields. The FamousPainting subclass overrides
the Painting value and sets each Painting's value to $25,000.Write a main() function prompt 
the user to enter the title and artist.
*/

import java.util.Scanner;

class Painting
{
	int value=400;
	String title,name;
	void getdata(String t,String n)
	{
		title=t;name=n;
	}
	void display()
	{
		System.out.println("painting title:"+title);
		System.out.println("painting name:"+name);
		System.out.println("painting value:"+value);
	}
}

class FamousPainting extends Painting
{
	void get2()
	{
	value=25000;
	}
}

class paintinh
{
public static void main(String[] args)
{	
FamousPainting obj=new FamousPainting();
Scanner scan= new Scanner(System.in);
String ti,na;
System.out.println("Eneter title");
ti=scan.nextLine();
System.out.println("Eneter name");na=scan.nextLine();

obj.getdata(ti,na);obj.display();
System.out.println("\nAfter overriding");
obj.get2();obj.display();
}}