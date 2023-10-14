/*student
name ,rollno,sub1,sub2,sub3(input from user)
calculate %
>90 =O*
>80 =A
>70 =B
>60 =C
<50=D */


import java.util.Scanner;

class switchmarks
{
public static void main(String[] args)
{
Scanner obj = new Scanner(System.in);
int rollno,m1,m2,m3,tol,choice=0;
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
System.out.println("Invaild marks.Please enter again");
System.out.print("Subject 1:"); m1=obj.nextInt();
}
System.out.print("Subject 2:"); m2=obj.nextInt();
if(m2>100)
{
System.out.println("Invaild marks.Please enter again");
System.out.print("Subject 2:"); m2=obj.nextInt();
}
System.out.print("Subject 3:"); m3=obj.nextInt();
if(m3>100)
{
System.out.println("Invaild marks.Please enter again");
System.out.print("Subject 3:"); m3=obj.nextInt();
}
tol=m1+m2+m3;
perc=(tol*100)/300;
System.out.println("Percentage of student:" +perc);
if(perc>90)
{

choice=1;
}
else if(perc>80)
{

choice=2;
}
else if(perc>70)
{

choice=3;
}
else if(perc>60)
{

choice=4;
}
else
{ 

choice=5;
}

switch(choice)
{
case 1:
System.out.println("O Grade");break;
case 2:
System.out.println("A Grade");break;
case 3:
System.out.println("B Grade");break;
case 4:
System.out.println("C Grade");break;
default:
System.out.println("FAIL");

}}}