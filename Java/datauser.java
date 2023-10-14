// take two values from user values are differnt data types

import java.util.Scanner;

class datauser
{
public static void main(String[] args)
{
Scanner obj=new Scanner(System.in);
int a;
float c;
double d;
String s;
char ch,ch2;

System.out.print("Enter interger value (a)="); a=obj.nextInt();
System.out.print("Enter float value (c)="); c=obj.nextFloat();
System.out.print("Enter double value (d)="); d=obj.nextDouble();
System.out.print("Enter String value(s)="); s=obj.next();
System.out.print("Enter Character Value(ch)="); ch=obj.next().charAt(0);
System.out.print("Enter Character Value(ch2)="); ch2=obj.next().charAt(1);
System.out.println(ch);
System.out.println(ch2);
}}