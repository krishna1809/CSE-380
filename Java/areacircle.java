//area of circle
import java.util.Scanner;

class areacircle
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
/*float pi=3.14f,r,area;

System.out.print("Enter Radius of circle="); r=obj.nextFloat();
area=pi*r*r;
System.out.print("Area of Circle =" + area);*/
int r;
double pi=3.14,area;

System.out.print("Enter Radius of circle="); r=obj.nextInt();
area=pi*r*r;
System.out.print("Area of Circle =" + area);
}}