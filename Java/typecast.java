//Typecasting in java
//1.implicit(Automatically) 2.explicit(user)
//implicit=> try to store smaller data type into large one

// btye<-char<-int<-long<-float<-double


import java.util.Scanner;
class typecast
{
public static void main(String[] args)
{
/*int a=9;
double b=a;  //implicit typecasting*/

double b=9.9;
int a=(int)b;
System.out.println(a);
}}