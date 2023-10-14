//create a class with the name student declare the varables:rollno,name,marks of 3 subjects calculate of percentage of 
// student
// if percentage is > 90:O,>80:A,>70:B,>60:C,<50:fail

import java.util.Scanner;

class marks
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int rollno,m1,m2,m3,tol;
String name;
double perc;
System.out.print("Enter Name of student:");
name=obj.nextLine();
System.out.print("Enter Rollno of student:");
rollno=obj.nextInt();
System.out.println("Enter 3 subject marks of student:");
System.out.print("Subject 1:"); m1=obj.nextInt();
if(m1>100)
{
System.out.print("Invaild marks.Please enter again");
System.out.print("Subject 1:"); m1=obj.nextInt();
}
System.out.print("Subject 2:"); m2=obj.nextInt();
if(m2>100)
{
System.out.print("Invaild marks.Please enter again");
System.out.print("Subject 2:"); m2=obj.nextInt();
}
System.out.print("Subject 3:"); m3=obj.nextInt();
if(m3>100)
{
System.out.print("Invaild marks.Please enter again");
System.out.print("Subject 3:"); m3=obj.nextInt();
}
tol=m1+m2+m3;
perc=(tol*100)/300;
System.out.println("Percentage of student" +perc);
if(perc>90)
{
System.out.println("O Grade");
}
else if(perc>80)
{
System.out.println("A Grade");
}
else if(perc>70)
System.out.println("B Grade");
else if(perc>60)
System.out.println("C Grade");
else 
System.out.println("FAIL");
}}