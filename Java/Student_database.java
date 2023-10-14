/*
You are tasked with designing a program to manage student data for a school.
 Each student has a name, a unique student ID, and a list of courses they are enrolled in.
 Design a Java program using abstract classes to represent this data structure.

Create an abstract class Person with properties for the name and student ID. 
Include methods for getting and setting these properties.

Create an method Enrollable for enrolling and unenrolling a student in a course.

Create a concrete class Student that extends Person and override Enrollable.
 The Student class should have an array to store enrolled courses.

Implement the methods from the Enrollable function in the Student class to allow students to enroll and unenroll from courses 
*/
import java.util.Scanner;
abstract class person
{
	int id;
	String name;
	 void get(){}
	 void set(){}
	abstract void Enroll();
	abstract void Unenroll();
}

class student extends person
{
	int count=0,max;
	Scanner scan=new Scanner(System.in);
	String[] sub={"JAVA","C++","OS","Cprog","Electronics"};
	String[] courses=new String[3];
	
	void get()
	{
		System.out.print("Enter ID: "); 
		id=scan.nextInt();
		System.out.print("Enter Name: "); 
		name=scan.next();
	}
	void Enroll()
	{
		int ch,j;
		for(int i=0;i<5;i++)
		{
			j=i+1;
		System.out.println(" Subject "+j+" "+sub[i]);
		}
		for(int i=0;i<3;i++)
		{
			j=i+1;
			System.out.print("Enter Subject "+j+": ");
			 ch=scan.nextInt();
			 String d=sub[ch-1];
			courses[i]=d;
		}
	}
	void Unenroll()
	{
		count++;
		int flag=-1,j;
		System.out.print("Did you want to change your courses, then press \'1' for yes or \'0' for no: ");
		flag=scan.nextInt();
		if(flag==1)
		{
		if(count<3)
		{
			for(int i=0;i<5;i++)
		{
			j=i+1;
		System.out.println(" Subject "+j+" "+sub[i]);
		}
		
		
		for(int i=0;i<3;i++)
		{
			j=i+1;
			System.out.print("Enter Subject "+j+": ");int ch=scan.nextInt();
			courses[i]=sub[ch-1];
		}
		}
		else
		{
			System.out.print("Your chances to change is expired");
			return;
		}
		}
	}
	void set()
	{
		int j;
		System.out.print(" ID: "+id); 
		System.out.println(" Name: "+name);
		for(int i=0;i<3;i++)
		{
			j=i+1;
		System.out.println(" Subject "+j+" "+courses[i]);
		}
	}
}
class Student_database
{
	public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter no. of Students: ");
	int s=scan.nextInt();
	int m=0;
	person obj;
	while(m<s)
	{
		int e=m+1;
		System.out.println("Student "+e+" :");
	obj=new student();
	obj.get();
	obj.Enroll();
	obj.Unenroll();
	obj.set();
	m++;
	}
}
}