/*
class in java
class is oops concept holding the property of encapulation ->(wapping data members (variables) and member function)function 
inside one class

Class are accessed by object -> it is an instance of class
class student()
{
	data member;
	int a;
	.
	.
	memeber function.
	.
	.
}
class A     ->main class where we written static void main
{
public static void main(String[] args)
{
*/


class student
{
int rollno;		//instance variable
String name;		//instance variable

public static void main(String[] args)
{
student obj=new student();
obj.rollno=10;
obj.name="AA";
System.out.println(obj.rollno+" "obj.name);
}}