/*
create a class with name person "id, name" and declare the values of these variables using constructor 
declare a class with name "employee" and calucate the salary of person.
and print all three values by calling base class constructor using super keyword.
*/

import java.util.Scanner;

class details
{
	int id;
	String name;
	Scanner scan=new Scanner(System.in);
	details()
	{
		System.out.print("Enter Id: ");
		id=scan.nextInt();
		System.out.print("Enter Name: ");
		name=scan.next();
		//name=scan.nextLine();
		
	}
}

class employee extends details
{
	int salary;
	employee()
	{
	 super();
	 System.out.print("Enter Salary: ");
	 salary=scan.nextInt();
	}
	void show()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}
}

class superCon12
{
public static void main(String[] args)
{
employee obj=new employee();
obj.show();
}}