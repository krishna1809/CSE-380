/*
declare the class Student and store the values of 5 students for (rollno,name, and address) 
and print those values also
*/

import java.util.Scanner;

class student452
{
public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
int rl[]=new int[2];
String name[]=new String[2];
String address[]=new String[2];

for(int i=0;i<2;i++)
{
	System.out.println("\nEnter Student "+(i+1)+" Details");
	System.out.println("Enter rollno:");
	//rl[i]=scan.nextInt();
	rl[i]=Integer.parseInt(scan.nextLine());
	System.out.println("Enter name:");
	name[i]=scan.nextLine();
	//name[i]=scan.nextLine();		//if it is next() then one line is enough
	System.out.println("Enter address:");
	address[i]=scan.nextLine();
	//System.out.println("\nNext entry\n");
}
System.out.println("\nDisplay");
for(int i=0;i<2;i++)
{
	System.out.println("\nStudent "+(i+1)+" Details:");
	System.out.println("rollno:"+rl[i]);
	System.out.println("name:"+name[i]);
	System.out.println("address:"+address[i]);
}
}}