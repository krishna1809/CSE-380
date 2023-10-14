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
	Scanner scan= new Scanner(System.in);
	void getdata()
	{
		System.out.println("Enter title and name");
		title=scan.nextLine();name=scan.nextLine();
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
	
	
	
	void display()
	{
		value=25000;
		System.out.println("painting title:"+title);
		System.out.println("painting name:"+name);
		System.out.println("painting value:"+value);
	}
}

class paintinh2
{
public static void main(String[] args)
{	
FamousPainting obj=new FamousPainting();


obj.getdata();
obj.display();

}}