/*
decalre a class student that is abstract class with abstract void input()
take input : rollno, name using fn input() & print the value using void print()
*/
import java.util.Scanner;
abstract class Student
{
	int rollno;
	String name;
	abstract void input();
}

class A extends Student
{
	Scanner scan=new Scanner(System.in);
	void input()
	{
		System.out.print("Enter Roll no.: "); 
		rollno=scan.nextInt();
		System.out.print("Enter Name: "); 
		name=scan.next();
	}
	void print()
	{
		System.out.println("Roll no.: "+rollno);
		System.out.print("Name: "+name); 
	}
}

class Student_Abstract
{
public static void main(String[] args)
{
A obj=new A();
obj.input();obj.print();
}}