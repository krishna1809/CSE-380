import java.util.Scanner;

class detail
{
int rollno;
String name;

detail()
{
Scanner scan= new Scanner(System.in);
System.out.print("Enter rollno: ");
rollno=scan.nextInt();
System.out.print("Enter name: ");
name=scan.next();
}
void display()
{
	System.out.println("rollno: "+rollno);
	System.out.println("name: "+name);
}
}
class student12
{
public static void main(String[] args)
{
detail obj = new detail();
obj.display();
}}